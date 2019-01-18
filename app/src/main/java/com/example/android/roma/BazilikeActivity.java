package com.example.android.roma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BazilikeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);


        ArrayList<Visit> listOfVisits = new ArrayList<>();
        listOfVisits.add(new Visit(R.drawable.b_peter, R.string.title_bazilike_a, R.string.description_coloseum));
        listOfVisits.add(new Visit(R.drawable.b_pantheon, R.string.title_bazilike_b, R.string.description_coloseum));
        listOfVisits.add(new Visit(R.drawable.b_paolo, R.string.title_bazilike_c, R.string.description_coloseum));
        listOfVisits.add(new Visit(R.drawable.b_maria, R.string.title_bazilike_d, R.string.description_coloseum));
        listOfVisits.add(new Visit(R.drawable.b_giovani, R.string.title_bazilike_e, R.string.description_coloseum));

        VisitAdapter adapter = new VisitAdapter(this,listOfVisits);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);



    }
}
