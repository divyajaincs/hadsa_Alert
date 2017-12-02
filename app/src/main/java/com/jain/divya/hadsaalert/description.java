package com.jain.divya.hadsaalert;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

abstract public class description extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
    }
    public void next(View view)
    {
        Intent intent= new Intent(this,Upload_data.class);
        startActivity(intent);
    }


    public void next2(View view) {
        Toast.makeText(this, "THANKYOU FOR YOUR CONTRIBUTION..!!", Toast.LENGTH_SHORT).show();
                    }


}
