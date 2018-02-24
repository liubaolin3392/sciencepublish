package com.sciencepublish.model;

/**
 * Created by 47163 on 2017/12/20.
 */
public class User
{
    private String userId;
    private String pwd;

    public User() {
    }

    public User(String userId, String pwd) {
        this.userId = userId;
        this.pwd = pwd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
