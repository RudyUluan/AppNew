package com.example.appnew;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class Adapternoticias extends RecyclerView.Adapter<Adapternoticias.ViewHoldernoticias> {

    String data1[], data2[];
    int image[];
    Context context;

    public Adapternoticias(Context ct, String s1[], String s2[], int img[]){
        context = ct;
        data1=s1;
        data2=s2;
        image=img;

    }



    @NonNull
    @Override
    public ViewHoldernoticias onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.row_noticias, parent, false);

        return new ViewHoldernoticias(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHoldernoticias holder, int position) {
        holder.text1.setText(data1[position]);
        holder.text2.setText(data2[position]);
        holder.image.setImageResource(image[position]);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetalleNoticias.class);
                intent.putExtra("data1",data1[position]);
                intent.putExtra("data2",data2[position]);
                intent.putExtra("image",image[position]);
                context.startActivity(intent);

            }
        });

    }


    @Override
    public int getItemCount() {
        return data1.length;
    }


    public class ViewHoldernoticias extends RecyclerView.ViewHolder {
        TextView text1, text2;
        ImageView image;
        RelativeLayout relativeLayout;

        public ViewHoldernoticias(@NonNull View itemView) {
            super(itemView);
            text1= itemView.findViewById(R.id.titulonoticias);
            text2=itemView.findViewById(R.id.descripcionnoticias);
            image=itemView.findViewById(R.id.imgnoticias);
            relativeLayout= itemView.findViewById(R.id.mainLayout);
        }
    }
}
