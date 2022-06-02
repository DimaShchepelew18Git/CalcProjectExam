package com.example.testprojectcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edOneNumber, edTwoNumber;
    Button btnPlus, btnMinus, btnMul, btnDel, btnPow, btnCube, btnSQRT, btnSIN, btnCOS, btnLOG, btnFACT;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edOneNumber = findViewById(R.id.edOneNumber);
        edTwoNumber = findViewById(R.id.edTwoNumber);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMul = findViewById(R.id.btnMul);
        btnDel = findViewById(R.id.btnDel);
        btnPow = findViewById(R.id.btnPow);
        btnCube = findViewById(R.id.btnCube);
        btnSQRT = findViewById(R.id.btnSQRT);
        btnSIN = findViewById(R.id.btnSIN);
        btnCOS = findViewById(R.id.btnCOS);
        btnLOG = findViewById(R.id.btnLOG);
        btnFACT = findViewById(R.id.btnFACT);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnPow.setOnClickListener(this);
        btnCube.setOnClickListener(this);
        btnSQRT.setOnClickListener(this);
        btnSIN.setOnClickListener(this);
        btnCOS.setOnClickListener(this);
        btnLOG.setOnClickListener(this);
        btnFACT.setOnClickListener(this);

        tvResult = findViewById(R.id.tvResult);
    }

    @Override
    public void onClick(View view) {

        float num1 = 0;
        float num2 = 0;
        float result = 0;

        num1 = Float.parseFloat(edOneNumber.getText().toString());
        num2 = Float.parseFloat(edTwoNumber.getText().toString());

        //факториал
        int num = Integer.parseInt(edOneNumber.getText().toString());
        int fact = 1,i;
        //факториал

        switch (view.getId()){

            case R.id.btnPlus:
                result = num1 + num2;
                break;

            case R.id.btnMinus:
                result = num1 - num2;
                break;

            case R.id.btnMul:
                result = num1 * num2;
                break;

            case R.id.btnDel:
                result = num1 / num2;
                break;

            case R.id.btnPow:
                result = (float) Math.pow(num1,num2);
                break;

            case R.id.btnCube:
                result = num1 * num1 * num1;
                break;

            case R.id.btnSQRT:
                result = (float) Math.sqrt(num1);
                break;

            case R.id.btnSIN:
                result = (float) Math.sin(num1);
                break;

            case R.id.btnCOS:
                result = (float) Math.cos(num1);
                break;

            case R.id.btnLOG:
                result = (float) Math.log(num1);
                break;

            case R.id.btnFACT:
                for(i = 1;i <=num; i++){
                    fact = fact * i;
                    result = fact;
                }
                break;
            default:
                break;
        }
        tvResult.setText(result + "");
    }
}