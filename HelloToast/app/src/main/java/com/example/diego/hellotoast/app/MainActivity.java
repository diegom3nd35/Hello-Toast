package com.example.diego.hellotoast.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.diego.hellotoast.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Hello Toast!
    public void toast (View view){
        Toast.makeText(getApplicationContext(),"Hello Toast!",
                Toast.LENGTH_LONG).show();

    }

    public void contar (View view){


    }

}
