package com.best.frag;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.best.ViewPager.MyTransformation;
import com.best.beautyshiyi.R;
import com.best.util.ImageUtil;
import com.huangj.huangjlibrary.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2016/11/fifth.
 */
public class HomeFragment extends BaseFragment {
    private int pagerWidth;
    private List<ImageView> imageViewList;


    @Override
    public int getContentId() {
        return R.layout.frag_3dpics;
    }


    @Override
    protected void init(View view) {
        final ViewPager viewPager= (ViewPager) view.findViewById(R.id.viewPager);
        imageViewList=new ArrayList<>();

        ImageView first=new ImageView(getContext());
        first.setImageBitmap(ImageUtil.getReverseBitmapById(R.drawable.first,getContext()));
//        first.setImageResource(R.mipmap.first);
        ImageView second=new ImageView(getContext());
        second.setImageBitmap(ImageUtil.getReverseBitmapById(R.drawable.second,getContext()));
//        second.setImageResource(R.mipmap.second);
        ImageView third=new ImageView(getContext());
        third.setImageBitmap(ImageUtil.getReverseBitmapById(R.drawable.third,getContext()));
//        third.setImageResource(R.mipmap.third);
        ImageView fourth=new ImageView(getContext());
        fourth.setImageBitmap(ImageUtil.getReverseBitmapById(R.drawable.fourth,getContext()));
//        fourth.setImageResource(R.mipmap.fourth);
        ImageView fifth=new ImageView(getContext());
        fifth.setImageBitmap(ImageUtil.getReverseBitmapById(R.drawable.fifth,getContext()));
//        fifth.setImageResource(R.mipmap.fifth);
        imageViewList.add(first);
        imageViewList.add(second);
        imageViewList.add(third);
        imageViewList.add(fourth);
        imageViewList.add(fifth);
        viewPager.setOffscreenPageLimit(2);
        pagerWidth= (int) (getResources().getDisplayMetrics().widthPixels*3.0f/5.0f);
        ViewGroup.LayoutParams lp=viewPager.getLayoutParams();
        if (lp==null){
            lp=new ViewGroup.LayoutParams(pagerWidth, ViewGroup.LayoutParams.MATCH_PARENT);
        }else {
            lp.width=pagerWidth;
        }
        viewPager.setLayoutParams(lp);
        viewPager.setPageMargin(-50);
        view.findViewById(R.id.actfrag_main).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return viewPager.dispatchTouchEvent(motionEvent);
            }
        });
        viewPager.setPageTransformer(true,new MyTransformation());
//        viewPager.setPageTransformer(true,new DepthTransformation());
        viewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return imageViewList.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view==object;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView(imageViewList.get(position));
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                ImageView imageView=imageViewList.get(position);
                container.addView(imageView,position);
                return imageView;
            }
        });
    }


}
