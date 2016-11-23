package com.zhiw.app4github.di.component;

import com.zhiw.app4github.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * ClassName: ApplicationComponent
 * Desc:
 * Created by zhiw on 16/9/20.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

}
