
package com.example.foody.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class FoodRecipe {

    @SerializedName("results")
    private List<Result> mResults; // Here Result class


    public List<Result> getResults() {
        return mResults;
    }

    public void setResults(List<Result> results) {
        mResults = results;
    }


}
