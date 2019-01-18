package com.example.android.roma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ZnamenitostiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        ArrayList<Visit> listOfVisits = new ArrayList<>();
        listOfVisits.add(new Visit(R.drawable.a_colloseum, R.string.title_znamen_a, R.string.description_coloseum));
        listOfVisits.add(new Visit(R.drawable.a_trevi, R.string.title_znamen_b, R.string.description_coloseum));
        listOfVisits.add(new Visit(R.drawable.a_vittoriano, R.string.title_znamen_c, R.string.description_coloseum));
        listOfVisits.add(new Visit(R.drawable.a_roman_forum, R.string.title_znamen_d, R.string.description_coloseum));
        listOfVisits.add(new Visit(R.drawable.a_castel, R.string.title_znamen_e, R.string.description_coloseum));

        VisitAdapter adapter = new VisitAdapter(this,listOfVisits);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
