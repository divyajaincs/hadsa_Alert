package com.jain.divya.hadsaalert;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void next(View view)
    { Toast.makeText(this, "YOU HAVE SUCCESSFULLY REGISTERD..!!", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(this,Upload_data.class);
        startActivity(intent);
    }

    }

