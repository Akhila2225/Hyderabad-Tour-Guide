package com.example.tourguide;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

        private Context context;

        public FragmentAdapter(MainActivity context, FragmentManager fm) {
            super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
            this.context = context;
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new PlacesToVisitFragment();
            } else if (position == 1) {
                return new RestaurantFragment();
            } else if (position == 2){
                return new ShoppingMallFragment();
            } else {
                return new ThemeParksFragment();
            }
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0) {
                return context.getString(R.string.Tab1);
            } else if (position == 1) {
                return context.getString(R.string.Tab2);
            } else if (position == 2) {
                return context.getString(R.string.Tab3);
            } else {
                return context.getString(R.string.Tab4);
            }
        }
    }
