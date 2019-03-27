package com.x_meteor.mvvm_demo.base;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * @author: X_Meteor
 * @description: 类描述
 * @version: V_1.0.0
 * @date: 2018/11/23 14:01
 * @company:
 * @email: lx802315@163.com
 */
public abstract class BaseMvvmRecyAdapter<T> extends RecyclerView.Adapter {

    public LayoutInflater inflater;
    public int layoutId;
    public int variableId;
    public List<T> list;
    public Context mContext;

    public BaseMvvmRecyAdapter(Context mContext, List<T> list, int layoutId) {
        this.layoutId = layoutId;
        this.list = list;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater = LayoutInflater.from(mContext);
        ViewDataBinding binding = DataBindingUtil.inflate(inflater, layoutId, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MyViewHolder) {
            MyViewHolder holder1 = (MyViewHolder) holder;
            holder1.getBinding().setVariable(layoutId, list.get(position));
            holder1.getBinding().executePendingBindings();
            convert(holder1, list.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    protected abstract void convert(MyViewHolder helper, T item);

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private ViewDataBinding binding;

        public MyViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public ViewDataBinding getBinding() {
            return this.binding;
        }
    }
}
