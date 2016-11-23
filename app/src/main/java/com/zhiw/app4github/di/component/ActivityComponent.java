package com.zhiw.app4github.di.component;

import com.zhiw.app4github.di.module.ApplicationModule;

import android.app.Activity;

import dagger.Component;

/**
 * ClassName: ActivityComponent
 * Desc:
 * Created by zhiw on 16/10/27.
 */

@Component(dependencies = ApplicationModule.class,modules = ActivityComponent.class)
public interface ActivityComponent {

    Activity activity();
}
