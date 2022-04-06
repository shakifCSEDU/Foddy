
package com.example.foody.models;

import java.util.List;

import com.example.foody.models.ExtendedIngredient;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("aggregateLikes")
    private Long mAggregateLikes;
    @SerializedName("cheap")
    private Boolean mCheap;
    @SerializedName("dairyFree")
    private Boolean mDairyFree;
    @SerializedName("extendedIngredients")
    private List<ExtendedIngredient> mExtendedIngredients; // Here ExtendedIngredient class.
    @SerializedName("glutenFree")
    private Boolean mGlutenFree;
    @SerializedName("id")
    private Long mId;
    @SerializedName("image")
    private String mImage;
    @SerializedName("readyInMinutes")
    private Long mReadyInMinutes;
    @SerializedName("sourceName")
    private String mSourceName;
    @SerializedName("sourceUrl")
    private String mSourceUrl;
    @SerializedName("summary")
    private String mSummary;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("vegan")
    private Boolean mVegan;
    @SerializedName("vegetarian")
    private Boolean mVegetarian;
    @SerializedName("veryHealthy")
    private Boolean mVeryHealthy;

    public Long getAggregateLikes() {
        return mAggregateLikes;
    }

    public void setAggregateLikes(Long aggregateLikes) {
        mAggregateLikes = aggregateLikes;
    }

    public Boolean getCheap() {
        return mCheap;
    }

    public void setCheap(Boolean cheap) {
        mCheap = cheap;
    }


    public Boolean getDairyFree() {
        return mDairyFree;
    }

    public void setDairyFree(Boolean dairyFree) {
        mDairyFree = dairyFree;
    }

    public List<ExtendedIngredient> getExtendedIngredients() {
        return mExtendedIngredients;
    }

    public void setExtendedIngredients(List<ExtendedIngredient> extendedIngredients) {
        mExtendedIngredients = extendedIngredients;
    }

    public Boolean getGlutenFree() {
        return mGlutenFree;
    }

    public void setGlutenFree(Boolean glutenFree) {
        mGlutenFree = glutenFree;
    }


    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }


    public Long getReadyInMinutes() {
        return mReadyInMinutes;
    }

    public void setReadyInMinutes(Long readyInMinutes) {
        mReadyInMinutes = readyInMinutes;
    }

    public String getSourceName() {
        return mSourceName;
    }

    public void setSourceName(String sourceName) {
        mSourceName = sourceName;
    }

    public String getSourceUrl() {
        return mSourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        mSourceUrl = sourceUrl;
    }


    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }


    public Boolean getVegan() {
        return mVegan;
    }

    public void setVegan(Boolean vegan) {
        mVegan = vegan;
    }

    public Boolean getVegetarian() {
        return mVegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        mVegetarian = vegetarian;
    }

    public Boolean getVeryHealthy() {
        return mVeryHealthy;
    }

    public void setVeryHealthy(Boolean veryHealthy) {
        mVeryHealthy = veryHealthy;
    }


}
