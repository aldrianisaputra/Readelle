package com.example.TeoriMobile10_AldrianiSaputra_056;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewHeroAdapter extends RecyclerView.Adapter<CardViewHeroAdapter.CardViewViewHolder> {
    private ArrayList<Hero> listHero;

    public CardViewHeroAdapter(ArrayList<Hero> list) {
        this.listHero = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_hero, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        Hero hero = listHero.get(position);

        Glide.with(holder.itemView.getContext())
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.tvName.setText(hero.getName());
        holder.tvAuthor.setText("Author : " + hero.getAuthor());
        holder.tvGenre.setText("Genre : " + hero.getGenre());
        holder.tvYear.setText("Year : " + hero.getYear());
        holder.tvDetail.setText(hero.getDetail());

        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Buku " + listHero.get(holder.getAdapterPosition()).getName() +
                        " telah dimasukkan ke dalam pustaka Favorite";
                Toast.makeText(holder.itemView.getContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Buku " + listHero.get(holder.getAdapterPosition()).getName() +
                        " Berhasil dishare";
                Toast.makeText(holder.itemView.getContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Buku " + listHero.get(holder.getAdapterPosition()).getName() +
                        " telah dimasukkan ke dalam pustaka Reading";
                Toast.makeText(holder.itemView.getContext(), message, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listHero.size();
    }

    // ViewHolder should be defined once, not nested inside itself
    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvAuthor, tvGenre, tvYear;
        Button btnFavorite, btnShare, btnRead;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvAuthor = itemView.findViewById(R.id.tv_item_author); // Corrected here
            tvGenre = itemView.findViewById(R.id.tv_item_genre); // Corrected here
            tvYear = itemView.findViewById(R.id.tv_item_year); // Corrected here
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
            btnRead = itemView.findViewById(R.id.btn_read);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
