package com.example.android.roma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ParkoviActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        ArrayList<Visit> listOfVisits = new ArrayList<>();
        listOfVisits.add(new Visit(R.drawable.d_borgeze, R.string.title_parkovi_a, R.string.description_coloseum));
        listOfVisits.add(new Visit(R.drawable.d_pamphili, R.string.title_parkovi_b, R.string.description_coloseum));
        listOfVisits.add(new Visit(R.drawable.d_orange, R.string.title_parkovi_c, R.string.description_coloseum));
        listOfVisits.add(new Visit(R.drawable.d_ada, R.string.title_parkovi_d, R.string.description_coloseum));


        VisitAdapter adapter = new VisitAdapter(this,listOfVisits);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
