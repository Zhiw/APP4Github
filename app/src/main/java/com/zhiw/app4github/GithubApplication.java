package com.zhiw.app4github;

import com.zhiw.app4github.common.utils.LogUtil;

import android.app.Application;
import android.content.Context;

/**
 * ClassName: GithubApplication
 * Desc:
 * Created by zhiw on 16/9/10.
 */

public class GithubApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LogUtil.init();
    }

    public static GithubApplication get(Context context){
        return (GithubApplication)context.getApplicationContext();
    }
}
