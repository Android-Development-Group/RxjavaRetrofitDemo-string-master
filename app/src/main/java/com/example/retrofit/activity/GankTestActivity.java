package com.example.retrofit.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.example.retrofit.R;
import com.example.retrofit.entity.api.GankApi;
import com.example.retrofit.entity.resulte.BaseGankResultEntity;
import com.example.retrofit.entity.resulte.GankResulte;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;
import com.wzgiceman.rxretrofitlibrary.retrofit_rx.exception.ApiException;
import com.wzgiceman.rxretrofitlibrary.retrofit_rx.http.HttpManager;
import com.wzgiceman.rxretrofitlibrary.retrofit_rx.listener.HttpOnNextListener;

import java.util.List;

public class GankTestActivity extends RxAppCompatActivity implements HttpOnNextListener {

    private TextView tvMsg;

    //    公用一个HttpManager
    private HttpManager manager;
    //    post请求接口信息
    private GankApi postEntity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gank_test);

        tvMsg = (TextView) findViewById(R.id.tv_msg);

         /*初始化数据*/
        manager = new HttpManager(this, this);
        postEntity = new GankApi();
        postEntity.setMovieId(125805);

        manager.doHttpDeal(postEntity);
    }


    @Override
    public void onNext(String resulte, String method) {
        if (method.equals(postEntity.getMethod())) {
            BaseGankResultEntity<GankResulte> subjectResulte = JSONObject.parseObject(resulte, new
                    TypeReference<BaseGankResultEntity<GankResulte>>() {
                    });
            List<GankResulte.ContentBean> contentBeanList = subjectResulte.getData().getMini().getList();
            String s = contentBeanList.toString();
            Log.e("####", "onNext: " + s);

        }

    }

    @Override
    public void onError(ApiException e) {
        e.printStackTrace();
    }
}
