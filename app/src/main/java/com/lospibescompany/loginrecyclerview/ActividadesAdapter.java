package com.lospibescompany.loginrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ActividadesAdapter extends RecyclerView.Adapter<ActividadesAdapter.ViewHolder> {


    private List<Actividad> actividades;
    Context context;
    private LayoutInflater inflater;

    public ActividadesAdapter(List<Actividad> actividades,Context context) {
        this.inflater= LayoutInflater.from(context);
        this.actividades = actividades;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.actividad_card, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Actividad actividad = actividades.get(position);
        holder.nombre.setText(actividad.getNombre());
        holder.fecha_hora.setText(actividad.getFechita()+"");

        holder.btndetalles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetalleActividad.class);
                intent.putExtra("fecha", actividad.getFechita());
                intent.putExtra("lugar",actividad.getLugar());
                intent.putExtra("hora",actividad.getHora());
                intent.putExtra("nombre",actividad.getNombre());
                intent.putExtra("descripcion",actividad.getDescripcion());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return actividades.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nombre;
        private Button btndetalles;
        private TextView fecha_hora;

        private CardView cvActividad;

        public ViewHolder(View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombre);
            fecha_hora = itemView.findViewById(R.id.fecha_hora);
            btndetalles = itemView.findViewById(R.id.btndetalles);
            cvActividad = itemView.findViewById(R.id.recyclerView);

        }

    }
}

