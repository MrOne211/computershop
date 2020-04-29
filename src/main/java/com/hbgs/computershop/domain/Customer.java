package com.hbgs.computershop.domain;

public class Customer {
    private int id;
    private String cname;
    private String img;
    private int addrid;
    private String addr;
    private String username;
    private String password;

    public Customer(int id, String cname, String img, int addrid, String addr, String username, String password) {
        this.id = id;
        this.cname = cname;
        this.img = img;
        this.addrid = addrid;
        this.addr = addr;
        this.username = username;
        this.password = password;
    }

    public Customer(String cname, String img, int addrid, String addr, String username, String password) {
        this.cname = cname;
        this.img = img;
        this.addrid = addrid;
        this.addr = addr;
        this.username = username;
        this.password = password;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getAddrid() {
        return addrid;
    }

    public void setAddrid(int addrid) {
        this.addrid = addrid;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", img='" + img + '\'' +
                ", addrid=" + addrid +
                ", addr='" + addr + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
