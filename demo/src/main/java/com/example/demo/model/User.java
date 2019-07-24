package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity(name = "_usr")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String usr;
    private String pass;
    private Boolean admin;
    private Boolean authority;
    private int eid;

    public User(int eid,String usr, String pass, Boolean admin, Boolean authority){
        this.admin=admin;
        this.eid=eid;
        this.usr=usr;
        this.pass=pass;
        this.authority=authority;
    }
    public User(){

    }

    public int getEid() {
        return eid;
    }

    public String getPass() {
        return pass;
    }

    public String getUsr() {
        return usr;
    }
    public Boolean getAdmin(){
        return admin;
    }

    public  Boolean getAuthority(){
        return authority;
    }
}
