package com.example.individualassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    Button btn1;
    String test1, test2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login (View view) {
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        btn1 = (Button) findViewById(R.id.btn1);

        while (TextUtils.isEmpty(et1.getText()) == true || TextUtils.isEmpty(et2.getText()) == true) {
            if (TextUtils.isEmpty(et1.getText()) == true) {
                et1.setError("This field cannot be empty");
            }
            if (TextUtils.isEmpty(et2.getText()) == true) {
                et2.setError("This field cannot be empty");
            }
            return;
        }
        test1 = et1.getText().toString();
        test2 = et2.getText().toString();
        // Hardcoded login to test if credentials match.
        // Username: ortim7@farmingdale.edu PW: password1
        if((test1.equals(Utils.EMAIL_KEY)) && (test2.equals(Utils.PW_KEY))){
            btn1.setText("Success!");
        }
        else{
            btn1.setText("Failed!");
        }
    }
    public void register (View view){
            Intent i = new Intent(view.getContext(), Main2Activity.class);
            startActivity(i);
    }
}

