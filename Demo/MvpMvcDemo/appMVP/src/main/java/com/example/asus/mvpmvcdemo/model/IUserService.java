package com.example.asus.mvpmvcdemo.model;

/**
 * Created by asus on 2017/2/15.
 */

public interface IUserService {
    void login(String userName,String password,ILoginService loginService);
}
