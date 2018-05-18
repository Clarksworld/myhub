package com.example.clarksworld.oboloapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class CardActivity extends AppCompatActivity {
    CardAdapter cardAdapter;
    RecyclerView recyclerView;
    public ArrayList<String> englishWords;
    public ArrayList<String> oboloWords;
    public ArrayList<Integer> wordsImages;
    public ArrayList<Integer> wordsButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
//        englishWords = new ArrayList<>();
//
//        englishWords.add("father");
//        englishWords.add("mother");
//        englishWords.add("brother");
//        englishWords.add("sister");
//        englishWords.add("uncle");
//        englishWords.add("anut");
//        englishWords.add("grandfather");
//        englishWords.add("grandmother");
//        englishWords.add("son");
//        englishWords.add("daughter");
//
//
//
//        oboloWords  = new ArrayList<>();
//        oboloWords.add("ute");
//        englishWords.add("uga");
//        englishWords.add("ngwag");
//        englishWords.add("ngwag");
//        englishWords.add("ngwag_ute");
//        englishWords.add("ngwag_uga");
//        englishWords.add("appa");
//        englishWords.add("mmah");
//        englishWords.add("ngwog_enerie");
//        englishWords.add("ngwog_enewah");
//
//        wordsImages = new ArrayList<>();
//        wordsImages.add(R.drawable.family_father);
//        wordsImages.add(R.drawable.family_mother);
//        wordsImages.add(R.drawable.family_older_brother);
//        wordsImages.add(R.drawable.family_older_sister);
//        wordsImages.add(R.drawable.family_younger_brother);
//        wordsImages.add(R.drawable.family_younger_sister);
//        wordsImages.add(R.drawable.family_grandfather);
//        wordsImages.add(R.drawable.family_grandmother);
//        wordsImages.add(R.drawable.family_son);
//        wordsImages.add(R.drawable.family_daughter);
//
//
//        wordsButtons = new ArrayList<>();
//        wordsButtons.add(R.raw.family_father);
//        wordsButtons.add(R.raw.family_mother);
//        wordsButtons.add(R.raw.family_older_brother);
//        wordsButtons.add(R.raw.family_older_sister);
//        wordsButtons.add(R.raw.family_younger_brother);
//        wordsButtons.add(R.raw.family_younger_sister);
//        wordsButtons.add(R.raw.family_grandfather);
//        wordsButtons.add(R.raw.family_grandmother);
//        wordsButtons.add(R.raw.family_son);
//        wordsButtons.add(R.raw.family_daughter);
//
//        cardAdapter = new CardAdapter(englishWords,oboloWords,wordsImages,wordsButtons, recyclerView.getContext());
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(cardAdapter);
        englishWords = new ArrayList<>();
        englishWords.add("Father");
        englishWords.add("mother");
        englishWords.add("Brother");
        englishWords.add("Sister");
        englishWords.add("Uncle");
        englishWords.add("Anut");
        englishWords.add("Grandfather");
        englishWords.add("Grandmother");
        englishWords.add("Son");
        englishWords.add("Daughter");


        oboloWords = new ArrayList<>();
        oboloWords.add("ute");
        oboloWords.add("uga");
        oboloWords.add("ngwag");
        oboloWords.add("ngwag");
        oboloWords.add("ngwa ute/uga");
        oboloWords.add("ngwa ute/uga");
        oboloWords.add("appa");
        oboloWords.add("mma");
        oboloWords.add("ngwog_enerie");
        oboloWords.add("ngwog_enewah");


        wordsImages = new ArrayList<>();
        wordsImages.add(R.drawable.family_father);
        wordsImages.add(R.drawable.family_mother);
        wordsImages.add(R.drawable.family_older_brother);
        wordsImages.add(R.drawable.family_older_sister);
        wordsImages.add(R.drawable.family_younger_brother);
        wordsImages.add(R.drawable.family_younger_sister);
        wordsImages.add(R.drawable.family_grandfather);
        wordsImages.add(R.drawable.family_grandmother);
        wordsImages.add(R.drawable.family_son);
        wordsImages.add(R.drawable.family_daughter);


        wordsButtons = new ArrayList<>();
        wordsButtons.add(R.raw.number_one);
        wordsButtons.add(R.raw.number_two);
        wordsButtons.add(R.raw.number_three);
        wordsButtons.add(R.raw.number_four);
        wordsButtons.add(R.raw.number_five);
        wordsButtons.add(R.raw.number_six);
        wordsButtons.add(R.raw.number_seven);
        wordsButtons.add(R.raw.number_eight);
        wordsButtons.add(R.raw.number_nine);
        wordsButtons.add(R.raw.number_ten);
        cardAdapter = new CardAdapter(englishWords,oboloWords,wordsImages,wordsButtons, recyclerView.getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(cardAdapter);



    }
}
