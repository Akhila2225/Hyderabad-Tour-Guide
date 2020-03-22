package com.example.tourguide;
import android.content.Context;
import java.util.List;

public class Restaurant {

    public static void initRestaurantsList(List<Place> list, Context context) {

        list.add(new Place(
                context.getString(R.string.Restaurant_1_name),
                context.getString(R.string.Restaurant_1_description),
                context.getString(R.string.Restaurant_1_address),
                context.getString(R.string.Restaurant_1_ph),
                context.getString(R.string.Restaurant_1_timings),
                context.getString(R.string.Restaurant_1_cost),
                R.drawable.celeste
        ));

        list.add(new Place(
                context.getString(R.string.Restaurant_2_name),
                context.getString(R.string.Restaurant_2_description),
                context.getString(R.string.Restaurant_2_address),
                context.getString(R.string.Restaurant_2_ph),
                context.getString(R.string.Restaurant_2_timings),
                context.getString(R.string.Restaurant_2_cost),
                R.drawable.jewelofnizam
        ));

        list.add(new Place(
                context.getString(R.string.Restaurant_3_name),
                context.getString(R.string.Restaurant_3_description),
                context.getString(R.string.Restaurant_3_address),
                context.getString(R.string.Restaurant_3_ph),
                context.getString(R.string.Restaurant_3_timings),
                context.getString(R.string.Restaurant_3_cost),
                R.drawable.levantagecafebar
        ));

        list.add(new Place(
                context.getString(R.string.Restaurant_4_name),
                context.getString(R.string.Restaurant_4_description),
                context.getString(R.string.Restaurant_4_address),
                context.getString(R.string.Restaurant_4_ph),
                context.getString(R.string.Restaurant_4_timings),
                context.getString(R.string.Restaurant_4_cost),
                R.drawable.thewaterfront
        ));

    }
}
