package com.example.clarksworld.oboloapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by CLARKSWORLD on 15/12/2017.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
    public ArrayList<String> englishWords;
    public ArrayList<String> oboloWords;
    public ArrayList<Integer> wordsImages;
    public ArrayList<Integer> wordsButtons;

    public Context mContext;

    public CardAdapter(ArrayList<String> englishWords, ArrayList<String> oboloWords, ArrayList<Integer> wordsImages,
                       ArrayList<Integer> wordsButtons, Context mContext) {
        this.englishWords = englishWords;
        this.oboloWords = oboloWords;
        this.wordsImages = wordsImages;
        this.wordsButtons = wordsButtons;
        this.mContext = mContext;
    }

    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate
                (R.layout.custom_layout,parent,false);
        return new CardAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CardAdapter.ViewHolder holder, final int position) {
        holder.textViewEnglih.setText(englishWords.get(position));
        holder.textViewobolo.setText(oboloWords.get(position));
        holder.imageView.setImageResource(wordsImages.get(position));
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(mContext, "you pressed me", Toast.LENGTH_SHORT).show();
                wordsButtons.get(position);


            }
        });

    }

    @Override
    public int getItemCount() {
        return englishWords.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewEnglih, textViewobolo;
        Button button;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
            textViewEnglih = itemView.findViewById(R.id.tv_englsih);
            textViewobolo = itemView.findViewById(R.id.tv_obolo);
            button = itemView.findViewById(R.id.card_button);
        }
    }
}
