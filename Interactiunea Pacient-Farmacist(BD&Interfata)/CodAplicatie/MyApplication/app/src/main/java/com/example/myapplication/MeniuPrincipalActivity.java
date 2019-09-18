package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MeniuPrincipalActivity extends AppCompatActivity {
    Button profile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meniu_principal);

        profile=findViewById(R.id.idProfil);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i= new Intent(MeniuPrincipalActivity.this, ProfilActivity.class);
                startActivity(i);

            }
        });


    }




}
