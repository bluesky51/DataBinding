package com.sky.databinding.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sky.databinding.BR;
import com.sky.databinding.bean.Person;
import com.sky.databinding.R;
import com.sky.databinding.adapter.CommonAdapter;
import com.sky.databinding.databinding.FragmentContentBinding;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContentFragment extends Fragment {


    String[] imgs = new String[]{
            "http://pic1.win4000.com/wallpaper/4/510f446941311.jpg",
            "http://c.hiphotos.bdimg.com/album/w%3D2048/sign=10a72dd37af40ad115e4c0e3631413df/f7246b600c338744f1243597500fd9f9d62aa073.jpg",
            "http://pic.qiantucdn.com/58pic/18/31/15/30A58PICNP4_1024.jpg",
            "http://pic64.nipic.com/file/20150415/11284670_192755380000_2.jpg",
            "http://img.pconline.com.cn/images/upload/upc/tx/wallpaper/1307/30/c0/23934263_1375169304679.jpg",
            "http://img.article.pchome.net/00/52/79/50/pic_lib/s960x639/3s960x639.jpg",
            "http://pic.58pic.com/58pic/14/25/57/07i58PICrFE_1024.jpg",
            "http://pic.58pic.com/58pic/12/74/06/16k58PICHBc.jpg",
            "http://img4.duitang.com/uploads/item/201509/28/20150928193800_Z4Jdv.jpeg",
            "http://pic.58pic.com/58pic/13/19/24/62w58PICqhd_1024.jpg"
    };

    public ContentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentContentBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_content, container, false);
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < imgs.length; i++) {
            Person p2 = new Person();
            p2.setName("用户" + i);
            p2.setIcon(imgs[i]);
            personList.add(p2);
        }
        CommonAdapter<Person> personCommonAdapter = new CommonAdapter<>(getActivity(), personList, R.layout.item_listview, BR.person);
        binding.setAdapter(personCommonAdapter);
        return binding.getRoot();
    }

}
