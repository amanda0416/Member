package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String userName = getSharedPreferences("test",MODE_PRIVATE)
                .getString("NAME","");
        EditText name = findViewById(R.id.nickname);
        name.setText(userName);
        //
        String userAge = getSharedPreferences("test",MODE_PRIVATE)
                .getString("AGE","");
        EditText age = findViewById(R.id.age);
        age.setText(userAge);
        //
        String userGender = getSharedPreferences("test",MODE_PRIVATE)
                .getString("GENDER","");
        EditText gender = findViewById(R.id.gender);
        gender.setText(userGender);
        if (TextUtils.isEmpty(name.getText().toString())&&TextUtils.isEmpty(age.getText().toString())&&TextUtils.isEmpty(gender.getText().toString())){
            Intent intent  = new Intent(MainActivity.this,NicknameActivity.class);
            startActivity(intent);
        }

    }
}
