package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ed1;
    boolean isNewop= true;
    String op = "+";
    String oldNumber = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ed1=findViewById(R.id.EditText);

    }


    public void numberAction(View view) {

        if (isNewop)
            ed1.setText("");
        isNewop= false;
        String number = ed1.getText().toString();

        switch (view.getId())
        {
            case R.id.btn0:
                number +=  "0";
                break;
            case R.id.btn1:
                number +=  "1";
                break;
            case R.id.btn2:
                number +=  "2";
                break;
            case R.id.btn3:
                number +=  "3";
                break;
            case R.id.btn4:
                number +=  "4";
                break;
            case R.id.btn5:
                number +=  "5";
                break;
            case R.id.btn6:
                number +=  "6";
                break;
            case R.id.btn7:
                number +=  "7";
                break;
            case R.id.btn8:
                number +=  "8";
                break;
            case R.id.btn9:
                number +=  "9";
                break;
            case R.id.btnVirgule:
                number +=  ".";
                break;
        }

        ed1.setText(number);

    }

    public void operateurAction(View view) {
        isNewop = true;
        oldNumber= ed1.getText().toString();
        switch (view.getId())
        {
            case R.id.btnDivise: op = "/";   break;
            case R.id.btnMoins: op = "-";  break;
            case R.id.btnMultiply: op = "*";  break;
            case R.id.btnPlus: op = "+";   break;
        }
    }

    public void equalsAction(View view) {

        String newNumber= ed1.getText().toString();
        double result = 0.0;
        switch (op)
        {
            case "+":
                result  =  Double.parseDouble(oldNumber)  +  Double.parseDouble(newNumber);
                break;

            case "-":
                result  =  Double.parseDouble(oldNumber)  -  Double.parseDouble(newNumber);
                break;

            case "/":
                result  =  Double.parseDouble(oldNumber)  /  Double.parseDouble(newNumber);
                break;

            case "*":
                result  =  Double.parseDouble(oldNumber)  *  Double.parseDouble(newNumber);
                break;
        }

        ed1.setText(result+ "");
    }

    public void backspaceAction(View view) {
        ed1.setText("0");
        isNewop = true;
    }
}