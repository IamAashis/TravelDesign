package com.project.travelapp_design.TabLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.travelapp_design.Adapter.SliderAdapter;
import com.project.travelapp_design.Model.InfoModel;
import com.project.travelapp_design.R;

import java.util.ArrayList;
import java.util.List;

public class Tab_Popular extends Fragment {

    List<InfoModel> infoModelss;
    RecyclerView tab_popular_recycleview;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.tab_popular, container, false);

        tab_popular_recycleview = rootview.findViewById(R.id.tabpopularrecycleview);

        infoModelss = new ArrayList<>();
        infoModelss.add(new InfoModel("BhoteKosi Nepal", R.mipmap.bungee));

        infoModelss.add(new InfoModel("Everest Base Camp", R.mipmap.everestbasecamp));

//        infoModelss.add(new InfoModel("Mardi Base Camp", R.mipmap.mardibasecamp));

        infoModelss.add(new InfoModel("Thulicho Lake", R.mipmap.thilicholake));

        infoModelss.add(new InfoModel("Annurpurna Base Camp", R.mipmap.annuprurna));

        LinearLayoutManager manager12 = new LinearLayoutManager(getActivity());
        manager12.setOrientation(LinearLayoutManager.HORIZONTAL);
        tab_popular_recycleview.setLayoutManager(manager12);

        SliderAdapter adaptor2 = new SliderAdapter(infoModelss, getContext());
        tab_popular_recycleview.setAdapter(adaptor2);


        return rootview;

    }
}
