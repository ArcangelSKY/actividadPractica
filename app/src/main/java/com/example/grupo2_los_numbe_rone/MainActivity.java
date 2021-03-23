package com.example.grupo2_los_numbe_rone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // inicialisanco las variables
    ListView listView;
    ArrayList<Pais> arraylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.ListView_elementos);
        // lista
        arraylist = new ArrayList<Pais>();
        arraylist.add(new Pais(0 , "Chile"));
        arraylist.add(new Pais( 0, "Peru"));
        arraylist.add(new Pais(0, "Argentina"));
        // adaptador

        ArrayAdapter<Pais>  adaptador = new ArrayAdapter<Pais>(this, android.R.layout.simple_list_item_1,arraylist);

        listView.setAdapter(adaptador);


    }
}
/*
boton_tomar_foto.setOnClickListener(new View.OnClickListener() {

@Override

public void onClick(View view) {


        String file = "tuDirectorio" + Math.random() + ".jpg";

        File newfile = new File(file);

        Uri outputFileUri = Uri.fromFile(newfile);


        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri);


        startActivityForResult(cameraIntent, TAKE_PHOTO_CODE);


        }

        });*/