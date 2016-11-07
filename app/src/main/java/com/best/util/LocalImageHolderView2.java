package com.best.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.best.beautyshiyi.R;
import com.best.entity.BannerItem;
import com.bigkoo.convenientbanner.holder.Holder;


/**
 * Created by Sai on 15/8/4.
 * 本地图片Holder例子
 */
public class LocalImageHolderView2 implements Holder<BannerItem> {
    private View view;
    @Override
    public View createView(Context context) {
        view = LayoutInflater.from(context).inflate(R.layout.banner_item, null, false);
        return view;
    }


    @Override
    public void UpdateUI(Context context, final int position, BannerItem data) {
        ImageView imageView = (ImageView) view.findViewById(R.id.sdv_background);
        TextView tv = (TextView) view.findViewById(R.id.tv_title);
        imageView.setImageResource(data.getImage());
        tv.setText(data.getTitle());
    }
}
