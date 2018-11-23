package com.example.lutfillahmafazi.bigwarrasulullah.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lutfillahmafazi.bigwarrasulullah.DetailPerangActivity;
import com.example.lutfillahmafazi.bigwarrasulullah.R;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    Context context;
    String [] namaPerang, detailPerang;
    int [] imgPerang;

    public Adapter(Context context, String[] namaPerang, String[] detailPerang, int[] imgPerang) {
        this.context = context;
        this.namaPerang = namaPerang;
        this.detailPerang = detailPerang;
        this.imgPerang = imgPerang;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_perang,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, final int i) {
        viewHolder.txtPerang.setText(namaPerang[i]);
        Glide.with(context).load(imgPerang[i]).into(viewHolder.imgPerang);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context,DetailPerangActivity.class);
                pindah.putExtra("np",namaPerang[i]);
                pindah.putExtra("dp",detailPerang[i]);
                pindah.putExtra("gp",imgPerang[i]);
                context.startActivity(pindah);
            }
        });

    }

    @Override
    public int getItemCount() {
        return imgPerang.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPerang;
        TextView txtPerang;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPerang = itemView.findViewById(R.id.imgList);
            txtPerang = itemView.findViewById(R.id.txtListTitle);
        }
    }
}
