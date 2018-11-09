package com.example.saiabhinaypidugu.myfitnesspal.restApi;

import com.example.saiabhinaypidugu.myfitnesspal.model.ArticlesQueryResponseResponseModel;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ArticlesQueryApi {

    @GET("svc/search/v2/articlesearch.json")
    Observable<ArticlesQueryResponseResponseModel> getArticles(@Query("api-key") String API_KEY);
}
