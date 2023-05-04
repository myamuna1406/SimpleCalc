package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText no1 , no2;
    Button add ,mul ,div , sub,mod,equal,pow;
    TextView answer;
    double ans = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        no1 = findViewById(R.id.first_no);
        no2 = findViewById(R.id.second_no);

        add = findViewById(R.id.add);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        sub = findViewById(R.id.sub);
        mod = findViewById(R.id.mod);
        sub = findViewById(R.id.sub);
        pow = findViewById(R.id.pow);

        equal = findViewById(R.id.equals);

        answer = findViewById(R.id.answer);

        add.setOnClickListener(v -> {
            String num1 = no1.getText().toString();
            String num2 = no2.getText().toString();

            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
            }
            else {
                double a = Double.parseDouble(no1.getText().toString());
                double b = Double.parseDouble(no2.getText().toString());
                ans = a + b;
            }
        });

        sub.setOnClickListener(v -> {
            String num1 = no1.getText().toString();
            String num2 = no2.getText().toString();

            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
            }
            else {
                double a = Double.parseDouble(no1.getText().toString());
                double b = Double.parseDouble(no2.getText().toString());
                ans = a - b;
            }
        });

        mul.setOnClickListener(v -> {
            String num1 = no1.getText().toString();
            String num2 = no2.getText().toString();

            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
            }
            else {
                double a = Double.parseDouble(no1.getText().toString());
                double b = Double.parseDouble(no2.getText().toString());
                ans = a * b;
            }
        });

        div.setOnClickListener(v -> {
            String num1 = no1.getText().toString();
            String num2 = no2.getText().toString();

            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Enter Numbers", Toast.LENGTH_SHORT).show();
            } else {
                double a = Double.parseDouble(no1.getText().toString());
                double b = Double.parseDouble(no2.getText().toString());
                if (b != 0)
                    ans = a / b;
                else
                    Toast.makeText(getApplicationContext(), "Enter Valid Numbers", Toast.LENGTH_SHORT).show();
            }
        });

        mod.setOnClickListener(v -> {
            String num1 = no1.getText().toString();
            String num2 = no2.getText().toString();

            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
            }
            else {
                double a = Double.parseDouble(no1.getText().toString());
                double b = Double.parseDouble(no2.getText().toString());
                ans = a%b;
            }
        });

        pow.setOnClickListener(v -> {
            String num1 = no1.getText().toString();
            String num2 = no2.getText().toString();

            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
            }
            else {
                double a = Double.parseDouble(no1.getText().toString());
                double b = Double.parseDouble(no2.getText().toString());
                ans = Math.pow(a,b);
            }
        });
        equal.setOnClickListener(v -> {
            String ans1 = String.valueOf(ans);
            answer.setText(ans1);
            ans= 0;
        });

    }
}