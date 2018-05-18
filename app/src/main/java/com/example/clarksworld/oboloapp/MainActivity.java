package com.example.clarksworld.oboloapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    public ArrayList<String> englishWords;
    public ArrayList<String> oboloWords;
    public ArrayList<Integer> wordsImages;
    public ArrayList<Integer> wordsButtons;
    CardAdapter cardAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
         englishWords = new ArrayList<>();
         englishWords.add("One");
         englishWords.add("Two");
        englishWords.add("Three");
        englishWords.add("Four");
        englishWords.add("Five");
        englishWords.add("Six");
        englishWords.add("Seven");
        englishWords.add("Eight");
        englishWords.add("Nine");
        englishWords.add("Ten");

        oboloWords = new ArrayList<>();
        oboloWords.add("Ngehe");
        oboloWords.add("Ibaa");
        oboloWords.add("Itaa");
        oboloWords.add("Inii");
        oboloWords.add("Goo");
        oboloWords.add("Ngwerengwen");
        oboloWords.add("Saiba");
        oboloWords.add("Sieitaa");
        oboloWords.add("Anannge");
        oboloWords.add("Okop");

        wordsImages = new ArrayList<>();
        wordsImages.add(R.drawable.number_one);
        wordsImages.add(R.drawable.number_two);
        wordsImages.add(R.drawable.number_three);
        wordsImages.add(R.drawable.number_four);
        wordsImages.add(R.drawable.number_five);
        wordsImages.add(R.drawable.number_six);
        wordsImages.add(R.drawable.number_seven);
        wordsImages.add(R.drawable.number_eight);
        wordsImages.add(R.drawable.number_nine);
        wordsImages.add(R.drawable.number_ten);


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




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    //        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//
//        });

}
