package com.hsi.anassajan.loginandsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    public void login(View view){
        Toast.makeText(Login.this,"Logging You In....",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Login.this,MainActivity.class);
        startActivity(intent);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
