package com.example.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class togger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_togger);

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
                result();
            }
        });

    }

    private void result(){
        Intent intent = new Intent(this, result.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);

    }

    private void pre(){
        Intent intent = new Intent(this, spinner.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);

    }

    private void next() {
        Intent intent = new Intent(this, switchquiz.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);

    }
}
