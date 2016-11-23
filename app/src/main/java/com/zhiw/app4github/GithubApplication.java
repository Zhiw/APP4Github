package com.zhiw.app4github;

import com.zhiw.app4github.common.utils.LogUtil;

import android.app.Application;
import android.content.Context;

/**
 * ClassName: GitHubApplication
 * Desc:
 * Created by zhiw on 16/9/10.
 */

public class GitHubApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LogUtil.init();
    }

    public static GitHubApplication get(Context context){
        return (GitHubApplication)context.getApplicationContext();
    }
}
