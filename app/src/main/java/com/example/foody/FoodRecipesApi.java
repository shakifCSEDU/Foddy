package com.example.foody;

import com.example.foody.models.FoodRecipe;

import java.util.Map;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface FoodRecipesApi {

    @GET("/recipes/complexSearch")
    Response<FoodRecipe>getRecipes(@QueryMap Map<String,String>queries);

}
