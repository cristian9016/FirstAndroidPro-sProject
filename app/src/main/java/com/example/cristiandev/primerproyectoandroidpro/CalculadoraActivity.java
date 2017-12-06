package com.example.cristiandev.primerproyectoandroidpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1,num2;
    TextView result;
    Button sum,res,mult,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.res);
        sum = findViewById(R.id.suma);
        res = findViewById(R.id.resta);
        mult = findViewById(R.id.mult);
        div = findViewById(R.id.div);

        sum.setOnClickListener(this);
        res.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String num1S = num1.getText().toString();
        String num2S = num2.getText().toString();
        int n1 = Integer.parseInt(num1S);
        int n2 = Integer.parseInt(num2S);
        int rta = 0;
        switch (view.getId()){
            case R.id.suma: rta=n1+n2; break;
            case R.id.resta: rta=n1-n2; break;
            case R.id.mult: rta=n1*n2; break;
            case R.id.div: rta=n1/n2; break;
        }
        result.setText(""+rta);
    }
}
