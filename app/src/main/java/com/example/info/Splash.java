
package com.example.info;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashe);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.S){
            openMenuScreen();
        }else {
         Handler handler = new Handler(getMainLooper());
         handler.postDelayed(new Runnable() {
             @Override
             public void run() {
                 openMenuScreen();
             }
         },900);
     }
    }
    private void openMenuScreen(){
        Intent intent=new Intent(this,Home.class);
        startActivity(intent);
    }
}

//*
// package com.example.puzzle;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Build;
//import android.os.Bundle;
//import android.os.Handler;
//
//public class SplashActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);
//      if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.S){
//        openMenuScreen();
//      }else {
//          Handler handler = new Handler(getMainLooper());
//          handler.postDelayed(new Runnable(){
//              @Override
//              public void run() {
//              openMenuScreen();
//              }
//          },1_000);
//      }
//
//    }
//    private void openMenuScreen(){
//        Intent intent = new Intent(SplashActivity.this, MenuActivity.class);
//        startActivity(intent);
//        finish();
//    }\\