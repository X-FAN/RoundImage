package com.xf.roundimage.lib;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/**
 * Created by X-FAN on 2017/4/17.
 * 全部圆角
 */

public class DrawAllCornerImage implements DrawCornerImage {


    @Override
    public void drawCornerImage(Canvas canvas, Paint paint, float radius, int right, int bottom) {
        canvas.drawRoundRect(new RectF(0, 0, right, bottom), radius, radius, paint);
    }
}
