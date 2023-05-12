package com.example.sandbox2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnToMainScreen = (Button)findViewById(R.id.btnToMainScreen);
        Button btnToThirdScreen = (Button)findViewById(R.id.btnToThirdScreen);

        View.OnClickListener oclBtnToMain = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            }
        };
        btnToMainScreen.setOnClickListener(oclBtnToMain);


        View.OnClickListener oclBtnToThird = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        };
        btnToThirdScreen.setOnClickListener(oclBtnToThird);


    }
}