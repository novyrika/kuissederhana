package com.slightsite.kuissederhana;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SoalActivity extends AppCompatActivity {

    AlertDialog.Builder builder;
    RadioGroup radiogroup;
    //deklarasi var or obj
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);

        //radiogroup inisialisasi
        radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
    }

    //Memilih RadioButton
    public void onRadioButton(View view) {

        Boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.radioButton2:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.radioButton3:
                if (checked)
                    tampilDialog();
                break;
            case R.id.radioButton4:
                if (checked)
                    jawabanSalah();
                break;
        }
    }
    //menampilkan dialog
    public void tampilDialog() {

        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Selamat !!!");
        builder.setMessage("Jawaban kamu benar : .exe");
        builder.setPositiveButton("OKE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(SoalActivity.this, "Selamat", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("ULANGI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                radiogroup.clearCheck();
            }
        });

        builder.create().show();

    }
    //menampilkan toast text jawaban salah
    public void jawabanSalah(){
        Toast.makeText(this, "Jawaban kamu Salah", Toast.LENGTH_SHORT).show();
    }
    public void Soal1(View view) {
        Intent intent = new Intent(SoalActivity.this, Soal1Activity.class);
        startActivity(intent);
    }
}


