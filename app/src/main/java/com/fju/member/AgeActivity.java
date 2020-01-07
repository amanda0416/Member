package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AgeActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView user_age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        user_age = findViewById(R.id.user_age);
        findViewById(R.id.next).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String ageString = user_age.getText().toString();
        Intent intent = new Intent(AgeActivity.this, GenderActivity.class);
        String userage = user_age.getText().toString();
        SharedPreferences pref = getSharedPreferences("test", MODE_PRIVATE);
        pref.edit()
                .putString("AGE", userage)
                .commit();
        startActivity(intent);
    }
}
