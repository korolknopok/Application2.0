package com.example.application20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertToRuble(View view){
        EditText editText = (EditText) findViewById(R.id.edtText);

        int dollars = Integer.parseInt(editText.getText().toString());
        double Ruble = 77;

        double result = dollars * Ruble ;

        TextView output = findViewById(R.id.OutputInfo);
        output.setText(Double.toString(result));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}