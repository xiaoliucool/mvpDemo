package com.xiaoliu.demo.mvpdemo.contract;

import com.xiaoliu.demo.mvpdemo.BasePresenter;
import com.xiaoliu.demo.mvpdemo.BaseView;

/**
 * @author Administrator
 * @date 2016/6/29-15:05
 * @desc ${描述类实现的功能}
 */

public interface TaskContract {
    interface View extends BaseView<Presenter>{
        void sendMessage();
        void showMessage(String message);
    }
    interface Presenter extends BasePresenter{
        void saveMessage(String message);
    }
}
