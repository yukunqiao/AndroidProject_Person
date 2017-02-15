package com.example.asus.mvpmvcdemo.presenter;

import android.os.Handler;

import com.example.asus.mvpmvcdemo.model.ILoginService;
import com.example.asus.mvpmvcdemo.model.IUserService;
import com.example.asus.mvpmvcdemo.model.User;
import com.example.asus.mvpmvcdemo.model.UserService;
import com.example.asus.mvpmvcdemo.view.ILoginView;


/**
 * Created by asus on 2017/2/15.
 */

public class LoginPresenter {
    private IUserService userService;
    private ILoginView loginView;

    private Handler handler = new Handler();

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
        this.userService = new UserService();
    }

    public void login(){
        userService.login(loginView.getUserName(), loginView.getPassword(), new ILoginService() {
            @Override
            public void loginSuccess(final User user) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        loginView.showSuccess(user);
                    }
                });
            }

            @Override
            public void loginFailed() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        loginView.showFaileError();
                    }
                });
            }
        });
    }
}
