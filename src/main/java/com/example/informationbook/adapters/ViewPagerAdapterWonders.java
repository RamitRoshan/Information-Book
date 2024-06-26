package com.example.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.informationbook.fragments.FragmentFrance;
import com.example.informationbook.fragments.FragmentItaly;
import com.example.informationbook.fragments.FragmentTajMahal;
import com.example.informationbook.fragments.FragmentUnitedKingdom;

public class ViewPagerAdapterWonders extends FragmentStateAdapter {


    public ViewPagerAdapterWonders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;

        switch (position)
        {
            case 0:
               fragment = FragmentTajMahal.newInstance();
               break;
            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
