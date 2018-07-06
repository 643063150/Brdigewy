package com.zpp.mygraffiti.graffiti.imagepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 2017/9/14.
 */

public class StrockView extends View {
    int Strock;
    public StrockView(Context context, int Strock) {
        super(context);
        this.Strock=Strock;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.BLACK);// 设置红色
        p.setStrokeWidth(Strock);
        canvas.drawLine(60, 40, 100, 40, p);
    }
}
