package com.example.asus.treasurehunter;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by asus on 2017/2/16.
 */

public class BaiduApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //在使用SDK各组件之前初始化context信息，传入ApplicationContext
        SDKInitializer.initialize(getApplicationContext());
    }
}
