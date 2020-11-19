package com.example.anet33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMenu1, btnMenu2;
    Button btnMenu3, btnMenu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenu1 = findViewById(R.id.btn1);
        btnMenu2 = findViewById(R.id.btn2);
        btnMenu3 = findViewById(R.id.btn3);
        btnMenu4 = findViewById(R.id.btn4);

        btnMenu1.setOnClickListener(this);
        btnMenu2.setOnClickListener(this);
        btnMenu3.setOnClickListener(this);
        btnMenu4.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn1){
            Intent menu1 = new Intent( packageContext: this, MenuActivity.class);
            startActivity(menu1);
        }
        else if(view.getId() == R.id.btn2){
            Intent menu1 = new Intent( packageContext: this, MenuActivity1.class);
            startActivity(menu1);
        }
        else if(view.getId() == R.id.btn3){
            Intent menu1 = new Intent( packageContext: this, MenuActivity2.class);
            startActivity(menu1);
        }
        else if(view.getId() == R.id.btn4){
            Intent menu1 = new Intent( packageContext: this, MenuActivity3.class);
            startActivity(menu1);
        }
    }
}