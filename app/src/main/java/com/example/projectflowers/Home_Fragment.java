package com.example.projectflowers;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projectflowers.adapter.CategoryAdapter;
import com.example.projectflowers.model.Category;

import java.util.ArrayList;
import java.util.List;


public class Home_Fragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    RecyclerView categoryRecycler;
    CategoryAdapter categoryAdapter;


    public Home_Fragment() {
        // Required empty public constructor
    }


    public static Home_Fragment newInstance(String param1, String param2) {
        Home_Fragment fragment = new Home_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home_, container, false);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, getString(R.string.home_navigation_bar_monobouquets)));
        categoryList.add(new Category(2, getString(R.string.home_navigation_bar_dried)));
        categoryList.add(new Category(3, getString(R.string.home_navigation_bar_collected)));
        categoryList.add(new Category(4, getString(R.string.home_navigation_bar_wedding)));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        categoryRecycler = view.findViewById(R.id.RecyclerViewCategory);
        categoryRecycler.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(getContext(), categoryList);
        categoryRecycler.setAdapter(categoryAdapter);

        return view;
    }

}