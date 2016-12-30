package com.yangshenglong.newstarwardrobe.database;

import com.litesuits.orm.db.annotation.PrimaryKey;
import com.litesuits.orm.db.annotation.Table;
import com.litesuits.orm.db.enums.AssignType;

import java.util.ArrayList;

/**
 * Created by CST on 16/12/29.
 *
 * 登录注册相关的表 存储用户信息
 */
@Table("login")
public class LoginData {
    @PrimaryKey(AssignType.AUTO_INCREMENT)
    int id;

    // 账号
    String accountNum;
    // 密码
    String password;
    // 用户名
    String name;

    // 关注的人
    ArrayList<String> attentionName;
    // 粉丝
    ArrayList<String> fansName;
    // 收藏的单品
    ArrayList<String> person;
    // 收藏的帖子
    ArrayList<String> posts;

    public LoginData(String accountNum, String password) {
        this.accountNum = accountNum;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getAttentionName() {
        return attentionName;
    }

    public void setAttentionName(ArrayList<String> attentionName) {
        this.attentionName = attentionName;
    }

    public ArrayList<String> getFansName() {
        return fansName;
    }

    public void setFansName(ArrayList<String> fansName) {
        this.fansName = fansName;
    }

    public ArrayList<String> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<String> person) {
        this.person = person;
    }

    public ArrayList<String> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<String> posts) {
        this.posts = posts;
    }
}
