package com.example.toshiba.cctvapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
  private EditText   username;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.username_id);
        password=(EditText) findViewById(R.id.pass_id);



    }
    public void Login(View v)
    {
         String name= username.getText().toString();
        String pswrd= password.getText().toString();

        String saved_name= "samriti1996@gmail.com";
        String saved_password= "12345";

      if(name.equals(saved_name)&&pswrd.equals(saved_password))
      {
        Intent i = new Intent(MainActivity.this, ConnectingPage.class);
        startActivity(i);
        finish();
    }
        else
      {
          Toast.makeText(MainActivity.this,"NOTVALID",Toast.LENGTH_SHORT).show();
      }
    }
}
