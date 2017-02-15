package com.example.asus.mvpmvcdemo.model;

/**
 * Created by asus on 2017/2/15.
 */

public interface ILoginService {

    void loginSuccess(User user);
    void loginFailed();
}
