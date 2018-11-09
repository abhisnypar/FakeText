package com.example.saiabhinaypidugu.myfitnesspal.utils;

import com.example.saiabhinaypidugu.myfitnesspal.model.ArticlesQueryResponseResponseModel;

public class ConstanData {

    private static ArticlesQueryResponseResponseModel articlesQueryResponseResponseModel;
    public static final String ADAPTER_POSITION = "Adapter_Position";

    public static void setArticlesQueryResponseResponseModel(ArticlesQueryResponseResponseModel articlesQueryResponseResponseModel) {
        ConstanData.articlesQueryResponseResponseModel = articlesQueryResponseResponseModel;
    }

    public static ArticlesQueryResponseResponseModel getArticlesQueryResponseResponseModel() {
        return articlesQueryResponseResponseModel;
    }
}
