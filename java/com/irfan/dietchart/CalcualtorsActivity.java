package com.irfan.dietchart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CalcualtorsActivity extends AppCompatActivity {
Button first,second,tg;
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menuitem,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId()==R.id.homep)
        {
            Intent i=new Intent(CalcualtorsActivity.this,HomeActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m1)
        {
            Intent i =new Intent(CalcualtorsActivity.this, GroceryActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m2)
        {
            Intent i =new Intent(CalcualtorsActivity.this, RoutineActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m3)
        {
            Intent i =new Intent(CalcualtorsActivity.this, NutritionActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m5)
        {
            Intent i =new Intent(CalcualtorsActivity.this, BulkingActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m7)
        {
            Intent i =new Intent(CalcualtorsActivity.this, MuscleActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m6)
        {
            Intent i =new Intent(CalcualtorsActivity.this, ImageActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m8)
        {
            Intent i =new Intent(CalcualtorsActivity.this, AboutusActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m9)
        {
            Intent i =new Intent(CalcualtorsActivity.this, Webview.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m10)
        {
            Intent i =new Intent(CalcualtorsActivity.this, LoginActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcualtors);
        first=(Button) findViewById(R.id.btn1);
        second=(Button) findViewById(R.id.btn2);
        tg=(Button) findViewById(R.id.btn3);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CalcualtorsActivity.this,BmiActivity.class);
                startActivity(i);
            }


        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CalcualtorsActivity.this,CalorieActivity.class);
                startActivity(i);
            }


        });
        tg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CalcualtorsActivity.this,HeartActivity.class);
                startActivity(i);
            }
        });
    }
}
