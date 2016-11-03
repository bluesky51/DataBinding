package com.sky.databinding.apiservice;

import com.sky.databinding.bean.Essay;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by bluesky on 16/11/2.
 */

public interface EssayCallBack {
    @POST("v1/post/list")
    Call<Essay> getEssayList(
            @Query("orider_dir") String orider_dir,
            @Query("page_size") String page_size,
            @Query("page") String page,
            @Query("order_by") String order_by
    );
}
