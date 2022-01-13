package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProfesoresAdaptador extends RecyclerView.Adapter<ProfesoresAdaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombresProf,apellidosProf,ID,facultad;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombresProf = (TextView)itemView.findViewById(R.id.tveNombresProf);
            apellidosProf = (TextView)itemView.findViewById(R.id.tveApellidosProf);
            ID = (TextView)itemView.findViewById(R.id.tveID);
            facultad = (TextView)itemView.findViewById(R.id.tveFacultad);
        }
    }

    public List<ProfesoresModelo> ProfesoresLista;

    public ProfesoresAdaptador(List<ProfesoresModelo> ProfesoresLista) {
        this.ProfesoresLista = ProfesoresLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_profesores,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombresProf.setText(ProfesoresLista.get(position).getNombresProf());
        holder.apellidosProf.setText(ProfesoresLista.get(position).getApellidosProd());
        holder.ID.setText(ProfesoresLista.get(position).getID());
        holder.facultad.setText(ProfesoresLista.get(position).getFacultad());
    }

    @Override
    public int getItemCount() {
        return ProfesoresLista.size();
    }
}
