package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editcd, editcr;
    Button btnCV, btnDT;
    TextView textkq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editcd=(EditText)findViewById(R.id.editText_cd);
        editcr=(EditText)findViewById(R.id.editText_cr);
        btnCV=(Button)findViewById(R.id.button_cv);
        btnDT=(Button)findViewById(R.id.button_dt);
        textkq=(TextView)findViewById(R.id.textView_kq);
        btnCV.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String chuoi1=editcd.getText().toString();
                int chieudai=Integer.parseInt(chuoi1);
                String chuoi2=editcr.getText().toString();
                int chieurong=Integer.parseInt(chuoi2);
                int chuvi=(chieudai+chieurong)*2;
                textkq.setText("Chu vi:"+ String.valueOf(chuvi));
            }

        });
        btnDT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1=editcd.getText().toString();
                int chieudai=Integer.parseInt(chuoi1);
                String chuoi2=editcr.getText().toString();
                int chieurong=Integer.parseInt(chuoi2);
                int dientich=chieudai*chieurong;
                textkq.setText("Diện tích:"+ String.valueOf(dientich));
            }
        });


    }
}
