package com.sky.databinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.sky.databinding.R;
import com.sky.databinding.databinding.ActivityDetailBinding;
import com.sky.databinding.utils.HttpUtils;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("=====", "==onCreate====");
        ActivityDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        HttpUtils.loadTextData(binding,"http://api.menghuoapp.com/");
    }
}
