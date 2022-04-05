package com.example.doramaapp;



import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageController extends FragmentPagerAdapter{
        int numoftabs;

        public PageController(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
            this.numoftabs = behavior;
        }

    @NonNull
    @Override
    public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new Informacion();
                case 1:
                    return new EscucharFragment();
                case 2:
                    return new AgendaFragment();
              /*  case 3:
                    return new AgendaFragment();*/
                default:
                    return null;
            }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}

