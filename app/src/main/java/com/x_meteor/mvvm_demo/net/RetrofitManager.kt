package com.x_meteor.mvvm_demo.net

import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.x_meteor.mvvm_demo.constants.Constants
import com.x_meteor.mvvm_demo.utils.LogUtils
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException
import java.util.concurrent.TimeUnit

/**
 * @author: X_Meteor
 * @description: 类描述
 * @version: V_1.0.0
 * @date: 2018/11/20 14:49
 * @company:
 * @email: lx802315@163.com
 */
object RetrofitManager {

    private val TIMEOUT: Long = 30

    // Retrofit是基于OkHttpClient的，可以创建一个OkHttpClient进行一些配置
    private val httpClient = OkHttpClient.Builder()
        // 添加通用的Header
        .addInterceptor { chain ->
            val builder = chain.request().newBuilder()
            chain.proceed(builder.build())
        }
        /**
         * 这里可以添加一个HttpLoggingInterceptor，因为Retrofit封装好了从Http请求到解析，
         * 出了bug很难找出来问题，添加HttpLoggingInterceptor拦截器方便调试接口
         **/
        .addInterceptor(HttpLoggingInterceptor(HttpLoggingInterceptor.Logger { message ->
            LogUtils.print("OkHttp调试", message)
        }).setLevel(HttpLoggingInterceptor.Level.BODY))
        .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
        .writeTimeout(TIMEOUT, TimeUnit.SECONDS)
        .readTimeout(TIMEOUT, TimeUnit.SECONDS)
        .build()

    private object RetrofitManagerInstance {

        val RETROFITMANAGERINSTANCE = Retrofit.Builder()
            //设置baseUrl
            .baseUrl(Constants.BASE_URL)
            // 添加Gson转换器
            .addConverterFactory(GsonConverterFactory.create(buildGson()))
            // 添加Retrofit到RxJava的转换器
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(httpClient)
            .build()
            .create(ApiService::class.java)

    }

    fun getInstance(): ApiService {
        return RetrofitManagerInstance.RETROFITMANAGERINSTANCE
    }

    private fun buildGson(): Gson {
        return GsonBuilder()
            .serializeNulls()
            .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
            //                // 此处可以添加Gson 自定义TypeAdapter
            //                .registerTypeAdapter(UserInfo.class, new UserInfoTypeAdapter())
            .create()
    }
}