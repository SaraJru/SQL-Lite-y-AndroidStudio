package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EstudiantesAdaptador extends RecyclerView.Adapter<EstudiantesAdaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombres,apellidos,carne,carrera;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombres = (TextView)itemView.findViewById(R.id.tveNombres);
            apellidos = (TextView)itemView.findViewById(R.id.tveApellidos);
            carne = (TextView)itemView.findViewById(R.id.tveCarne);
            carrera = (TextView)itemView.findViewById(R.id.tveCarrera);
        }
    }

    public List<EstudiantesModelo> EstudiantesLista;

    public EstudiantesAdaptador(List<EstudiantesModelo> EstudiantesLista) {
        this.EstudiantesLista = EstudiantesLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_estudiantes,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombres.setText(EstudiantesLista.get(position).getNombres());
        holder.apellidos.setText(EstudiantesLista.get(position).getApellidos());
        holder.carne.setText(EstudiantesLista.get(position).getCarne());
        holder.carrera.setText(EstudiantesLista.get(position).getCarrera());
    }

    @Override
    public int getItemCount() {
        return EstudiantesLista.size();
    }
}
