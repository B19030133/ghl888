package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;

public class LoginActivity extends AppCompatActivity {
    private EditText et_username;
    private EditText et_password;
    private EditText et_password2;
    private Button btn_login;
    private Button btn_register;
    private CheckBox checkbox;
    public void btnClick1(View view) {//登录
    }

    public void btnClick2(View view) {//注册
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_interface);






        Map<String, String> userInfo = Save.getSaveInformation(this);
        if (userInfo != null) {
            et_username.setText(userInfo.get("username"));
            et_password.setText(userInfo.get("password"));
        }
        et_username = (EditText) findViewById(R.id.UserName);
        et_password = (EditText) findViewById(R.id.etPwd1);
        et_password2 =(EditText) findViewById(R.id.etPwd2);
        checkbox = (CheckBox) findViewById(R.id.checkBox);
        btn_login = (Button) findViewById(R.id.button_login);
        btn_register = (Button) findViewById(R.id.button_register);
        btn_login.setOnClickListener(new MyButton());
        btn_register.setOnClickListener(new MyButton());
    }

    public class MyButton implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String username = et_username.getText().toString().trim();
            String password = et_password.getText().toString().trim();
            switch (view.getId()) {
                //当点击登录按钮时
                case R.id.button_login:
                    if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
                        Toast.makeText(LoginActivity.this, "密码或账号不能为空", Toast.LENGTH_SHORT).show();
                    } else {
                        if (checkbox.isChecked()) {
                            //保存密码的操作
                        }
                        Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
//                        Intent intent = new Intent(LoginActivity.this, LoginActivity.class);
//                        startActivity(intent);
                    }
                    break;
                //当点击注册按钮事件时
                case R.id.button_register:
//                    Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
//                    startActivity(intent);
                    break;

            }
        }
    }
}