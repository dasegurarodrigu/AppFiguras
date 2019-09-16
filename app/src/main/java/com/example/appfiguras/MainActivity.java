package com.example.appfiguras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView figura;
    private Button opcion1;
    private Button opcion2;
    private Button opcion3;
    private TextView pbueno;
    private TextView pmalo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        figura = findViewById(R.id.imageView);
        opcion1 = findViewById(R.id.opcion1);
        opcion2 = findViewById(R.id.opcion2);
        opcion3 = findViewById(R.id.opcion3);
        pbueno = findViewById(R.id.pbueno);
        pmalo = findViewById(R.id.pmalo);
        randomize();
    }

    private void randomize() {

        Random r = new Random();
        
    }


}
