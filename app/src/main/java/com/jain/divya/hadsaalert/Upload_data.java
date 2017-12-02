package com.jain.divya.hadsaalert;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Upload_data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_data);
    }

        public void next(View view)
        {
            Intent intent1= new Intent(this,description.class);
            startActivity(intent1);
        }
    public void next1(View view)
    {
        Intent intent1= new Intent(this,Source_des.class);
        startActivity(intent1);
    }
    }

