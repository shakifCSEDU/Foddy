
package com.example.foody.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ExtendedIngredient {

    @SerializedName("amount")
    private Double mAmount;
    @SerializedName("consistency")
    private String mConsistency;

    @SerializedName("image")
    private String mImage;
    @SerializedName("name")
    private String mName;
    @SerializedName("original")
    private String mOriginal;


    public Double getAmount() {
        return mAmount;
    }

    public void setAmount(Double amount) {
        mAmount = amount;
    }

    public String getConsistency() {
        return mConsistency;
    }

    public void setConsistency(String consistency) {
        mConsistency = consistency;
    }


    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }


    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }


    public String getOriginal() {
        return mOriginal;
    }

    public void setOriginal(String original) {
        mOriginal = original;
    }


}
