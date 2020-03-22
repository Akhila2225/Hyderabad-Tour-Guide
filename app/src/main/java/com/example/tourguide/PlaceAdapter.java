package com.example.tourguide;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, int resources, List<Place> placeList) {
        super(context, 0, placeList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Place currentLocation = getItem(position);
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }

        TextView nameLocationTextView = (TextView) listItemView.findViewById(R.id.name_of_the_place);
        nameLocationTextView.setText(currentLocation.getName());

        TextView descriptionLocationTextView = (TextView) listItemView.findViewById(R.id.description_of_the_place);
        descriptionLocationTextView.setText(currentLocation.getDescription());

        TextView addressLocationTextView = (TextView) listItemView.findViewById(R.id.address_of_the_place);
        addressLocationTextView.setText(currentLocation.getAddress());

        TextView priceLocationTextView = (TextView) listItemView.findViewById(R.id.cost_for_the_place);
        priceLocationTextView.setText(currentLocation.getCost());

        TextView timingsLocationTextView = (TextView) listItemView.findViewById(R.id.timings_of_the_place);
        timingsLocationTextView.setText(currentLocation.getTimings());

        TextView phoneLocationTextView = (TextView) listItemView.findViewById(R.id.phone_number_text_view);
        phoneLocationTextView.setText(currentLocation.getPhone());

        ImageView photoLocationImageView = (ImageView) listItemView.findViewById(R.id.image_view);

        if (currentLocation.hasImage()) {
            photoLocationImageView.setImageResource(currentLocation.getImageResourceId());
            photoLocationImageView.setVisibility(View.VISIBLE);
        } else {
            photoLocationImageView.setVisibility(View.GONE);
        }

        if (currentLocation.hasPrice()) {
            priceLocationTextView.setVisibility(View.VISIBLE);
        } else {
            priceLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasTimings()) {
            timingsLocationTextView.setVisibility(View.VISIBLE);
        } else {
            timingsLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasAddress()) {
            addressLocationTextView.setVisibility(View.VISIBLE);
        } else {
            addressLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasPhone()) {
            phoneLocationTextView.setVisibility(View.VISIBLE);
        } else {
            phoneLocationTextView.setVisibility(View.GONE);
        }

        return listItemView;
    }

}

