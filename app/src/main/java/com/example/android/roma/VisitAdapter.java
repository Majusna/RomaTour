package com.example.android.roma;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class VisitAdapter extends ArrayAdapter<Visit> {


    public VisitAdapter(@NonNull Activity context, ArrayList<Visit> visits) {

        super(context, 0, visits);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Visit currentVisit = (Visit) getItem(position);

        ImageView currentImageView = listItemView.findViewById(R.id.id_item_image);
        currentImageView.setImageResource(currentVisit.getImageResource());

        TextView currentTitle = listItemView.findViewById(R.id.id_item_title);
        currentTitle.setText(currentVisit.getTitle());

        TextView currentDescription = listItemView.findViewById(R.id.id_item_description);
        currentDescription.setText(currentVisit.getDescription());


        return listItemView;
    }
}
