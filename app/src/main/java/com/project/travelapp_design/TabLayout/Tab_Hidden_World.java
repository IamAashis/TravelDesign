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

public class Tab_Hidden_World extends Fragment {
    List<InfoModel> infoModelss;
    RecyclerView recycleviewhiddenworld;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.tab_hiddenworld, container, false);

        recycleviewhiddenworld = rootview.findViewById(R.id.recycleviewhiddenworld);

        infoModelss = new ArrayList<>();
        infoModelss.add(new InfoModel("Annurpurna Base Camp", R.mipmap.annuprurna));
        infoModelss.add(new InfoModel("Kalinchok", R.mipmap.kalinchok));


        infoModelss.add(new InfoModel("Kathmandu Nepal", R.mipmap.patandurbar));

        infoModelss.add(new InfoModel("Poonhill", R.mipmap.poonhill));

        infoModelss.add(new InfoModel("Sayamndhu", R.mipmap.swayambhunath));


        LinearLayoutManager manager12 = new LinearLayoutManager(getActivity());
        manager12.setOrientation(LinearLayoutManager.HORIZONTAL);
        recycleviewhiddenworld.setLayoutManager(manager12);

        SliderAdapter adaptor2 = new SliderAdapter(infoModelss, getContext());
        recycleviewhiddenworld.setAdapter(adaptor2);


        return rootview;
    }
}
