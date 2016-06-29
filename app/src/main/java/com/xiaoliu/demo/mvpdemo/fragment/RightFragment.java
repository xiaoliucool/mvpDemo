package com.xiaoliu.demo.mvpdemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xiaoliu.demo.mvpdemo.R;
import com.xiaoliu.demo.mvpdemo.contract.TaskContract;
import com.xiaoliu.demo.mvpdemo.presenter.MessagePresenter;

/**
 * @author Administrator
 * @date 2016/6/29-15:56
 * @desc ${描述类实现的功能}
 */

public class RightFragment extends Fragment implements TaskContract.View {
    private MessagePresenter mPresenter;
    private LinearLayout mLinearLayout;

    @Override
    public void sendMessage() {

    }

    @Override
    public void showMessage(String message) {
        if (!TextUtils.isEmpty(message)) {
            TextView mTextView = new TextView(getActivity());
            mTextView.setText(message);
            mLinearLayout.addView(mTextView);
        }
    }

    @Override
    public void setPresenter(TaskContract.Presenter presenter) {
        mPresenter = (MessagePresenter) presenter;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_right, container, false);
        mLinearLayout = (LinearLayout) view.findViewById(R.id.llShowMessage);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }
}
