package com.xf.roundimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.xf.roundimage.lib.DrawTopLeftCornerImage;
import com.xf.roundimage.lib.RoundCornersTransformation;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        float corner = getResources().getDimension(R.dimen.normal_corner);
        ImageView iv = (ImageView) findViewById(R.id.round_img);
        Picasso.with(this)
                .load(R.drawable.ic_girl)
                .transform(new RoundCornersTransformation(corner, new DrawTopLeftCornerImage()))// here change draw strategy：DrawAllCornerImage ,DrawBottomCornerImage etc.
                .into(iv);
    }
}
