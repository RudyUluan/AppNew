package com.example.appnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetalleNoticias extends AppCompatActivity {

    ImageView mainImageView;
    TextView titulo,descripcion;
    String data1, data2;
    int image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_noticias);

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        getSupportActionBar().setTitle("COVID");
        mainImageView = findViewById(R.id.imagendescipcion);
        titulo = findViewById(R.id.titulodetalle);
        descripcion = findViewById(R.id.descripciondetalle);
        getData();
        setData();

    }
    private void getData(){
        if(getIntent().hasExtra("image")&& getIntent().hasExtra("data1") &&
        getIntent().hasExtra("data2")){

            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            image = getIntent().getIntExtra("image", (byte) 1);
        }else{
            Toast.makeText(this, "No hay datos ", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        titulo.setText(data1);
        descripcion.setText(data2);
        mainImageView.setImageResource(image);

    }

}