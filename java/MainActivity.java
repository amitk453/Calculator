
package com.example.maurya.calculator;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnBack,btnClear,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPlus,btnSubtract,btnMultiply,btnDivide,btnEqual,
            btnDot,btnXpowerTwo,btnXpowerY,btnSqrt,btnFactorial;
    EditText edResult;
    double firstValue,secondValue,res;
    String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        typeCast();
        try {
            btn1.setOnClickListener(this);
            btn5.setOnClickListener(this);
            btn2.setOnClickListener(this);
            btn3.setOnClickListener(this);
            btn4.setOnClickListener(this);
            btn6.setOnClickListener(this);
            btn7.setOnClickListener(this);
            btn8.setOnClickListener(this);
            btn9.setOnClickListener(this);
            btn0.setOnClickListener(this);
            btnPlus.setOnClickListener(this);
            btnSubtract.setOnClickListener(this);
            btnMultiply.setOnClickListener(this);
            btnDivide.setOnClickListener(this);
            btnDot.setOnClickListener(this);
            btnSqrt.setOnClickListener(this);
            btnFactorial.setOnClickListener(this);
            btnXpowerY.setOnClickListener(this);
            btnXpowerTwo.setOnClickListener(this);
            btnEqual.setOnClickListener(this);
            btnBack.setOnClickListener(this);
            btnClear.setOnClickListener(this);
        } catch (Exception e) {


        }
    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void typeCast(){
        edResult = (EditText)findViewById(R.id.myText);
        btnBack = (Button)findViewById(R.id.backspace);
        btnClear = (Button)findViewById(R.id.clear);
        btn1 = (Button)findViewById(R.id.one);
        btn2 = (Button)findViewById(R.id.two);
        btn3 = (Button)findViewById(R.id.three);
        btn4 = (Button)findViewById(R.id.four);
        btn5 = (Button)findViewById(R.id.five);
        btn6 = (Button)findViewById(R.id.six);
        btn7 = (Button)findViewById(R.id.seven);
        btn8 = (Button)findViewById(R.id.eight);
        btn9 = (Button)findViewById(R.id.nine);
        btn0 = (Button)findViewById(R.id.zero);
        btnPlus = (Button)findViewById(R.id.addition);
        btnSubtract = (Button)findViewById(R.id.subtraction);
        btnMultiply = (Button)findViewById(R.id.multiply);
        btnDivide = (Button)findViewById(R.id.divide);
        btnEqual = (Button)findViewById(R.id.equal);
        btnDot = (Button)findViewById(R.id.dot);
        btnSqrt = (Button)findViewById(R.id.sqrt);
        btnXpowerTwo = (Button)findViewById(R.id.xpowertwo);
        btnXpowerY = (Button)findViewById(R.id.xpowery);
        btnFactorial = (Button)findViewById(R.id.factorial);


    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.one){
            edResult.setText(edResult.getText()+"1");
        }else if(v.getId() == R.id.two){
            edResult.setText(edResult.getText()+"2");
        }else if(v.getId() == R.id.three){
            edResult.setText(edResult.getText()+"3");
        }else if(v.getId() == R.id.four){
            edResult.setText(edResult.getText()+"4");
        }else if(v.getId() == R.id.five){
            edResult.setText(edResult.getText()+"5");
        }else if(v.getId() == R.id.six){
            edResult.setText(edResult.getText()+"6");
        }else if(v.getId() == R.id.seven){
            edResult.setText(edResult.getText()+"7");
        }else if(v.getId() == R.id.eight){
            edResult.setText(edResult.getText()+"8");
        }else if(v.getId() == R.id.nine){
            edResult.setText(edResult.getText()+"9");
        }else if(v.getId() == R.id.zero){
            edResult.setText(edResult.getText()+"0");
        }else if(v.getId() == R.id.dot){
            edResult.setText(edResult.getText()+".");
        }else if(v.getId() == R.id.backspace){
            if(!edResult.getText().toString().equals("")){
                String value = edResult.getText().toString();
                if (value.length() > 0){
                    value = value.substring(0,value.length()-1);
                    edResult.setText(value);
                }
            }
        }else if(v.getId() == R.id.clear){
            edResult.setText("");
        }
        else if(v.getId() == R.id.addition){
                firstValue = Double.parseDouble(edResult.getText().toString());
                    op = "+";
                    edResult.setText("");
        }
        else if(v.getId() == R.id.subtraction) {
            firstValue = Double.parseDouble(edResult.getText().toString());
            op = "-";
            edResult.setText("");
        }else if(v.getId() == R.id.multiply) {
            firstValue = Double.parseDouble(edResult.getText().toString());
            op = "*";
            edResult.setText("");
        }else if(v.getId() == R.id.divide) {
            firstValue = Double.parseDouble(edResult.getText().toString());
            op = "/";
            edResult.setText("");
        }else if(v.getId() == R.id.equal){
            secondValue =Double.parseDouble(edResult.getText().toString());
            switch (op){
                case "+":
                    res = firstValue+secondValue;
                    edResult.setText(res+"");
                    break;
                case "-":
                    res = firstValue-secondValue;
                    edResult.setText(res+"");
                    break;
                case "*":
                    res = firstValue*secondValue;
                    edResult.setText(res+"");
                    break;
                case "/":
                    res = firstValue/secondValue;
                    edResult.setText(res+"");
                    break;
                case "xpowery":
                    double xpy = Math.pow(firstValue,secondValue);
                    edResult.setText(xpy+"");
                    break;
            }
        }else if(v.getId() == R.id.sqrt){
            double value = Double.parseDouble(edResult.getText().toString());
            double ress = Math.sqrt(value);
            edResult.setText(ress+"");
        }else if(v.getId() == R.id.xpowertwo){
            double value = Double.parseDouble(edResult.getText().toString());
            edResult.setText(value * value + "");
        }else if(v.getId() == R.id.xpowery){
            firstValue = Double.parseDouble(edResult.getText().toString());
            op = "xpowery";
            edResult.setText("");

        }else if(v.getId() == R.id.factorial){
            double factt = Double.parseDouble(edResult.getText().toString());
            int i;
            double fact=1;
            for(i=2;i<=factt;i++){
                fact *=i;
                edResult.setText(fact+"");
            }
        }

    }
}
