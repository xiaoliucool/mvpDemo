package com.xiaoliu.demo.mvpdemo;

/**
 * @author Administrator
 * @date 2016/6/29-15:03
 * @desc ${描述类实现的功能}
 */

public interface BaseView<T> {
    void setPresenter(T presenter);
}
