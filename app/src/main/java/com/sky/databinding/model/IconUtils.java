package com.sky.databinding.model;

import android.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.makeramen.roundedimageview.RoundedImageView;
import com.sky.databinding.R;

/**
 * Created by bluesky on 16/11/1.
 */

public class IconUtils {
    @BindingAdapter({"imageUrl"} )
    public  static void loadImage(RoundedImageView imageView, String url){
       if (url==null){
           imageView.setImageResource(R.mipmap.ic_launcher);
       }else{
           Glide.with(imageView.getContext()).load(url)
                   .placeholder(R.mipmap.ic_launcher)
                   .into(imageView);
       }
    }
}
