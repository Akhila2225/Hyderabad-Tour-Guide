package com.example.tourguide;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import androidx.fragment.app.Fragment;

public class RestaurantFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<Place> list = new ArrayList<>();
        Restaurant.initRestaurantsList(list, getContext());

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), -1, list);
        ListView listView = (ListView) inflater.inflate(R.layout.list_view, container, false);

        listView.setAdapter(adapter);

        return listView;
    }
}