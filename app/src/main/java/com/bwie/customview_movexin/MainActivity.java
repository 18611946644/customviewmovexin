package com.bwie.customview_movexin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1 获取布局管理器
        LinearLayout myLayout = findViewById(R.id.mylayout);
        //2 创建并实例化自定义HeartView对象
        final HeartView heartView = new HeartView(MainActivity.this);
        //3 为对象添加触摸事件监听器
        heartView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //1 设置心的显示位置的坐标
                heartView.heartX = event.getX();
                heartView.heartY = event.getY();
                //2 重新绘制heartView 组件
                heartView.invalidate();
                return true;
            }
        });

        //4 将自定义组件HeartView 添加到LinearLayout布局管理器中
        myLayout.addView(heartView);

    }
}
