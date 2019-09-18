package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

public class ProfilActivity extends AppCompatActivity {

    public static final String DEFAULT="N/A";
    private static final String PREFER_NAME = "isLogged";
    TextView numeafisat;
    TextView varstaafisat;
    Button back;
    ImageView pozaProfil;
    ImageView userphoto,convuserphoto;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

   init();

        SharedPreferences myPrefrence=getSharedPreferences(PREFER_NAME, MODE_PRIVATE);
        String nume=  myPrefrence.getString("nume",DEFAULT);
        String varsta=   myPrefrence.getString("varsta",DEFAULT);



        /////////////////////////////////////////////////////////////////////






        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ProfilActivity.this,MeniuPrincipalActivity.class);
                startActivity(i);
            }
        });



        if(nume.equals(DEFAULT) || varsta.equals(DEFAULT))
        {
            Toast.makeText(this,"Datele nu au fost gasite",Toast.LENGTH_LONG).show();

        }else{

            Toast.makeText(this,"Datele au fost incarcate cu succes",Toast.LENGTH_LONG).show();
            numeafisat.setText(nume);
            varstaafisat.setText(varsta);

            ///////////////////////////////////////////////


        }






    }

private void init()
{
    numeafisat=(TextView)findViewById(R.id.numeProfile);
    varstaafisat=(TextView)findViewById(R.id.varstaProfile);
    back=findViewById(R.id.backprofile);
    pozaProfil=findViewById(R.id.idpozaProfil);
    userphoto=findViewById(R.id.idpoza);
      convuserphoto=findViewById(R.id.idpozaProfil);



}




}
