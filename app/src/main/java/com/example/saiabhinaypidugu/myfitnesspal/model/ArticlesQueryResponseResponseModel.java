package com.example.saiabhinaypidugu.myfitnesspal.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;
import retrofit2.http.GET;

@Getter
@Setter
public class ArticlesQueryResponseResponseModel {

    @SerializedName("response")
    @Expose
    public ArticleQueryResponseModel response;

}
