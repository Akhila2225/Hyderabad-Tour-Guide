package com.example.tourguide;

import android.content.Context;

import java.util.List;

public class ThemeParks {

        public static void initiThemeParksList(List<Place> list, Context context) {

            list.add(new Place(
                    context.getString(R.string.Park1),
                    context.getString(R.string.Park_1_description),
                    context.getString(R.string.Park_1_address),
                    context.getString(R.string.Park_1_ph),
                    context.getString(R.string.Park_1_timings),
                    null,
                    R.drawable.ntrgardens
            ));

            list.add(new Place(
                    context.getString(R.string.Park2),
                    context.getString(R.string.Park_2_description),
                    context.getString(R.string.Park_2_address),
                    context.getString(R.string.Park_2_ph),
                    context.getString(R.string.Park_2_timings),
                    null,
                    R.drawable.lumbinipark
            ));


            list.add(new Place(
                    context.getString(R.string.Park3),
                    context.getString(R.string.Park_3_description),
                    context.getString(R.string.Park_3_address),
                    context.getString(R.string.Park_3_ph),
                    context.getString(R.string.Park_3_timings),
                    null,
                    R.drawable.ramojifilmcity
            ));

            list.add(new Place(
                    context.getString(R.string.Park4),
                    context.getString(R.string.Park_4_description),
                    context.getString(R.string.Park_4_address),
                    context.getString(R.string.Park_4_ph),
                    context.getString(R.string.Park_4_timings),
                    null,
                    R.drawable.oceanpark
            ));

            list.add(new Place(
                    context.getString(R.string.Park5),
                    context.getString(R.string.Park_5_description),
                    context.getString(R.string.Park_5_address),
                    context.getString(R.string.Park_5_ph),
                    context.getString(R.string.Park_5_timings),
                    null,
                    R.drawable.nehruzoo
            ));

        }
    }


