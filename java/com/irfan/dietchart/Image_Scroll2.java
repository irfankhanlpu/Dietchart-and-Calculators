package com.irfan.dietchart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Image_Scroll2 extends AppCompatActivity {
    Button calc;
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
            Intent i=new Intent(Image_Scroll2.this,HomeActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m1)
        {
            Intent i =new Intent(Image_Scroll2.this, GroceryActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m2)
        {
            Intent i =new Intent(Image_Scroll2.this, RoutineActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m3)
        {
            Intent i =new Intent(Image_Scroll2.this, NutritionActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m5)
        {
            Intent i =new Intent(Image_Scroll2.this, BulkingActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m7)
        {
            Intent i =new Intent(Image_Scroll2.this, MuscleActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m6)
        {
            Intent i =new Intent(Image_Scroll2.this, ImageActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m8)
        {
            Intent i =new Intent(Image_Scroll2.this, AboutusActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m9)
        {
            Intent i =new Intent(Image_Scroll2.this, Webview.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m10)
        {
            Intent i =new Intent(Image_Scroll2.this, LoginActivity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image__scroll2);

        calc = (Button) findViewById(R.id.btn7);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Image_Scroll2.this, CalcualtorsActivity.class);
                startActivity(i);
            }
        });
        Spinner s = (Spinner) findViewById(R.id.spin);
        List<String> mylist = new ArrayList<>();
        mylist.add("-select-");
        mylist.add("AGE 1-6");
        mylist.add("AGE 7-12");
        mylist.add("AGE 13-19");
        mylist.add("AGE 20-59");
        mylist.add("ABOVE 60");
        final ArrayAdapter<String> ad = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mylist);
        s.setAdapter(ad);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String val = ad.getItem(position).toString();
                if (val == "AGE 1-6") {
                    Intent i = new Intent(Image_Scroll2.this, FirstActivity.class);
                    startActivity(i);
                }
                if (val == "AGE 7-12") {
                    Intent i = new Intent(Image_Scroll2.this, SecondActivity.class);
                    startActivity(i);
                }
                if (val == "AGE 13-19") {
                    Intent i = new Intent(Image_Scroll2.this, ThirdActivity.class);
                    startActivity(i);
                }
                if (val == "AGE 20-59") {
                    Intent i = new Intent(Image_Scroll2.this, FifthActivity.class);
                    startActivity(i);
                }
                if (val == "ABOVE 60") {
                    Intent i = new Intent(Image_Scroll2.this, FifthActivity.class);
                    startActivity(i);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    }

