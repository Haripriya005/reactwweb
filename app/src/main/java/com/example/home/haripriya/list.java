package com.example.home.haripriya;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

public class list extends AppCompatActivity {
    String[] elements={"narru boy","super man","hulk","thor","deadpool","wonder wonman"};
    ListView namelist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        namelist=findViewById(R.id.list_view);
        namelist.setLayoutManager(new LinearLayoutManager(this));
       }

}
