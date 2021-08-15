package com.example.appnew;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> implements View.OnClickListener {

    String data1[], data2[];
    int image[];
    Context context;


    public  Adapter(Context ct, String s1[],String s2[], int img[]){
        context = ct;
        data1=s1;
        data2=s2;
        image=img;


    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.text1.setText(data1[position]);
        holder.text2.setText(data2[position]);
        holder.image.setImageResource(image[position]);
        holder.llamada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + data2[position]));
                context.startActivity(intent);

            }
        });


    }


    @Override
    public int getItemCount() {
        return data1.length;
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text1, text2;
        ImageView image,llamada;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text1= itemView.findViewById(R.id.titulo);
            text2=itemView.findViewById(R.id.descripcion);
            image=itemView.findViewById(R.id.imageView);
            llamada=itemView.findViewById(R.id.llamda);
        }
    }
}
