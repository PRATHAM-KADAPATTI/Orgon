package com.example.madprojectapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;


public class activity_login_option extends AppCompatActivity {

    ImageButton btnDocLogin ;
    ImageButton btnRecLogin ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_option);

        btnDocLogin = (ImageButton) findViewById(R.id.btn_doc);
        btnRecLogin = (ImageButton) findViewById(R.id.btn_rec);

//        now we are seeting what to happen on the button click
// First button

        btnDocLogin.setOnClickListener((View.OnClickListener) this);
        btnRecLogin.setOnClickListener((View.OnClickListener) this);
    }


//  @Override
    public void onClick(View v)
    {
        if(v.equals(btnDocLogin))
        {
            Intent it = new Intent(activity_login_option.this,activity_docter_login.class);
            startActivity(it);
        }
        else if(v.equals(btnRecLogin))
        {
            Intent it = new Intent(activity_login_option.this,activity_recipient_register.class);
            startActivity(it);
        }
    }


}