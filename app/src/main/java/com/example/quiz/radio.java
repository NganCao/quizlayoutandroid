package com.example.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.view.View;

public class radio extends AppCompatActivity {

    RadioButton rb1, rb2, rb3,rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);

        rb1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                rb1.setChecked(true);
                rb2.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
            }
        });

        rb2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                rb1.setChecked(false);
                rb2.setChecked(true);
                rb3.setChecked(false);
                rb4.setChecked(false);
            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                rb1.setChecked(false);
                rb2.setChecked(false);
                rb3.setChecked(true);
                rb4.setChecked(false);
            }
        });

        rb4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                rb1.setChecked(false);
                rb2.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(true);
            }
        });

        findViewById(R.id.btnnext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });

        findViewById(R.id.btnpr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pre();
            }
        });

        findViewById(R.id.btnresult).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });

    }

    private void result(){
        Intent intent = new Intent(this, result.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);

    }

    private void next(){
        Intent intent = new Intent(this, checkbox.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);

    }

    private void pre(){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);

    }

}
