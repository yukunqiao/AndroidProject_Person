package com.example.asus.treasurehunter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapView;

public class MainActivity extends AppCompatActivity {

    MapView mapView = null;
    BaiduMap baiduMap = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取地图控件引用
        mapView = (MapView) findViewById(R.id.mapview);
        baiduMap = mapView.getMap();

    }

    //管理地图生命周期
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mapview.onDestroy()，实现地图生命周期管理
        mapView.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mapview.onResume()，实现地图生命周期管理
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mapview.onPause()，实现地图生命周期管理
        mapView.onPause();
    }
}
