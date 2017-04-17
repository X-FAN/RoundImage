package com.xf.roundimage.lib;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/**
 * Created by X-FAN on 2017/4/17.
 * 左上角和右上角为圆角
 */

public class DrawTopCornerImage implements DrawCornerImage {

    @Override
    public void drawCornerImage(Canvas canvas, Paint paint, float radius, int right, int bottom) {
        canvas.drawRoundRect(new RectF(0, 0, right, bottom), radius, radius, paint);
        canvas.drawRect(new RectF(0, radius, right, bottom), paint);
    }
}
