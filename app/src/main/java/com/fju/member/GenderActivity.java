package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GenderActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView user_gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        user_gender = findViewById(R.id.user_gender);
        findViewById(R.id.finish).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String genderString = user_gender.getText().toString();
        Intent intent = new Intent(GenderActivity.this, MainActivity.class);
        String usergender = user_gender.getText().toString();
        SharedPreferences pref = getSharedPreferences("test", MODE_PRIVATE);
        pref.edit()
                .putString("GENDER", usergender)
                .commit();
        startActivity(intent);
    }
}
