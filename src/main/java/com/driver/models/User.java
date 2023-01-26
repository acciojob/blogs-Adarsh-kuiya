package com.driver.models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String userName;

    private String password;

//    private String firstName;

//    private String lastName;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Blog> blogsList;

    public User() {
    }



    public List<Blog> getBlogsList() {
        return blogsList;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void setBlogsList(List<Blog> blogsList) {
        this.blogsList = blogsList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getFirstName() {
//        return firstName;
//    }

//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }

//    public String getLastName() {
//        return lastName;
//    }

//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
}