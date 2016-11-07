package com.best.frag;

import android.view.View;

import com.best.beautyshiyi.R;
import com.best.util.LocalImageHolderView;
import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.huangj.huangjlibrary.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2016/11/fifth.
 */
public class MineFragment extends BaseFragment {
    //头部广告栏
    private ConvenientBanner convenientBanner;
    private List<Integer> localImages = new ArrayList<>();


    @Override
    public int getContentId() {
        return R.layout.carousel_vp;

    }

    @Override
    protected void init(View view) {
        localImages.add(R.drawable.s1);
        localImages.add(R.drawable.s2);
        localImages.add(R.drawable.s3);
        localImages.add(R.drawable.s4);
        localImages.add(R.drawable.s5);
        localImages.add(R.drawable.s6);
        localImages.add(R.drawable.s7);

        convenientBanner = (ConvenientBanner)
                view.findViewById(R.id.convenientBanner_showGoods);
        //本地图片例子
        convenientBanner.setPages(
                new CBViewHolderCreator<LocalImageHolderView>() {
                    @Override
                    public LocalImageHolderView createHolder() {
                        return new LocalImageHolderView();
                    }
                }, localImages)
                //设置两个点图片作为翻页指示器，不设置则没有指示器，可以根据自己需求
                .setPageIndicator(new int[]{R.mipmap.icon_rdot,
                        R.mipmap.icon_red_point})
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL);

        convenientBanner.startTurning(3000);

    }

}
