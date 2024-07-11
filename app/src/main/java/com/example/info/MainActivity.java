package com.example.info;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.info_1);
        findViewById(R.id.madras1).setOnClickListener(v -> {
            openDetailScreen(0);
        });
        findViewById(R.id.madras2).setOnClickListener(v -> {
            openDetailScreen(1);
        });
        findViewById(R.id.madras3).setOnClickListener(v -> {
            openDetailScreen(2);
        });
        findViewById(R.id.madras4).setOnClickListener(v -> {
            openDetailScreen(3);
        });
        findViewById(R.id.madras5).setOnClickListener(v -> {
            openDetailScreen(4);
        });
        findViewById(R.id.madras6).setOnClickListener(v -> {
            openDetailScreen(5);
        });
        findViewById(R.id.madras7).setOnClickListener(v -> {
            openDetailScreen(6);
        });
        findViewById(R.id.madras8).setOnClickListener(v -> {
            openDetailScreen(7);
        });
        findViewById(R.id.madras9).setOnClickListener(v -> {
            openDetailScreen(8);
        });
        findViewById(R.id.madras10).setOnClickListener(v -> {
            openDetailScreen(9);
        });
        findViewById(R.id.bu).setOnClickListener(v -> {
          finish();
        });

    }
    private void openDetailScreen(int s){
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("RAQAM",s);
        startActivity(intent);
    }
}