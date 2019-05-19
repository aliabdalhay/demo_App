package com.image.get.demo_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_fish = (Button)findViewById(R.id.btn_fish);
        txtView = (TextView)findViewById(R.id.textView);

        if (savedInstanceState!= null){
            onRestoreInstanceState(savedInstanceState);
        }


        button_fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fisherMan = new Intent(MainActivity.this, Second_Screen.class);
                startActivity(fisherMan);

            }
        });

        txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent digits = new Intent(MainActivity.this, Third_Screen.class);
                startActivityForResult(digits, 1);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String result = data.getStringExtra("result");
                txtView.setText("you have entered: " + result);
            }
        }
    }
}
