package com.irfan.dietchart;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiActivity extends AppCompatActivity {
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
            Intent i=new Intent(BmiActivity.this,HomeActivity.class);
            startActivity(i);        }
        if(item.getItemId()==R.id.m1)
        {
            Intent i =new Intent(BmiActivity.this, GroceryActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m2)
        {
            Intent i =new Intent(BmiActivity.this, RoutineActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m3)
        {
            Intent i =new Intent(BmiActivity.this, NutritionActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m5)
        {
            Intent i =new Intent(BmiActivity.this, BulkingActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m7)
        {
            Intent i =new Intent(BmiActivity.this, MuscleActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m6)
        {
            Intent i =new Intent(BmiActivity.this, ImageActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m8)
        {
            Intent i =new Intent(BmiActivity.this, AboutusActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m9)
        {
            Intent i =new Intent(BmiActivity.this, Webview.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m10)
        {
            Intent i =new Intent(BmiActivity.this, LoginActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        final EditText e1 = (EditText) findViewById(R.id.et1);
        final EditText e2 = (EditText) findViewById(R.id.et2);
        final TextView tv4 = (TextView) findViewById(R.id.tv4);


        findViewById(R.id.ib1).setOnClickListener(new View.OnClickListener() {

            // Logic for validation, input can't be empty
            @Override
            public void onClick(View v) {

                String str1 = e1.getText().toString();
                String str2 = e2.getText().toString();

                if(TextUtils.isEmpty(str1)){
                    e1.setError("Please enter your weight");
                    e1.requestFocus();
                    return;
                }

                if(TextUtils.isEmpty(str2)){
                    e2.setError("Please enter your height");
                    e2.requestFocus();
                    return;
                }
                float weight = Float.parseFloat(str1);
                float height = Float.parseFloat(str2)/100;

                float bmiValue = calculateBMI(weight, height);
                String bmiInterpretation = interpretBMI(bmiValue);
                AlertDialog.Builder alert=new AlertDialog.Builder(BmiActivity.this);
                alert.setTitle("BMI CALCULATED");
                alert.setMessage(""+ bmiValue+ "\n"+bmiInterpretation);
                alert.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent(BmiActivity.this,CalcualtorsActivity.class);
                        startActivity(i);
                    }
                });
        alert.show();
            }
        });
    }
    private float calculateBMI (float weight, float height) {
        return (float) (weight / (height * height));
    }
    private String interpretBMI(float bmiValue) {

        if (bmiValue < 16) {
            return "Severely underweight";
        }
        else if (bmiValue < 18.5)
        {

            return "Underweight";
        }
        else if (bmiValue < 25) {

            return "Normal";
        }
        else if (bmiValue < 30) {

            return "Overweight";
        }
        else {
            return "Obese";
        }
    }
}
