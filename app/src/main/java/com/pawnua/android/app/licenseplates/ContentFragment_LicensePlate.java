package com.pawnua.android.app.licenseplates;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.pawnua.android.app.licenseplates.model.LicensePlate;
import com.pawnua.android.app.licenseplates.util.InitLicensePlate;

/**
 * Created by Admin on 04-06-2015.
 */
public class ContentFragment_LicensePlate extends Fragment {

    public LicensePlateAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.content_fragment_license_plate,container,false);

        adapter = new LicensePlateAdapter(new InitLicensePlate().initList());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();

        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.avtolistView);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(itemAnimator);

        return v;
    }


}
