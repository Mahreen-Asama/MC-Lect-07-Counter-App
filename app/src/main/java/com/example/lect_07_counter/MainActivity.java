package com.example.lect_07_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    Button btnIncrease,btnDecrease,btnReset;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview=findViewById(R.id.textView);
        btnIncrease=findViewById(R.id.btnIncrease);
        btnDecrease=findViewById(R.id.btnDecrease);
        btnReset=findViewById(R.id.btnReset);

        btnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                setTextView(counter);
            }
        });
        btnDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                setTextView(counter);
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=0;
                setTextView(counter);
            }
        });
    }

    private void setTextView(int counter) {
        textview.setText(Integer.toString(counter));
    }
}
