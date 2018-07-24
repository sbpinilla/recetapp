package com.sbpinilla.recetapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sbpinilla.recetapp.R;
import com.sbpinilla.recetapp.pojos.Receta;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class RecetasAdapter extends RecyclerView.Adapter<RecetasAdapter.ViewHolder> {

    private Context context;
    private List<Receta> recetaArrayList;


    public RecetasAdapter(Context context, List<Receta> recetaArrayList) {
        this.context = context;
        this.recetaArrayList = recetaArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_receta, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Receta receta = recetaArrayList.get(position);

        holder.nombre.setText(receta.getNombre());
        holder.personas.setText("Personas:" + String.valueOf(receta.getPersonas()));
        holder.descripcion.setText(receta.getDescripcion());
        holder.preparacion.setText(receta.getPreparacion());


    }

    @Override
    public int getItemCount() {

        return recetaArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {


        private CardView cardView;
        private ImageView imageView;
        private TextView nombre, personas, descripcion, preparacion;

        public ViewHolder(View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.cardview);
            imageView = itemView.findViewById(R.id.image);
            nombre = itemView.findViewById(R.id.nombre);
            personas = itemView.findViewById(R.id.personas);
            descripcion = itemView.findViewById(R.id.descripcion);
            preparacion = itemView.findViewById(R.id.preparacion);

        }
    }


}
