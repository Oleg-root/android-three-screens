package com.example.sandbox2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // переопределяем метод чтоб связать наш Activity с файлом layout (activity_main.xml)
    // R - это класс, генерируется самим андройдом для того, чтобы
    // можно было обратиться к ресурсам нашего приложения (res)
    // setContentView забирает xml layout и встраивает его в экран, чтобы отобразить пользователю
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnToSecondScreen = (Button)findViewById(R.id.btnToSecondScreen);

        View.OnClickListener oclBtnToSecond = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        };
        btnToSecondScreen.setOnClickListener(oclBtnToSecond);




    }
}