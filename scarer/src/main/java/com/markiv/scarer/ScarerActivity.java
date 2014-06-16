package com.markiv.scarer;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import java.util.Random;

public class ScarerActivity extends Activity {
    private Handler handler;
    private static final int[] UNCLES = new int[]{
        R.drawable.uncle_1, R.drawable.uncle_2, R.drawable.uncle_3, R.drawable.uncle_4, R.drawable.uncle_5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_scarer);
        ((ImageView)findViewById(R.id.uncle_image)).setImageResource(UNCLES[new Random().nextInt(5)]);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 500);
    }
}
