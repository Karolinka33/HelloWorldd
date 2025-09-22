package com.example.helloworldapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void changeClr(View view) {
        TextView textView = findViewById(R.id.textView);
        textView.setText("butt");

    }
    public void changeTxt(View view) {
        TextView textView = findViewById(R.id.textView);
        textView.setTextColor(Color.parseColor("#964B00"));

    }

    public void changeBckrnd(View view) {
        TextView textView = findViewById(R.id.textView);
        textView.setBackgroundColor(Color.parseColor("#008000"));
    }
}