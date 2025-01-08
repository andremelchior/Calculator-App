package com.example.atividade_pam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.txtNumero01);
        EditText num2 = findViewById(R.id.txtNumero02);
        TextView result = findViewById(R.id.lblResultado);

        Button som = findViewById(R.id.btnSoma);
        Button sub = findViewById(R.id.btnSubtracao);
        Button multi = findViewById(R.id.btnMultiplicacao);
        Button div = findViewById(R.id.btnDivisao);

        som.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());

                double soma = n1 + n2;

                result.setText(String.valueOf(soma));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());

                double subt = n1 - n2;

                result.setText(String.valueOf(subt));
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());

                double multiplica = n1 * n2;

                result.setText(String.valueOf(multiplica));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());

                double divi = n1 / n2;

                result.setText(String.valueOf(divi));
            }
        });
    }
}