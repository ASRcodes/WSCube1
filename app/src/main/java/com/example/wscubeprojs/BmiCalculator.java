package com.example.wscubeprojs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.wscubeprojs.databinding.ActivityBmiCalculatorBinding;

public class BmiCalculator extends AppCompatActivity {
    ActivityBmiCalculatorBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityBmiCalculatorBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ft = binding.heightFT.getText().toString();
                String in = binding.heightIN.getText().toString();
                String wt = binding.weight.getText().toString();

                if (ft.isEmpty() && in.isEmpty() && wt.isEmpty()) {
                    Toast.makeText(BmiCalculator.this, "Enter the values first", Toast.LENGTH_SHORT).show();
                } else {
                    int feet = Integer.parseInt(ft);
                    int inch = Integer.parseInt(in);
                    int weight = Integer.parseInt(wt);


                    int totalIN = feet * 12 + inch;
                    double totalCm = totalIN * 2.53;
                    double totalM = totalCm / 100;

                    double bMI = weight / (totalM * totalM);


                    binding.bmi.setText(String.valueOf((int) bMI));

                    if (bMI > 25) {
                        Toast.makeText(BmiCalculator.this, "You are Over_Weight", Toast.LENGTH_SHORT).show();
//                    Define the path of color of bg in values
                        binding.bmiLayout.setBackgroundColor(getResources().getColor(R.color.Red));
                        binding.bmi.setTextColor(getResources().getColor(R.color.LightYellow));

                    } else if (bMI < 18) {
                        Toast.makeText(BmiCalculator.this, "You are Under_Weight", Toast.LENGTH_SHORT).show();
                        binding.bmiLayout.setBackgroundColor(getResources().getColor(R.color.LightYellow));
                        binding.bmi.setTextColor(getResources().getColor(R.color.Red));
                    } else {
                        Toast.makeText(BmiCalculator.this, "You are healthy....GOOD", Toast.LENGTH_SHORT).show();
                        binding.bmiLayout.setBackgroundColor(getResources().getColor(R.color.green));
                        binding.bmi.setTextColor(getResources().getColor(R.color.Red));
                    }

                    binding.weight.setText("");
                    binding.heightFT.setText("");
                    binding.heightIN.setText("");
                }
            }
        });
    }
}