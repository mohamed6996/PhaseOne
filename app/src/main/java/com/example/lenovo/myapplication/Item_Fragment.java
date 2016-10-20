package com.example.lenovo.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Item_Fragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;


    List<ItemModel> mDataSet = new ArrayList<>();


    public Item_Fragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(layoutManager);

        //place holder arrays
        String[] film_name = {"some text", "some text", "some text", "some text", "some text", "some text", "some text", "some text", "some text", "some text", "some text"};
        String[] film_info = {"some text", "some text", "some text", "some text", "some text", "some text", "some text", "some text", "some text", "some text", "some text"};

        int[] thumbnails = {
                R.drawable.album1, R.drawable.album2, R.drawable.album3, R.drawable.album4, R.drawable.album5, R.drawable.album6, R.drawable.album7, R.drawable.album8, R.drawable.album9, R.drawable.album10, R.drawable.album11
        };



        int i = 0 ;
        for (String name : film_name) {
            ItemModel itemModel = new ItemModel(name, film_info[i], thumbnails[i]);
            mDataSet.add(itemModel);
            i++;
        }


        ItemAdapter adapter = new ItemAdapter(mDataSet);
        recyclerView.setAdapter(adapter);



        return view;
    }



}
