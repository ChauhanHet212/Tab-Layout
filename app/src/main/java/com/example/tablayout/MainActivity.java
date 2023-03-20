package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tab;
    ViewPager pager;
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab = findViewById(R.id.tab);
        pager = findViewById(R.id.pager);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new InfoFragment(), "Info");
        adapter.addFragment(new LiveFragment(), "Live");
        adapter.addFragment(new ScorecardFragment(), "Scorecard");
        adapter.addFragment(new SquadsFragment(), "Squads");
        adapter.addFragment(new OversFragment(), "Overs");
        adapter.addFragment(new HighlightsFragment(), "Highlights");
        pager.setAdapter(adapter);
        tab.setupWithViewPager(pager);
    }
}