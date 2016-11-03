package com.sky.databinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sky.databinding.R;
import com.sky.databinding.databinding.ActivityRecyclerViewDetailBinding;

public class RecyclerViewDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRecyclerViewDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view_detail);
        String path = getIntent().getStringExtra("url");
        binding.setUrlPath(path);
    }
}
