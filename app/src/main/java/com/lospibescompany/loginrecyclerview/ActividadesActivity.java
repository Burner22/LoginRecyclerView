package com.lospibescompany.loginrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ActividadesActivity extends AppCompatActivity {
    private RecyclerView rvActividades;
    private ActividadesAdapter adapter;

    private List<Actividad> actividadList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividades);

        init();
    }

    public void init(){
        actividadList = new ArrayList<>();

        actividadList.add(new Actividad("cortar","Cortar el pelo",obtenerFechaActual(LocalDateTime.now()),obtenerHoraActual(LocalDateTime.now()),"casa"));
        actividadList.add(new Actividad("rapar","Rapar el pelo",obtenerFechaActual(LocalDateTime.now()),obtenerHoraActual(LocalDateTime.now()),"techo"));
        actividadList.add(new Actividad("limpiar", "Limpiar el pelo",obtenerFechaActual(LocalDateTime.now()),obtenerHoraActual(LocalDateTime.now()),"edificio"));

        ActividadesAdapter actividadesAdapter = new ActividadesAdapter(actividadList, this);
        rvActividades = findViewById(R.id.recyclerView);
        rvActividades.setHasFixedSize(false); //recyclew view responsive = false, no responsive = true
        rvActividades.setLayoutManager(new LinearLayoutManager(this));//establecer diseño o disposicion de elementos
        rvActividades.setAdapter(actividadesAdapter);

    }

    public static String obtenerFechaActual(LocalDateTime ahora) {
        // Crear una instancia de LocalDateTime con la fecha y hora actual
        //LocalDateTime ahora = LocalDateTime.now();

        // Definir un formato para la fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Formatear la fecha en el formato definido
        String fechaFormateada = ahora.format(formatter);

        // Retornar la fecha formateada
        return fechaFormateada;
    }

    public static String obtenerHoraActual(LocalDateTime ahora) {
        // Crear una instancia de LocalDateTime con la fecha y hora actual
        //LocalDateTime ahora = LocalDateTime.now();

        // Definir un formato para la hora
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Formatear la hora en el formato definido
        String horaFormateada = ahora.format(formatter);

        // Retornar la hora formateada
        return horaFormateada;
    }


}
