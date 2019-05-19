package com.image.get.demo_app;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;




public class Third_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insert_digits);

        final EditText edit_txt = (EditText)findViewById(R.id.edit_txt);

        edit_txt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length()==5){
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("result", edit_txt.getText().toString());
                    setResult(RESULT_OK, resultIntent);
                    finish();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


    }

}
