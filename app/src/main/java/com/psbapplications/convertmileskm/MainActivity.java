package com.psbapplications.convertmileskm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editTextMiles = findViewById(R.id.editTextMiles);
        final EditText editTextKM = findViewById(R.id.editTextKM);
        Button buttonConKMToMiles = findViewById(R.id.buttonConKMToMiles);
        buttonConKMToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double vKM = Double.parseDouble(editTextKM.getText().toString());
                double vMiles = vKM * 0.62137;
                DecimalFormat formatVal = new DecimalFormat(".##");
                editTextMiles.setText(formatVal.format(vMiles));
            }
        });
        Button buttonConMilesToKM = findViewById(R.id.buttonConMilesToKM);
        buttonConMilesToKM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double vMiles = Double.parseDouble(editTextMiles.getText().toString());
                double vKm = vMiles / 0.62137;
                DecimalFormat formatVal = new DecimalFormat(".##");
                editTextKM.setText(formatVal.format(vKm));
            }
        });

    }
}