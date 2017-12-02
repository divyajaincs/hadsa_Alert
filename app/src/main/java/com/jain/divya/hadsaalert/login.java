package com.jain.divya.hadsaalert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void next(View view)
    {
        Intent intent= new Intent(this,Upload_data.class);
        startActivity(intent);
    }
    public void next1(View view)
    {
        Intent intent1= new Intent(this,register.class);
        startActivity(intent1);
    }

}
