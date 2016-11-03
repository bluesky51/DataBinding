package com.sky.databinding.bean;

import android.content.Context;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import com.sky.databinding.BR;
import com.sky.databinding.activity.DetailActivity;

/**
 * Created by bluesky on 16/10/31.
 */


public class Person extends BaseObservable {
    String name;
    String gender;
    int age;
    boolean isVip;
    private String icon;

    public Person(String name, String gender, int age, boolean isVip, String icon) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.isVip = isVip;
        this.icon = icon;
    }

    public Person() {
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    public void clickName(View view) {
        Context context = view.getContext();
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra("name",name);
        context.startActivity(intent);

    }

//    public void itemClickName(View view) {
//        setName(getName() + "已点击");
//        Toast.makeText(view.getContext(), "已点击", Toast.LENGTH_LONG).show();
//
//    }
//
//    public boolean longClickName(View view) {
//        Toast.makeText(view.getContext(), "长按用户名：" + name, Toast.LENGTH_LONG).show();
//        return true;
//    }
}
