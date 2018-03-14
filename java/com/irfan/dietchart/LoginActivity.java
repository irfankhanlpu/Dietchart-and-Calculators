package com.irfan.dietchart;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    Button loginbtn,signupbtn;
    EditText name,password;
    ProgressDialog pr;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signupbtn = (Button) findViewById(R.id.signup1);
        loginbtn=(Button) findViewById(R.id.loginbtn);
         name= (EditText) findViewById(R.id.et1);
         password=(EditText) findViewById(R.id.et2);
        password.setHint("Password");
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1=name.getText().toString();
                String pass1=password.getText().toString();
                if(name1.equals("1234") && pass1.equals("1234"))
                {
                    pr=new ProgressDialog(LoginActivity.this);
                    pr.setMessage("Please Wait!");
                    pr.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                    pr.show();

                    Runnable ProgressRunnable =new Runnable() {
                        @Override
                        public void run() {
                            pr.cancel();
                        }
                    };
                    Handler prCanceller=new Handler();
                    prCanceller.postDelayed(ProgressRunnable,3000);



                    Intent i=new Intent(LoginActivity.this,HomeActivity.class);
                    startActivity(i);
                }
                else {

                    AlertDialog.Builder alert=new AlertDialog.Builder(LoginActivity.this);
                    alert.setTitle("ALERT !!");
                    alert.setMessage("Please enter correct username and password");
                    alert.setPositiveButton("Again Login", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent(LoginActivity.this,LoginActivity.class);
                            startActivity(i);
                        }
                    });
                    alert.show();
                }

            }
        });
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(i);
            }
        });

    }
}
