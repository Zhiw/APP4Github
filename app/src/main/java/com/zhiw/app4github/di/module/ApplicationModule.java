package com.zhiw.app4github.di.module;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

/**
 * ClassName: ApplicationModule
 * Desc:
 * Created by zhiw on 16/9/19.
 */

@Module
public class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication(){
        return mApplication;
    }
}
