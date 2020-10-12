package com.example.madt01;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity<find> extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMainLabel);
    }

    public void onBtnChangeClick(View view) {
        this.tvMain.setText("Just testing, that's all");
    }
    public void onBtnChangeColor(View view) {
        this.tvMain.setTextColor(Color.RED);
    }
    
}