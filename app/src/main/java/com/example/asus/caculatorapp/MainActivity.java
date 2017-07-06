package com.example.asus.caculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textViewResult;
    Float f1, f2;
    String str, str1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = (TextView) findViewById(R.id.textViewResult);

        int[] idButton = {R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5,
                R.id.button6, R.id.button7, R.id.button8, R.id.button9, R.id.buttonAdd, R.id.buttonDel,
                R.id.buttonDiv, R.id.buttonDot, R.id.buttonEqual, R.id.buttonMulti, R.id.buttonSub};

        for (int id : idButton) {
            View v = (View) findViewById(id);
            v.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonDel:
                str1 = "";
                textViewResult.setText("");
                break;
            case R.id.buttonDiv:
                str = "/";
                f1 = Float.parseFloat(textViewResult.getText().toString());
                str1 = "0";
                textViewResult.setText(str1);
                break;
            case R.id.buttonMulti:
                str = "*";
                f1 = Float.parseFloat(textViewResult.getText().toString());
                str1 = "0";
                textViewResult.setText(str1);
                break;
            case R.id.buttonAdd:
                str = "+";
                f1 = Float.parseFloat(textViewResult.getText().toString());
                str1 = "0";
                textViewResult.setText(str1);
                break;
            case R.id.buttonSub:
                str = "-";
                f1 = Float.parseFloat(textViewResult.getText().toString());
                str1 = "0";
                textViewResult.setText(str1);
                break;
            case R.id.buttonEqual:
                f2 = Float.parseFloat(textViewResult.getText().toString());
                if (str.equals("+")) {
                    str1 = String.valueOf(f1 + f2);
                }
                if (str.equals("-")) {
                    str1 = String.valueOf(f1 - f2);
                }
                if (str.equals("*")) {
                    str1 = String.valueOf(f1 * f2);
                }
                if (str.equals("/")) {
                    str1 = String.valueOf((f1 / f2));
                }
                textViewResult.setText(str1);
                break;
            default:
                if (str1.equals("0")) {
                    str1 = "";
                }
                str1 += ((Button) v).getText().toString();
                textViewResult.setText(str1);

        }
    }
}
