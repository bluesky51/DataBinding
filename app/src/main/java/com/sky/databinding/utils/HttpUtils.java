package com.sky.databinding.utils;

import android.util.Log;

import com.sky.databinding.BR;
import com.sky.databinding.R;
import com.sky.databinding.adapter.RecyclerCommonAdapter;
import com.sky.databinding.apiservice.EssayCallBack;
import com.sky.databinding.bean.Essay;
import com.sky.databinding.databinding.ActivityDetailBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by bluesky on 16/11/2.
 */

public class HttpUtils {
    public static void loadTextData(final ActivityDetailBinding dataBinding, String baseUrl) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create()).build();
        try {
            EssayCallBack call = retrofit.create(EssayCallBack.class);
            Call<Essay> essayCall = call.getEssayList("1", "20", "0", "1");
            essayCall.enqueue(new Callback<Essay>() {
                @Override
                public void onResponse(Call<Essay> call, Response<Essay> response) {

                    Log.e("=====", "==onResponse====");

                    RecyclerCommonAdapter adapter = new RecyclerCommonAdapter(response.body().getData(),
                            dataBinding.getRoot().getContext(),
                            R.layout.item_recyclerview, BR.dateBean);
                    dataBinding.setAdapter(adapter);
                }

                @Override
                public void onFailure(Call<Essay> call, Throwable t) {

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

