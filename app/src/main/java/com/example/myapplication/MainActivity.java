package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Window;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabId;
    private ViewPager vpId;

    private List<Fragment> list = new ArrayList<>();
    private List<String> titles = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        tabId = findViewById(R.id.tab_id);
        vpId = findViewById(R.id.vp_id);

        list.add(new MainFragment());
        list.add(new fragment());

        titles.add("111");
        titles.add("222");

        ViewPagerAdapte myFragmentAdapter = new ViewPagerAdapte(getSupportFragmentManager(), list, titles);
        vpId.setAdapter(myFragmentAdapter);

        tabId.setupWithViewPager(vpId);
    }
}
