package com.irfan.dietchart;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity {
    EditText t1,t2,t3,t4;
    Button btn1;
    String name,password,gender,mobile;
    Button camera,image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        camera=(Button) findViewById(R.id.btn2);
        setContentView(R.layout.activity_signup);
        t1 = (EditText) findViewById(R.id.text1);
        t2 = (EditText) findViewById(R.id.text2);
        t3 = (EditText) findViewById(R.id.text3);
        t4 = (EditText) findViewById(R.id.text4);
        btn1 = (Button) findViewById(R.id.btnins);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=t1.getText().toString();
                password=t2.getText().toString();
                gender=t3.getText().toString();
                mobile=t4.getText().toString();
                if(TextUtils.isEmpty(name))
                {
                    t1.setError("Please enter name:");
                    t1.requestFocus();
                    return;
                }
                if(TextUtils.isEmpty(password))
                {
                    t2.setError("Please enter mobile:");
                    t2.requestFocus();
                    return;
                }
                if(TextUtils.isEmpty(gender))
                {
                    t3.setError("Please enter gender :");
                    t3.requestFocus();
                    return;
                }
                if(TextUtils.isEmpty(mobile))
                {
                    t4.setError("Please enter mobile:");
                    t4.requestFocus();
                    return;
                }

                AlertDialog.Builder alert=new AlertDialog.Builder(SignupActivity.this);
                alert.setTitle("Alert!");
                alert.setMessage("Thanks For the sign up.");
               alert.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       Intent i=new Intent(SignupActivity.this, LoginActivity.class);
                       startActivity(i);
                   }
               });
                alert.setNegativeButton("Stay Here", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent(SignupActivity.this, SignupActivity.class);
                        startActivity(i);


                    }
                });
                alert.show();
                Toast.makeText(SignupActivity.this,"Successful",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void gotocamera(View v)
    {
        Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i,1);
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==1)
        {
            Bitmap b=(Bitmap) data.getExtras().get("data");
            ImageView image=(ImageView) findViewById(R.id.imgp);
            image.setImageBitmap(b);
            Toast.makeText(this, "camera was called", Toast.LENGTH_SHORT).show();
        }
    }

}
