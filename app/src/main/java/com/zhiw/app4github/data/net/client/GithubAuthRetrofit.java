package com.zhiw.app4github.data.net.client;

import com.zhiw.app4github.data.net.client.core.ApiEndpoint;
import com.zhiw.app4github.data.net.client.core.BaseRetrofit;

import okhttp3.OkHttpClient;

/**
 * ClassName: GithubAuthRetrofit
 * Desc:
 * Created by zhiw on 16/9/21.
 */

public class GithubAuthRetrofit extends BaseRetrofit {

    private static final String END_POINT = "https://api.github.com/";

    private String username;
    private String password;

    public void setAuthInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public ApiEndpoint getApiEndpoint() {
        return new ApiEndpoint() {
            @Override
            public String getEndpoint() {
                return END_POINT;
            }
        };
    }

    @Override
    public OkHttpClient getHttpClient() {
        return null;
    }
}
