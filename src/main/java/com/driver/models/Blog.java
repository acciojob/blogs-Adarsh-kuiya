package com.driver.models;

import org.hibernate.annotations.MetaValue;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "Blog")
public  class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String content;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date pubDate;


    @ManyToOne
    @JoinColumn
    private User user;


    @OneToMany(mappedBy = "blog",cascade = CascadeType.ALL)
    private List<Image>imageList ;


    public Blog() {
    }

    public Blog(int id, String title, String content) {
        this.id = id;
        this.content = content;
        this.title = title;

    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }



}