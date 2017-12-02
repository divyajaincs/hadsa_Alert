package com.jain.divya.hadsaalert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
public class Source_des extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source_des);

    }
    public void next2(View view) {
        Toast.makeText(this, "YOU ARE IN ACCIDENTAL ZONE..!!", Toast.LENGTH_SHORT).show();
    }
}
