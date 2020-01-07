package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NicknameActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView user_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
        user_name = findViewById(R.id.user_nickname);
        findViewById(R.id.next).setOnClickListener(this);
    }
    public void onClick(View view){
        String nameString = user_name.getText().toString();
        Intent intent = new Intent(NicknameActivity.this, AgeActivity.class);
        String username = user_name.getText().toString();
        SharedPreferences pref = getSharedPreferences("test", MODE_PRIVATE);
        pref.edit()
                .putString("NAME", username)
                .commit();
            startActivity(intent);

    }
}
