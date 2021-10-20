package com.example.helloworld;

import android.content.Intent;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    //private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void btnClick1 (View view){
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void btnClick2(View view) {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

}




//    @Override
//    public void onWindowFocusChanged(boolean hasFocus){
//        super.onWindowFocusChanged(hasFocus);
//        //获取按钮的属性
//        TextView tv = findViewById(R.id.button1);
//        float w =tv.getWidth();
//        float h=tv.getHeight();
//        float left = tv.getLeft();
//        float top =tv.getTop();
//        System.out.println("w="+w);
//        System.out.println("h="+h);
//        System.out.println("left="+left);
//        System.out.println("top="+top);
//    }
