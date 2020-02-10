package com.example.recepti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Recept extends AppCompatActivity {
private TextView naziv,sastojci,recept;
private ImageView image;
String naziv2,sastojci2,recept2;
int slika;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recept);

        naziv = findViewById(R.id.naziv);
        sastojci = findViewById(R.id.sastojci);
        recept = findViewById(R.id.recept);
        image = findViewById(R.id.image);

        Intent iin= getIntent();
        Bundle b = iin.getExtras();

        if(b!=null)
        {
            naziv2 =(String) b.get("Naziv");
            sastojci2 =(String) b.get("Sastojci");
            recept2 =(String) b.get("Recept");
            slika =(Integer) b.get("slika");

        }

        naziv.setText(naziv2);
        sastojci.setText(sastojci2);
        recept.setText(recept2);
        image.setImageResource(slika);





    }
}
