package com.example.retrofit.entity.api;

import com.example.retrofit.HttpPostService;
import com.wzgiceman.rxretrofitlibrary.retrofit_rx.Api.BaseApi;

import java.util.HashMap;

import retrofit2.Retrofit;
import rx.Observable;

/**
 * Description:
 * Copyright  : Copyright (c) 2017
 * Email      : jusenr@163.com
 * Company    : 葡萄科技
 * Author     : Jusenr
 * Date       : 2017/4/12 10:40.
 */

public class GankApi extends BaseApi {
    private HashMap<String, String> mParams;

    private int movieId;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public GankApi() {
        setBaseUrl("https://ticket-api-m.mtime.cn/");
        setMethod("movie/hotComment.api");

        mParams = new HashMap<>();
    }

    @Override
    public Observable getObservable(Retrofit retrofit) {
        HttpPostService httpService = retrofit.create(HttpPostService.class);
        mParams.put("movieId", String.valueOf(getMovieId()));
        return httpService.getFilmReview(mParams);
    }
}
