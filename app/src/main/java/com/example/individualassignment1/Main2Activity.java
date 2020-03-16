package com.example.individualassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    EditText  et3, et4, et5, et6, et7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void submit(View view) {
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        et5 = (EditText) findViewById(R.id.et5);
        et6 = (EditText) findViewById(R.id.et6);
        et7 = (EditText) findViewById(R.id.et7);

        while(TextUtils.isEmpty(et3.getText()) == true || TextUtils.isEmpty(et4.getText()) == true ||
                TextUtils.isEmpty(et5.getText()) == true || TextUtils.isEmpty(et5.getText()) == true ||
                TextUtils.isEmpty(et6.getText()) == true){
            if (TextUtils.isEmpty(et3.getText())) {
                et3.setError("This field cannot be empty");
            }
            if (TextUtils.isEmpty(et4.getText())) {
                et4.setError("This field cannot be empty");
            }
            if (TextUtils.isEmpty(et5.getText())) {
                et5.setError("This field cannot be empty");
            }
            if (TextUtils.isEmpty(et6.getText())) {
                et6.setError("This field cannot be empty");
            }
            if (TextUtils.isEmpty(et7.getText())) {
                et7.setError("This field cannot be empty");
            }
            return;
        }
        while(et3.getText().length() < 3 || et4.getText().length() < 2){
            if(et3.getText().length() < 3) {
                et3.setError("First Name should be at least 3 characters!");
            }
            if(et4.getText().length() < 2){
                et4.setError("Last Name should be at least 2 characters!");
            }
            return;
        }
        startActivity(new Intent(this, MainActivity.class));
    }
}
