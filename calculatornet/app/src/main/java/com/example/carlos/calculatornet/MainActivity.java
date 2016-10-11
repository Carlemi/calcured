package com.example.carlos.calculatornet;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //llamamos los atributos de los layout y declaración de variables.
    Button btone,bttwo,btres,btd,btfour,btfive,btsix,btx,btseven,btocho,btnine,btma,btcero,btmod,btme,btig,btclean;
    EditText etcal,etconca;
    double num1, num2, res;
    String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //llamando los botones a través del id
        btone = (Button) findViewById(R.id.btone);
        bttwo = (Button) findViewById(R.id.bttwo);
        btres = (Button) findViewById(R.id.btres);
        btd = (Button) findViewById(R.id.btd);
        btfour = (Button) findViewById(R.id.btfour);
        btfive = (Button) findViewById(R.id.btfive);
        btsix = (Button) findViewById(R.id.btsix);
        btx = (Button) findViewById(R.id.btx);
        btseven = (Button) findViewById(R.id.btseven);
        btocho = (Button) findViewById(R.id.btocho);
        btnine = (Button) findViewById(R.id.btnine);
        btcero = (Button) findViewById(R.id.btcero);
        btmod = (Button) findViewById(R.id.btme);
        btig = (Button) findViewById(R.id.btig);
        btclean = (Button) findViewById(R.id.btclean);
        etcal = (EditText) findViewById(R.id.etcal);
// captura de datos.

        btcero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconca = (EditText)findViewById(R.id.etcal);
                etcal.setText(etconca.getText().toString()+"0");
            }
        });

        btone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconca = (EditText)findViewById(R.id.etcal);
                etcal.setText(etconca.getText().toString()+"1");
            }
        });

        bttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconca = (EditText)findViewById(R.id.etcal);
                etcal.setText(etconca.getText().toString()+"2");
            }
        });

        btres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconca = (EditText)findViewById(R.id.etcal);
                etcal.setText(etconca.getText().toString()+"3");
            }
        });

        btfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconca = (EditText)findViewById(R.id.etcal);
                etcal.setText(etconca.getText().toString()+"4");
            }
        });

        btfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconca = (EditText)findViewById(R.id.etcal);
                etcal.setText(etconca.getText().toString()+"5");
            }
        });

        btsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconca = (EditText)findViewById(R.id.etcal);
                etcal.setText(etconca.getText().toString()+"6");
            }
        });

        btseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconca = (EditText)findViewById(R.id.etcal);
                etcal.setText(etconca.getText().toString()+"7");
            }
        });

        btocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconca = (EditText)findViewById(R.id.etcal);
                etcal.setText(etconca.getText().toString()+"8");
            }
        });

        btnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconca = (EditText)findViewById(R.id.etcal);
                etcal.setText(etconca.getText().toString()+"9");
            }
        });

        btig.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                etconca = (EditText) findViewById(R.id.etcal);

                        num2 = Double.parseDouble(etconca.getText().toString());
                if (op.equals("+")) {
                    etcal.setText("");
                    res = num1 + num2;
                }
                if (op.equals("-")) {
                    etcal.setText("");
                    res = num1 - num2;
                }
                if (op.equals("/")) {
                    etcal.setText("");
                    if (num2 != 0) {
                        res = num1 / num2;
                    } else {
                        etcal.setText("infi");
                    }
                }
                etcal.setText(String.valueOf(res));
            }
        });
        //para llamar los signos en el editText
        btma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op=("+");
                etconca=(EditText)findViewById(R.id.etcal);
                num1=Double.parseDouble(etconca.getText().toString());
                etcal.setText("");
            }
        });

        btma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="-";
                etconca=(EditText)findViewById(R.id.etcal);
                num1=Double.parseDouble(etconca.getText().toString());
                etcal.setText("");
            }
        });

        btma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="*";
                etconca=(EditText)findViewById(R.id.etcal);
                num1=Double.parseDouble(etconca.getText().toString());
                etcal.setText("");
            }
        });

        btma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op="/";
                etconca=(EditText)findViewById(R.id.etcal);
                num1=Double.parseDouble(etconca.getText().toString());
                etcal.setText("");
            }
        });

        btclean.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1=0;
                num2=0;
                etcal.setText("");
            }}
        );
    }

}
