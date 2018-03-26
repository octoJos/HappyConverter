package com.paradeigma.leonidas.happyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Button btnKce;
    Button btnClr;
    EditText etPoso;
    TextView tvRes;

    float amount = 0;
    String result = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);

        btn = (Button) findViewById(R.id.btnCnv); // find on layout
        btnKce = findViewById(R.id.btnCnvk);
        btnClr = findViewById(R.id.btnClr); // find on layout
        etPoso = (EditText) findViewById(R.id.etPoso); // find on layout
        tvRes = findViewById(R.id.tvRes); // find on layout


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = Float.parseFloat(etPoso.getText().toString());

                if (amount >= 0) {
                    result = String.format("%.2f €", amount * 0.0032);
                    tvRes.setText(result);
                }
                else {
                    etPoso.setText("0");
                }
//                tvRes.setText(String.valueOf((amount * 2) + " €"));

            }
        });

        btnKce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = Float.parseFloat(etPoso.getText().toString());

                if (amount >= 0) {
                    tvRes.setText(String.format("%.2f €", amount * 0.0393));
                }
                else {
                    etPoso.setText("0");
                }
//                tvRes.setText(String.valueOf((amount * 0.0393) + " €"));
            }
        });

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etPoso.setText("0");
                tvRes.setText("0.00");

            }
        });
    }
}
