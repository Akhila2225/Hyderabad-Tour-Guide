package com.example.tourguide;
import android.content.Context;
import java.util.List;


public class PlacesToVisit {

        public static void initiPlacesToVisitList(List<Place> list, Context context) {

            list.add(new Place(
                    context.getString(R.string.Monument1),
                    context.getString(R.string.Monument_1_description),
                    context.getString(R.string.Monument_1_address),
                    context.getString(R.string.Monument_1_ph),
                    context.getString(R.string.Monument_1_timings),
                    context.getString(R.string.Monument_1_cost),
                    R.drawable.charminar
            ));

            list.add(new Place(
                    context.getString(R.string.Monument2),
                    context.getString(R.string.Monument_2_description),
                    context.getString(R.string.Monument_2_address),
                    context.getString(R.string.Monument_2_ph),
                    context.getString(R.string.Monument_2_timings),
                    context.getString(R.string.Monument_2_cost),
                    R.drawable.golconda
            ));

            list.add(new Place(
                    context.getString(R.string.Monument3),
                    context.getString(R.string.Monument_3_description),
                    context.getString(R.string.Monument_3_address),
                    context.getString(R.string.Monument_3_ph),
                    context.getString(R.string.Monument_3_timings),
                    context.getString(R.string.Monument_3_cost),
                    R.drawable.birlamandir
            ));

            list.add(new Place(
                    context.getString(R.string.Monument4),
                    context.getString(R.string.Monument_4_description),
                    context.getString(R.string.Monument_4_address),
                    context.getString(R.string.Monument_4_ph),
                    context.getString(R.string.Monument_4_timings),
                    context.getString(R.string.Monument_4_cost),
                    R.drawable.museum
            ));

            list.add(new Place(
                    context.getString(R.string.Monument5),
                    context.getString(R.string.Monument_5_description),
                    context.getString(R.string.Monument_5_address),
                    context.getString(R.string.Monument_5_ph),
                    context.getString(R.string.Monument_5_timings),
                    context.getString(R.string.Monument_5_cost),
                    R.drawable.falaknuma
            ));
        }
    }
