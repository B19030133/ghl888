package com.example.helloworld;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    private EditText etName1;
    private EditText etPwd1;
    private EditText etPwd2;
    private Button rg_sure;
    private Button rg_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_interface);
        RadioGroup radgroup = (RadioGroup) findViewById(R.id.radioGroup);
        radgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radbtn = (RadioButton) findViewById(i);
                Toast.makeText(getApplicationContext(), "你选了:" + radbtn.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        etName1 =(EditText) findViewById(R.id.etName1);
        etPwd1 =(EditText) findViewById(R.id.etPwd1);
        etPwd2 =(EditText) findViewById(R.id.etPwd2);
        rg_sure=(Button) findViewById(R.id.rg_sure);
        rg_login=(Button) findViewById(R.id.rg_login);

        rg_sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etName1.getText().toString().trim();
                String password = etPwd1.getText().toString().trim();
                String password2 = etPwd2.getText().toString().trim();
                if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password) || TextUtils.isEmpty(password2)) {
                    Toast.makeText(MainActivity2.this, "各项均不能为空", Toast.LENGTH_SHORT).show();
                } else {
                    if (TextUtils.equals(password, password2)) {
                        //执行注册操作
                        SaveInfo.SaveInformation(MainActivity2.this,username,password,password2);
                        Toast.makeText(MainActivity2.this,"注册成功,请返回登录",Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity2.this, "两次输入的密码不一样", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        rg_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}