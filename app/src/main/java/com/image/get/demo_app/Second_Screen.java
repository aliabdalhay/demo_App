package com.image.get.demo_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class Second_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.go_fish);

        ImageView fisher_image = (ImageView) findViewById(R.id.image_view);
        fisher_image.setImageResource(R.drawable.fisher_man);

        if (savedInstanceState != null) {
            onRestoreInstanceState(savedInstanceState);
        }
    }

}
