package com.xf.roundimage.lib;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/**
 * Created by X-FAN on 2017/4/17.
 */

public class DrawTopLeftCornerImage implements DrawCornerImage {
    @Override
    public void drawCornerImage(Canvas canvas, Paint paint, float radius, int right, int bottom) {
        canvas.drawRoundRect(new RectF(0, 0, right, bottom), radius, radius, paint);
        canvas.drawRect(new RectF(right - radius, 0, right, radius), paint);
        canvas.drawRect(new RectF(0, bottom - radius, right, bottom), paint);
    }
}
