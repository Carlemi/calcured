package com.example.carlos.calcured;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DrawableUtils;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //declaramos  o llamamos los botones y las variables para las operaciones
    Button  bt1, bt2, bt3, btd, bt4,bt5,bt6,btx,bt7,bt8,bt9,btm,bt0,btmod,btig,btma,btclean;
    EditText etcal;
    double num1, num2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //dentro del método de crear, llamamos a que encuentre los botones
        btclean = (Button) findViewById(R.id.btclean);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        btd = (Button) findViewById(R.id.btd);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        btx = (Button) findViewById(R.id.btx);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        btm = (Button) findViewById(R.id.btm);
        bt0 = (Button) findViewById(R.id.bt0);
        btmod = (Button) findViewById(R.id.btmod);
        btig = (Button) findViewById(R.id.btig);
        btma = (Button) findViewById(R.id.btma);
        etcal = (EditText) findViewById(R.id.etcal);


    }

}
