package com.example.animationdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyPointView extends View {
    private Point mPoint = new Point(100);

    public MyPointView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (mPoint != null){
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(300,300,mPoint.getRadius(),paint);
        }
        super.onDraw(canvas);
    }

    void setPointRadius(int radius){
        mPoint.setRadius(radius);
        invalidate();
    }

}