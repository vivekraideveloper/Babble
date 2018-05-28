package com.vijayjaidewan01vivekrai.androidfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Terms extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        toolbar = findViewById(R.id.termsToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Terms and Service");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
