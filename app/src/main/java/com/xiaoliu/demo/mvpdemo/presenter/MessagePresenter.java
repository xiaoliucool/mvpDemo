package com.xiaoliu.demo.mvpdemo.presenter;

import com.xiaoliu.demo.mvpdemo.contract.TaskContract;
import com.xiaoliu.demo.mvpdemo.model.MessageModel;

/**
 * @author Administrator
 * @date 2016/6/29-15:11
 * @desc ${描述类实现的功能}
 */

public class MessagePresenter implements TaskContract.Presenter {
    private MessageModel mModel ;
    private TaskContract.View mViewLeft;
    private TaskContract.View mViewRight;

    public MessagePresenter(TaskContract.View leftView, TaskContract.View rightView){
        mViewLeft = leftView;
        mViewRight = rightView;
        mViewLeft.setPresenter(this);
        mViewRight.setPresenter(this);
    }
    public void showByRight(String message){
        mViewRight.showMessage(message);
    }

    @Override
    public void saveMessage(String message) {
        mModel.saveMessage(message);
        showByRight(message);
    }

    @Override
    public void start() {
        mModel = new MessageModel();
    }
}
