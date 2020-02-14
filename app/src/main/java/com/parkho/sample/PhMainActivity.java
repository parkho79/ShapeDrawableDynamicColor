package com.parkho.sample;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class PhMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GradientDrawable drawable = (GradientDrawable) ContextCompat.getDrawable(this, R.drawable.shape);
        final ImageView ivShape = findViewById(R.id.iv_shape);

        // Red button
        findViewById(R.id.btn_color_red).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View a_view) {
                drawable.setColor(Color.RED);
                ivShape.setImageDrawable(drawable);
            }
        });

        // Green button
        findViewById(R.id.btn_color_green).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View a_view) {
                drawable.setColor(Color.GREEN);
                ivShape.setImageDrawable(drawable);
            }
        });

        // Blue button
        findViewById(R.id.btn_color_blue).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View a_view) {
                drawable.setColor(Color.BLUE);
                ivShape.setImageDrawable(drawable);
            }
        });
    }
}