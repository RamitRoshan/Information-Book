package com.example.informationbook.activites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.informationbook.R;
import com.example.informationbook.adapters.ViewPagerAdapterWonders;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WondersActivity extends AppCompatActivity {

    private TabLayout tabLayoutWonders;
    private ViewPager2 viewPagerWonders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonders);

        tabLayoutWonders = findViewById(R.id.tabLayoutWonders);
        viewPagerWonders = findViewById(R.id.viewPagerWonders);

        ViewPagerAdapterWonders adapter = new ViewPagerAdapterWonders(getSupportFragmentManager(), getLifecycle());

        viewPagerWonders.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutWonders, viewPagerWonders
                , true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                if(position == 0)
                {
                    tab.setText("Taj Mahal");
                }

            }
        });

        tabLayoutMediator.attach();
    }
}