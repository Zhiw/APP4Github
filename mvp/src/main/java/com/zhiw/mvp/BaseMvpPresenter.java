package com.zhiw.mvp;

/**
 * ClassName: BaseMvpPresenter
 * Desc:
 * Created by zhiw on 16/9/11.
 */

public class BaseMvpPresenter<V extends MvpView> implements MvpPresenter<V> {
    private V mvpView;

    @Override
    public void attachView(V view) {
        mvpView = view;

    }

    @Override
    public void detachView() {
        mvpView = null;

    }

    public V getMvpView() {
        return mvpView;
    }
}
