package com.sky.databinding.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sky.databinding.bean.Essay;

import java.util.List;

/**
 * Created by bluesky on 16/11/2.
 */

public class RecyclerCommonAdapter extends
        RecyclerView.Adapter<RecyclerCommonAdapter.MyViewHolder> {


    private List<Essay.DataBean> essayList;
    private Context ctx;
    private int layoutId;//item布局的id
    private int variableId;//变量的id
    LayoutInflater inflater;

    public RecyclerCommonAdapter(List<Essay.DataBean> essayList, Context context, int layoutId, int variableId) {
        this.essayList = essayList;
        this.ctx = context;
        this.layoutId = layoutId;
        this.variableId = variableId;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(inflater, layoutId, parent, false);
        View view = binding.getRoot();
        MyViewHolder myViewHolder = new MyViewHolder(view);
        myViewHolder.setViewDataBinding(binding);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.getViewDataBinding().setVariable(variableId, essayList.get(position));
        ////当数据改变时，binding会在下一帧去改变数据，如果我们需要立即改变，就去调用executePendingBindings方法。
        holder.getViewDataBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return essayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding viewDataBinding;

        public MyViewHolder(View itemView) {
            super(itemView);
        }

        public ViewDataBinding getViewDataBinding() {
            return viewDataBinding;
        }

        public void setViewDataBinding(ViewDataBinding viewDataBinding) {
            this.viewDataBinding = viewDataBinding;
        }
    }
}
