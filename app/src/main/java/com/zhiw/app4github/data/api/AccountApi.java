package com.zhiw.app4github.data.api;

import com.zhiw.app4github.data.model.User;

import rx.Observable;

/**
 * ClassName: AccountApi
 * Desc:
 * Created by zhiw on 16/9/18.
 */

public interface AccountApi {

    Observable<User> login(String username, String password);
}
