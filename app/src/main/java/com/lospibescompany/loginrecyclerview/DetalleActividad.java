package com.lospibescompany.loginrecyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.lospibescompany.loginrecyclerview.databinding.ActivityDetalleActividadBinding;

public class DetalleActividad extends AppCompatActivity {

    public @NonNull ActivityDetalleActividadBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetalleActividadBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();

    }

    public void init(){
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String fecha = intent.getStringExtra("fecha");
        String lugar = intent.getStringExtra("lugar");
        String descripcion = intent.getStringExtra("descripcion");
        String hora = intent.getStringExtra("hora");


        binding.nombre.setText("nombre: " + nombre);
        binding.descripcion.setText("Descripcion: "+descripcion);
        binding.fecha.setText("Fecha: "+fecha);
        binding.lugar.setText("Lugar: "+lugar);
        binding.hora.setText("Lugar: " + hora);


    }
}