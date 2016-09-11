package com.zhiw.mvp;

/**
 * ClassName: MvpPresenter
 * Desc:
 * Created by zhiw on 16/9/11.
 */

public interface MvpPresenter<V extends MvpView> {

    void attachView(V view);

    void detachView();
}
