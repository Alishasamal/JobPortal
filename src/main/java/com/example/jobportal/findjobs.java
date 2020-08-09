package com.example.jobportal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class findjobs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findjobs);

        Spinner spinner1 = (Spinner) findViewById(R.id.sp_job);
        Spinner spinner2 = (Spinner) findViewById(R.id.sp_loc);
        Spinner spinner3 = (Spinner) findViewById(R.id.sp_sal);


    }
}
