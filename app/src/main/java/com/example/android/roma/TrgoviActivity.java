package com.example.android.roma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TrgoviActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        ArrayList<Visit> listOfVisits = new ArrayList<>();
        listOfVisits.add(new Visit(R.drawable.c_venezia, R.string.title_trgovi_a, R.string.description_coloseum));
        listOfVisits.add(new Visit(R.drawable.c_spagna, R.string.title_trgovi_b, R.string.description_coloseum));
        listOfVisits.add(new Visit(R.drawable.c_popolo, R.string.title_trgovi_c, R.string.description_coloseum));
        listOfVisits.add(new Visit(R.drawable.c_nevona, R.string.title_trgovi_d, R.string.description_coloseum));
        listOfVisits.add(new Visit(R.drawable.c_campidoglio, R.string.title_trgovi_e, R.string.description_coloseum));

        VisitAdapter adapter = new VisitAdapter(this,listOfVisits);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
