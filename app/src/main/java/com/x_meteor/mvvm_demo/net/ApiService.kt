package com.x_meteor.mvvm_demo.net

import com.x_meteor.mvvm_demo.model.GankModel
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Url

/**
 * @author: X_Meteor
 * @description: 类描述
 * @version: V_1.0.0
 * @date: 2018/11/20 15:06
 * @company:
 * @email: lx802315@163.com
 */
interface ApiService {
    /**
     * 今天干货
     */
    @GET("today")
    fun getTodayData(): Observable<GankModel>

    @GET("data/all/{count}/{pages}")
    fun getAllGankData(@Path("count") count: Int, @Path("pages")  pages: Int): Observable<GankModel>
}