package com.example.foody.ui.fragments.recipes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foody.R;
import com.facebook.shimmer.ShimmerFrameLayout;

public class RecipesFragment extends Fragment {
    private ShimmerFrameLayout shimmerFrameLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_recipes, container, false);
        shimmerFrameLayout = (ShimmerFrameLayout)view.findViewById(R.id.shimmerId);
        shimmerFrameLayout.startShimmer();

        return view;
    }
}