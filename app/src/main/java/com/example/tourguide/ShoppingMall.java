package com.example.tourguide;
import android.content.Context;
import java.util.List;

public class ShoppingMall {

    public static void initShoppingMallList(List<Place> list, Context context) {

        list.add(new Place(
                context.getString(R.string.Shoppingmall1),
                context.getString(R.string.Shoppingmall_1_description),
                context.getString(R.string.Shoppingmall_1_address),
                context.getString(R.string.Shoppingmall_1_ph),
                context.getString(R.string.Shoppingmall_1_timings),
                null,
                R.drawable.hyderabadcentral
        ));

        list.add(new Place(
                context.getString(R.string.Shoppingmall2),
                context.getString(R.string.Shoppingmall_2_description),
                context.getString(R.string.Shoppingmall_2_address),
                context.getString(R.string.Shoppingmall_2_ph),
                context.getString(R.string.Shoppingmall_2_timings),
                null,
                R.drawable.inorbitmall
        ));


        list.add(new Place(
                context.getString(R.string.Shoppingmall3),
                context.getString(R.string.Shoppingmall_3_description),
                context.getString(R.string.Shoppingmall_3_address),
                context.getString(R.string.Shoppingmall_3_ph),
                context.getString(R.string.Shoppingmall_3_timings),
                null,
                R.drawable.citycentermall
        ));

        list.add(new Place(
                context.getString(R.string.Shoppingmall4),
                context.getString(R.string.Shoppingmall_4_description),
                context.getString(R.string.Shoppingmall_4_address),
                context.getString(R.string.Shoppingmall_4_ph),
                context.getString(R.string.Shoppingmall_4_timings),
                null,
                R.drawable.sujanamall
        ));

        list.add(new Place(
                context.getString(R.string.Shoppingmall5),
                context.getString(R.string.Shoppingmall_5_description),
                context.getString(R.string.Shoppingmall_5_address),
                context.getString(R.string.Shoppingmall_5_ph),
                context.getString(R.string.Shoppingmall_5_timings),
                null,
                R.drawable.citycentermall
        ));

    }
}