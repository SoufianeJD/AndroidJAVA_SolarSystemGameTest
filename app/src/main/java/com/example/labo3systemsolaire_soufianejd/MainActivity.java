package com.example.labo3systemsolaire_soufianejd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btnid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
btnid = (Button) findViewById(R.id.btnid);
        btnid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openx();
            }
        });
    }


    public void openx(){
        Intent intent = new Intent (this, GameOn.class);
       startActivity(intent);
    }
}