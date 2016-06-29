package com.xiaoliu.demo.mvpdemo.model;

import android.util.Log;

/**
 * @author Administrator
 * @date 2016/6/29-15:12
 * @desc ${描述类实现的功能}
 */

public class MessageModel {

    public void saveMessage(String message){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    Log.i("MessageModel","saved");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
