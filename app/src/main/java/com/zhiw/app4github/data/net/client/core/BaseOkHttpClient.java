package com.zhiw.app4github.data.net.client.core;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * ClassName: BaseOkHttpClient
 * Desc:
 * Created by zhiw on 16/9/21.
 */

public abstract class BaseOkHttpClient {

    private static final long TIMEOUT_CONNECT = 30 * 1000;

    public OkHttpClient get() {

        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        builder.connectTimeout(TIMEOUT_CONNECT, TimeUnit.MILLISECONDS);

        builder = customize(builder);

        return builder.build();
    }

    public abstract OkHttpClient.Builder customize(OkHttpClient.Builder builder);

}
