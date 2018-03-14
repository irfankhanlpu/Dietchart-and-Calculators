package com.irfan.dietchart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
public class AgeDistributionActivity extends AppCompatActivity {
Button first,second,third,fourth,fifth,six,seven;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuitem,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.m1)
        {
            Intent i =new Intent(AgeDistributionActivity.this, GroceryActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m2)
        {
            Intent i =new Intent(AgeDistributionActivity.this, RoutineActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m3)
        {
            Intent i =new Intent(AgeDistributionActivity.this, NutritionActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m5)
        {
            Intent i =new Intent(AgeDistributionActivity.this, BulkingActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m7)
        {
            Intent i =new Intent(AgeDistributionActivity.this, MuscleActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m6)
        {
            Intent i =new Intent(AgeDistributionActivity.this, ImageActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m8)
        {
            Intent i =new Intent(AgeDistributionActivity.this, AboutusActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_distribution);
        first=(Button) findViewById(R.id.btn1);
        second=(Button) findViewById(R.id.btn2);
        third=(Button) findViewById(R.id.btn3);
        fourth=(Button) findViewById(R.id.btn4);
        fifth=(Button)  findViewById(R.id.btn5);

        seven=(Button) findViewById(R.id.btn7);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AgeDistributionActivity.this,FirstActivity.class);
                startActivity(i);
            }


        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AgeDistributionActivity.this,SecondActivity.class);
                startActivity(i);
            }


        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AgeDistributionActivity.this,ThirdActivity.class);
                startActivity(i);
            }


        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AgeDistributionActivity.this,FourthActivity.class);
                startActivity(i);
            }


        });
        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AgeDistributionActivity.this,FifthActivity.class);
                startActivity(i);
            }

        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AgeDistributionActivity.this,CalcualtorsActivity.class);
                startActivity(i);
            }


        });

    }
}
