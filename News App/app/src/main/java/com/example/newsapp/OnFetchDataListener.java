package com.example.newsapp;

import com.example.newsapp.Model.NewsHeadline;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadline> list, String message);
    void onError(String message);
}
