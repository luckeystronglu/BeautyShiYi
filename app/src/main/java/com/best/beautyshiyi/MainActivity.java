package com.best.beautyshiyi;

import android.view.View;
import android.widget.RadioGroup;

import com.best.frag.HomeFragment;
import com.best.frag.MineFragment;
import com.best.frag.MsgFragment;
import com.best.frag.VideoFragment;
import com.huangj.huangjlibrary.base.BaseActivity;

import butterknife.Bind;

public class MainActivity extends BaseActivity{

    @Bind(R.id.rg)
    RadioGroup radioGroup;

    @Override
    protected int getContentId() {
        return R.layout.activity_main;
    }
    @Override
    protected void init() {
        radioGroup.getChildAt(0).performClick();
    }

    public void btnOnclick(View view){
        switch (view.getId()){
            case R.id.rb1:
                showFragment(R.id.fl_zw,new HomeFragment());
                break;
            case R.id.rb2:
                showFragment(R.id.fl_zw,new VideoFragment());
                break;
            case R.id.rb3:
                showFragment(R.id.fl_zw,new MsgFragment());
                break;
            case R.id.rb4:
                showFragment(R.id.fl_zw,new MineFragment());
                break;
        }
    }
}
