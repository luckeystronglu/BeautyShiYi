package com.best.frag;

import android.view.View;

import com.best.beautyshiyi.R;
import com.best.entity.BannerItem;
import com.best.util.LocalImageHolderView2;
import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.huangj.huangjlibrary.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2016/11/fifth.
 */
public class VideoFragment extends BaseFragment {

    //头部广告栏
    private ConvenientBanner convenientBanner;
    private int[] networkImages = {R.drawable.year_200801,R.drawable.year_200802,R.drawable.year_200803,R.drawable.year_200901,R.drawable.year_200902,R.drawable.year_201001,R.drawable.year_201002,R.drawable.year_201101,R.drawable.year_201102,R.drawable.year_201201,R.drawable.year_201202,R.drawable.year_201301,R.drawable.year_201302,R.drawable.year_201401,R.drawable.year_201402};
    private String[] titles = {"2008_01","2008_02","2008_03","2009_01","2009_02","2010_01","2010_02","2011_01","2011_02","2012_01","2012_02","2013_01","2013_02","2014_01","2014_02"};

    private List<BannerItem> bannerItems = new ArrayList<>();

    @Override
    public int getContentId() {
        return R.layout.carousel_growrecord;
    }

    @Override
    protected void init(View view) {
        for (int i = 0; i < networkImages.length; i++) {
            bannerItems.add(new BannerItem(networkImages[i],titles[i]));
        }
        convenientBanner = (ConvenientBanner)
                view.findViewById(R.id.convenientBanner_grow);
        convenientBanner
                .setPages(new CBViewHolderCreator<LocalImageHolderView2>() {
                    @Override
                    public LocalImageHolderView2 createHolder() {
                        return new LocalImageHolderView2();
                    }
                }, bannerItems)
                .setPageIndicator(new int[]{R.mipmap.icon_rdot,
                        R.mipmap.icon_red_point})
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL)
                .startTurning(3000);
    }
}
