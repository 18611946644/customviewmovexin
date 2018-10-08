package com.bwie.customview_movexin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**自定义View
 * Created by DELL on 2018/10/4.
 */

public class HeartView extends View {

    //2 定义心显示的坐标变量
    public float heartX;//心显示位置的X坐标
    public float heartY;//心显示位置的Y坐标

    //1 继承View  重写三个方法
    public HeartView(Context context) {
        super(context);
        //3 设置心默认的显示位置
        heartX=750;
        heartY=500;
    }

    public HeartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public HeartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //4 重写OnDraw 绘制图像方法
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //1 创建一并实例化一个Paint对象
        Paint paint = new Paint();
        //2 根据图片生成位图对象
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.drawable.xin_y);
        //3 绘制心
        canvas.drawBitmap(bitmap,heartX,heartY,paint);
        //4 判断图片是否回收
        if(bitmap.isRecycled()){//isRecycled 再循环的
            bitmap.recycle();//强制回收(recycle)图片
        }
    }


}
