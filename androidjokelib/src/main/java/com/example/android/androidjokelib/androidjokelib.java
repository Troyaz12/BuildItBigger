package com.example.android.androidjokelib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class androidjokelib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidjokelib);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");



    }
}
