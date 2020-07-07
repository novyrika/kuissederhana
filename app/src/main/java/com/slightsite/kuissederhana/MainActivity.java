package com.slightsite.kuissederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Soal(View view) {
        Intent intent = new Intent(MainActivity.this, SoalActivity.class);
        startActivity(intent);
    }
}
