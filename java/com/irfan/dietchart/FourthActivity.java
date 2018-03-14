package com.irfan.dietchart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity {
    Button first,second,third;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        first=(Button) findViewById(R.id.btn1);
        second=(Button) findViewById(R.id.btn2);
        third=(Button) findViewById(R.id.btn3);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FourthActivity.this,HypertensionActivity.class);
                startActivity(i);
            }


        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FourthActivity.this,DiabetesActivity.class);
                startActivity(i);
            }


        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FourthActivity.this,NormalActivity.class);
                startActivity(i);
            }


        });
    }
}
