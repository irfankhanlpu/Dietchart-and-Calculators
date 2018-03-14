package com.irfan.dietchart;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class HomeActivity extends AppCompatActivity {
Button submit;
    RadioGroup rg;
    RadioButton rbm,rbf;
    int f;
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
            Intent i=new Intent(HomeActivity.this,HomeActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m1)
        {
            Intent i =new Intent(HomeActivity.this, GroceryActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m2)
        {
            Intent i =new Intent(HomeActivity.this, RoutineActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m3)
        {
            Intent i =new Intent(HomeActivity.this, NutritionActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m5)
        {
            Intent i =new Intent(HomeActivity.this, BulkingActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m7)
        {
            Intent i =new Intent(HomeActivity.this, MuscleActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m6)
        {
            Intent i =new Intent(HomeActivity.this, ImageActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m8)
        {
            Intent i =new Intent(HomeActivity.this, AboutusActivity.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m9)
        {
            Intent i =new Intent(HomeActivity.this, Webview.class);
            startActivity(i);
        }
        if(item.getItemId()==R.id.m10)
        {
            Intent i =new Intent(HomeActivity.this, LoginActivity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        submit=(Button) findViewById(R.id.agebtn);
        rg = (RadioGroup) findViewById(R.id.rg);
        rbm=(RadioButton) findViewById(R.id.rbm);
        rbf=(RadioButton) findViewById(R.id.rbf);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(group==rg)
                {
                    if(checkedId== R.id.rbm)
                    {
                        Intent i=new Intent(HomeActivity.this,ImageScroll.class);
                        startActivity(i);

                    }
                    else
                    {
                        Intent i=new Intent(HomeActivity.this,Image_Scroll2.class);
                        startActivity(i);

                    }
                }
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (f == 1) {
                    Intent i = new Intent(HomeActivity.this, ImageScroll.class);
                    startActivity(i);

                }
                else if (f==2)
                {
                    Intent i = new Intent(HomeActivity.this, Image_Scroll2.class);
                    startActivity(i);
                }

                else{

                    AlertDialog.Builder alert = new AlertDialog.Builder(HomeActivity.this);
                    alert.setTitle("Alert !!");
                    alert.setMessage("please select gender!");
                    alert.setPositiveButton("Finish",(new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(HomeActivity.this,HomeActivity.class);
                            startActivity(i);
                        }
                    }));

                    alert.show();

                     }
            }
        });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(group == rg)
                {
                    if(checkedId == R.id.rbm)
                    {

                        f = 1;

                    }

                    else
                    {
                        f = 2;

                    }
                }
            }
        });
    }
}
