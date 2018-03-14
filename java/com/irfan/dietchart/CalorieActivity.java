package com.irfan.dietchart;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalorieActivity extends AppCompatActivity {
    EditText heighttext,weighttext,agetext;
    Button cal;
    float height,weight,age,calc;
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
            Intent i=new Intent(CalorieActivity.this,HomeActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m1)
        {
            Intent i =new Intent(CalorieActivity.this, GroceryActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m2)
        {
            Intent i =new Intent(CalorieActivity.this, RoutineActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m3)
        {
            Intent i =new Intent(CalorieActivity.this, NutritionActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m5)
        {
            Intent i =new Intent(CalorieActivity.this, BulkingActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m7)
        {
            Intent i =new Intent(CalorieActivity.this, MuscleActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m6)
        {
            Intent i =new Intent(CalorieActivity.this, ImageActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m8)
        {
            Intent i =new Intent(CalorieActivity.this, AboutusActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m9)
        {
            Intent i =new Intent(CalorieActivity.this, Webview.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m10)
        {
            Intent i =new Intent(CalorieActivity.this, LoginActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie);
        heighttext= (EditText) findViewById(R.id.et1);
        weighttext= (EditText) findViewById(R.id.et2);
        agetext= (EditText) findViewById(R.id.et4);
        cal=(Button) findViewById(R.id.ib1);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String height1 = heighttext.getText().toString();
                height = Float.parseFloat(height1);
                String weight1 = weighttext.getText().toString();
                weight = Float.parseFloat(weight1);
                String age1 = agetext.getText().toString();
                age = Float.parseFloat(age1);
                calc = (float) (66.5 + (13.75 * weight) + (5.003 * height) - (6.775 * age));

                AlertDialog.Builder alert = new AlertDialog.Builder(CalorieActivity.this);
                alert.setTitle("Calorie Calculated");
                alert.setMessage("" + calc + "");
                alert.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(CalorieActivity.this, CalcualtorsActivity.class);
                        startActivity(i);
                    }
                });

                alert.show();
            }
        });
    }
}
