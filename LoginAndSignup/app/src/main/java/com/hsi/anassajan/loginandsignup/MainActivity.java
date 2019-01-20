package com.hsi.anassajan.loginandsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void signup(View view){
        Intent intent  =new Intent(MainActivity.this,Signup.class);
        startActivity(intent);

    }

    public void login(View view){
        Intent intent  =new Intent(MainActivity.this,Login.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
