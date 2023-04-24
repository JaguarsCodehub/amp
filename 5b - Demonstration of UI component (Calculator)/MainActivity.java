package com.example.practical_5b_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2;
    Button b1,b2,b3,b4,b5;
    TextView tv1;
    int n1=0,n2=0;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (EditText) findViewById(R.id.et1);
        t2 = (EditText) findViewById(R.id.et2);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        tv1 = (TextView) findViewById(R.id.tv1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = t1.getText().toString();
                    String s2 = t2.getText().toString();
                    n1 = Integer.parseInt(s1);
                    n2 = Integer.parseInt(s2);
                    int sum = n1 + n2;
                    tv1.setText("Addition ="+sum);
                }
                catch (NumberFormatException e)
                {
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = t1.getText().toString();
                    String s2 = t2.getText().toString();
                    n1 = Integer.parseInt(s1);
                    n2 = Integer.parseInt(s2);
                    int sub = n1 - n2;
                    tv1.setText("Subtraction ="+sub);
                }
                catch (NumberFormatException e)
                {
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = t1.getText().toString();
                    String s2 = t2.getText().toString();
                    n1 = Integer.parseInt(s1);
                    n2 = Integer.parseInt(s2);
                    int m = n1 * n2;
                    tv1.setText("Multiplication ="+m);
                }
                catch (NumberFormatException e)
                {
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = t1.getText().toString();
                    String s2 = t2.getText().toString();
                    n1 = Integer.parseInt(s1);
                    n2 = Integer.parseInt(s2);
                    int d = n1 / n2;
                    tv1.setText("Division ="+d);
                }
                catch (NumberFormatException e)
                {
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(" ");
                t2.setText(" ");
                tv1.setText(" ");
            }
        });
    }
}