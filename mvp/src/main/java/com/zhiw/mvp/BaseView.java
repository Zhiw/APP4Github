package com.zhiw.mvp;

/**
 * ClassName: BaseView
 * Desc:
 * Created by zhiw on 16/9/11.
 */

public interface BaseView extends MvpView {

    void showLoading(boolean isShow);

    void showError(Throwable e);
}
