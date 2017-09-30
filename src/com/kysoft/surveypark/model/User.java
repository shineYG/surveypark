package com.kysoft.surveypark.model;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ky_pc
 * Date: 17-9-30
 * Time: 上午9:46
 * To change this template use File | Settings | File Templates.
 */
public class User {

    private Integer id;

    private String email;

    private String name;

    private String password;

    private String nickName;

    private Date regDate = new Date();

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getRegDate() {

        return regDate;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}


