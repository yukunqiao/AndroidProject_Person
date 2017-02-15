package com.example.asus.mvpmvcdemo.view;

import com.example.asus.mvpmvcdemo.model.User;

/**
 * Created by asus on 2017/2/15.
 */

public interface ILoginView {
    String getUserName();
    String getPassword();
    void showSuccess(User user);
    void showFaileError();
}
