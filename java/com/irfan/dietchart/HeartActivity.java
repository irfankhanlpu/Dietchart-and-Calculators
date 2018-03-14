package com.irfan.dietchart;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class HeartActivity extends AppCompatActivity {

    EditText age,hrtrate;
    RadioButton male,female;
    RadioGroup r2;
    float ag, tras,hrta;
    Button hrtRate;
    String ages;
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
            Intent i=new Intent(HeartActivity.this,HomeActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m1)
        {
            Intent i =new Intent(HeartActivity.this, GroceryActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m2)
        {
            Intent i =new Intent(HeartActivity.this, RoutineActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m3)
        {
            Intent i =new Intent(HeartActivity.this, NutritionActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m5)
        {
            Intent i =new Intent(HeartActivity.this, BulkingActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m7)
        {
            Intent i =new Intent(HeartActivity.this, MuscleActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m6)
        {
            Intent i =new Intent(HeartActivity.this, ImageActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m8)
        {
            Intent i =new Intent(HeartActivity.this, AboutusActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m9)
        {
            Intent i =new Intent(HeartActivity.this,Webview.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m10)
        {
            Intent i =new Intent(HeartActivity.this, LoginActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart);
        age = (EditText) findViewById(R.id.ageTxt);
        hrtrate = (EditText) findViewById(R.id.hrtText);
        male = (RadioButton) findViewById(R.id.male);
        female = (RadioButton) findViewById(R.id.female);
        hrtRate = (Button) findViewById(R.id.hertButton);
        r2 = (RadioGroup) findViewById(R.id.rg1);


        r2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (group == r2) {
                    if (checkedId == R.id.male) {
                        Toast.makeText(HeartActivity.this, "male is selected", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(HeartActivity.this, "female ", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        hrtRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = age.getText().toString();
                String q = hrtrate.getText().toString();

                if(TextUtils.isEmpty(p))
                {
                    age .setError("please enter age:");
                    age .requestFocus();
                    return;

                }
                else if(TextUtils.isEmpty(q))
                {
                    hrtrate .setError("please enter Heart Rate:");
                    hrtrate .requestFocus();
                    return;
                }
                else {

                    hrta = Float.parseFloat(q);
                    ag=Float.parseFloat(p);

                    tras = (float) (207 - (ag * 0.7) + hrta);
                    String a=String.valueOf(tras);

                    AlertDialog.Builder alert = new AlertDialog.Builder(HeartActivity.this);
                    alert.setTitle("Heart rate Calcuated");

                    alert.setMessage("Maximum Heart Rate Calculted"  +" \n"+ a +" beats/minute" + "\n");
                    alert.setPositiveButton("Finish", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(HeartActivity.this, CalcualtorsActivity.class);
                            startActivity(i);
                        }
                    });

                    alert.setNegativeButton("Recalculate", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(HeartActivity.this, HeartActivity.class);
                            startActivity(i);
                        }
                    });
                    alert.show();

                }


            }
        });

    }
}
