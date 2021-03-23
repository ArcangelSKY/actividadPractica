package com.example.grupo2_los_numbe_rone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // inicialisanco las variables
    ListView listView;
    ArrayList<String> lista_menu;
    Pais chile, argentina, peru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.ListView_elementos);
        // lista
        lista_menu = new ArrayList<String>();
        lista_menu.add("Chile");
        lista_menu.add("Peru");
        lista_menu.add("Argentina");

        argentina = new Pais(R.drawable.argentina,"Argentina");


        // adaptador

        ArrayAdapter<Pais>  adaptador = new ArrayAdapter<Pais>(this, android.R.layout.simple_list_item_1,arraylist);

        listView.setAdapter(adaptador);

        listView.setOnItemClickListener((parent, view, position, id) -> );


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