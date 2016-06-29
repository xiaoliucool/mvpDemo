package com.xiaoliu.demo.mvpdemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.xiaoliu.demo.mvpdemo.R;
import com.xiaoliu.demo.mvpdemo.contract.TaskContract;
import com.xiaoliu.demo.mvpdemo.presenter.MessagePresenter;

/**
 * @author Administrator
 * @date 2016/6/29-15:25
 * @desc ${描述类实现的功能}
 */

public class LeftFragment extends Fragment implements TaskContract.View {

    private String[] messages = {"Hello, MVP!", "Test message 1", "Test message 2", "Test message 3", "Test message 4", "Test message 5", "Test message 6"};
    private static int index = 0;

    private Button mButton;
    private MessagePresenter mPresenter;

    private void registerListener() {
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage();
            }
        });
    }

    private void initViews(View view) {
        mButton = (Button) view.findViewById(R.id.btnSendMsg);
    }


    @Override
    public void sendMessage() {
        mPresenter.saveMessage(messages[index++]);
        index %= messages.length;

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void setPresenter(TaskContract.Presenter presenter) {
        mPresenter = (MessagePresenter) presenter;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_left, container, false);
        initViews(view);
        registerListener();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }
}
