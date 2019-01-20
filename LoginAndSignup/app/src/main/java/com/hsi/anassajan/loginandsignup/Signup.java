package com.hsi.anassajan.loginandsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    public void register(View view){
        Toast.makeText(Signup.this,"Registration Successful",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Signup.this,MainActivity.class);
        startActivity(intent);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
}
