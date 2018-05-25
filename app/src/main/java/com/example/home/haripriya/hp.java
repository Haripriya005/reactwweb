package com.example.home.haripriya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class hp extends AppCompatActivity implements View.OnClickListener {

    Button butt;
    int cnt=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hp);
        butt=findViewById(R.id.hari);
        butt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        cnt++;
        Intent secondIntent=new Intent(this,bhuvana.class);
        startActivity(secondIntent);
       // Toast.makeText(this,String.valueOf(cnt), Toast.LENGTH_SHORT).show();
    }
}
