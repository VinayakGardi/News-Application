package com.example.newsapplication_integration;

import com.example.newsapplication_integration.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener <NewsApiResponse>
{
    void onFetchData(List<NewsHeadlines> list , String message);
    void onError(String message);
}



