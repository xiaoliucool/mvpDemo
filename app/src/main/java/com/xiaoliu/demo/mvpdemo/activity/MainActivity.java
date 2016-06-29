package com.xiaoliu.demo.mvpdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xiaoliu.demo.mvpdemo.R;
import com.xiaoliu.demo.mvpdemo.fragment.LeftFragment;
import com.xiaoliu.demo.mvpdemo.fragment.RightFragment;
import com.xiaoliu.demo.mvpdemo.presenter.MessagePresenter;

public class MainActivity extends AppCompatActivity {
    private LeftFragment mLeftFragment;
    private RightFragment mRightFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        new MessagePresenter(mLeftFragment, mRightFragment);
    }

    private void initViews() {
        mLeftFragment = (LeftFragment) getFragmentManager().findFragmentById(R.id.fragmentLeft);
        mRightFragment = (RightFragment) getFragmentManager().findFragmentById(R.id.fragmentRight);
    }
}
