package com.project.travelapp_design;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.project.travelapp_design.Adapter.NewSliderAdapter;
import com.project.travelapp_design.Adapter.SliderAdapter;
import com.project.travelapp_design.Model.InfoModel;
import com.project.travelapp_design.TabLayout.TabPageAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabItem tabrecomended, tabpopular, tabnewdestination, tabhiddenworld;
    TabPageAdapter tabPageAdapter;
    
    
    List<InfoModel> infoModelss;
    RecyclerView horizontal_slider;
    private Context Context;
    private Activity Activity;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabrecomended = findViewById(R.id.tabrecomended);
        tabpopular = findViewById(R.id.tabpopular);
        tabnewdestination = findViewById(R.id.tabnewdestination);
        tabhiddenworld = findViewById(R.id.tabhiddenworld);
        tabLayout = findViewById(R.id.tablayout);
        horizontal_slider = findViewById(R.id.horizontal_slider);

        viewPager = findViewById(R.id.viewpager);

        infoModelss = new ArrayList<>();
        infoModelss.add(new InfoModel("Annurpurna Base Camp", R.mipmap.annuprurna));
        infoModelss.add(new InfoModel("Kalinchok", R.mipmap.kalinchok));


        infoModelss.add(new InfoModel("Kathmandu Nepal", R.mipmap.patandurbar));

        infoModelss.add(new InfoModel("Poonhill", R.mipmap.poonhill));

        infoModelss.add(new InfoModel("Sayamndhu", R.mipmap.swayambhunath));


        LinearLayoutManager manager12 = new LinearLayoutManager(Activity);
        manager12.setOrientation(LinearLayoutManager.HORIZONTAL);
        horizontal_slider.setLayoutManager(manager12);

        NewSliderAdapter adaptor2 = new NewSliderAdapter(infoModelss, Context);
        horizontal_slider.setAdapter(adaptor2);
        
        
        tabPageAdapter = new TabPageAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,
                getBaseContext(), tabLayout.getTabCount());
        viewPager.setAdapter(tabPageAdapter);




        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Bundle bundle = getIntent().getExtras();
                viewPager.setCurrentItem(tab.getPosition());
//                if (tab.getPosition() == eid){
//                    tabPageAdapter.notifyDataSetChanged();
//                }else if(tab.getPosition() == id) {
//                    tabPageAdapter.notifyDataSetChanged();
//                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}