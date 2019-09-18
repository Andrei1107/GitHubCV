package com.example.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText nume;
    EditText varsta;
    Button save;
    ImageView userphoto, convuserphoto;
    private Bitmap bitmap;

    SharedPreferences myPrefrence;
    private static final String PREFER_NAME = "isLogged";

    DatabaseReference databaseClienti;

    static int PReqCode = 1;
    static int REQUESCODE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseApp.initializeApp(this);
        databaseClienti = FirebaseDatabase.getInstance().getReference("Clienti");
        init();
//////////////////////////////////
        myPrefrence = getSharedPreferences(PREFER_NAME, MODE_PRIVATE);

        myPrefrence.getString("nume", null);
        myPrefrence.getString("varsta", null);
//        if((myPrefrence.getString("nume",null) != null) && (myPrefrence.getString("varsta",null)!=null)){
//            goToMainActivity();
//        }


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                adaugaClient();

//pass data


                SharedPreferences myPrefrence = getSharedPreferences(PREFER_NAME, MODE_PRIVATE);
                SharedPreferences.Editor editor = myPrefrence.edit();
                editor.putString("nume", nume.getText().toString());
                editor.putString("varsta", varsta.getText().toString());
                //    editor.putString("pozaprofil",convuserphoto.getTe);
                editor.commit();


                goToMainActivity();


//pass the profile photo

            }
        });


        userphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select picture"), REQUESCODE);

            }
        });

    }

        private void init ()
        {


            nume = findViewById(R.id.idnume);
            varsta = findViewById(R.id.idvarsta);
            save = (Button) findViewById(R.id.idbuttonsave);
userphoto=findViewById(R.id.idpoza);
convuserphoto=findViewById(R.id.idpozaProfil);
        }

        private void adaugaClient ()
        {


//Firebase
            String Numele = nume.getText().toString().trim();
            String Varsta = varsta.getText().toString().trim();

            if (!TextUtils.isEmpty(Numele)) {

                String id = databaseClienti.push().getKey();

                Client client = new Client(id, Numele, Varsta);

                databaseClienti.child(id).setValue(client);
                Toast.makeText(this, "Client adaugat", Toast.LENGTH_LONG).show();

            } else {
                Toast.makeText(this, "Introduceti numele dumneavoastra", Toast.LENGTH_LONG).show();
            }


        }

        public void goToMainActivity ()
        {
            Intent i = new Intent(MainActivity.this, MeniuPrincipalActivity.class);
            startActivity(i);
        }


///////////////////CONVERT USER PHOTO////////////////////////////////

        public void setProfilePhoto (View view)
        {

            //encode photo
            userphoto.buildDrawingCache();
            Bitmap bitmap = userphoto.getDrawingCache();
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, stream);
            byte[] image = stream.toByteArray();
            String img_str = Base64.encodeToString(image, 0);


            //decode photo
            String base = img_str;
            byte[] imageAsBytes = Base64.decode(base.getBytes(), Base64.DEFAULT);
            ImageView convuserphoto = this.findViewById(R.id.idpoza);
            convuserphoto.setImageBitmap(BitmapFactory.decodeByteArray(imageAsBytes, 0, imageAsBytes.length));


            SharedPreferences preferences = getSharedPreferences("MyPhoto", MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("userphoto", base);
            editor.commit();


        }


/////////////PICK UP PHOTO////////////////////////////////

        protected void onActivityResult ( int requestCode, int resultCode, Intent data)
        {
            super.onActivityResult(requestCode, resultCode, data);

            if (requestCode == REQUESCODE && resultCode == RESULT_OK && data != null && data.getData() != null) {

                Uri uri = data.getData();
                try {

                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                    userphoto.setImageBitmap(bitmap);

                } catch (IOException e) {
                    e.printStackTrace();
                }


            }


        }





    }









