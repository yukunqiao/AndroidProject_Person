package com.example.appmvc;

/**
 * Created by asus on 2017/2/15.
 */

public interface IDatabaseHelper {
    boolean verifyUserName(String userName);
    boolean verifyUser(User user);
}
