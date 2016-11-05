package com.example.pedro.catchabar;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {


    private TextView wLogIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        wLogIn = (TextView) findViewById( R.id.textView);

        wLogIn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

            //    Intent intent = new Intent(this,MapsActivity.class);

            //    startActivity(intent);


            }


        });

    }




}
