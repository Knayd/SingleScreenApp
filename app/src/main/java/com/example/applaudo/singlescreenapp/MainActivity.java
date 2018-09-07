package com.example.applaudo.singlescreenapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   Button dial;
   TextView number;

    public void launchDialer(String number){

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+number));

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dial = findViewById(R.id.btndial); //The button

        number = findViewById(R.id.vphone); //The phone number on the TextView

        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String vnumber = number.getText().toString();

                launchDialer(vnumber);

            }
        });

    }
}
