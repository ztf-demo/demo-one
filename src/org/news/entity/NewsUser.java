package org.news.entity;

import java.io.Serializable;

public class NewsUser implements Serializable {
    private static final long serialVersionUID = -7985708879680224193L;
    private String uid;
    private String uname;
    private String upwd;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public NewsUser(String uname, String upwd) {
        this.uname = uname;
        this.upwd = upwd;
    }

}
