package com.driver.models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "Image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;

    private  String dimension;


    @ManyToOne
    @JoinColumn
    private Blog blog;





    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Image(int id, String description, String dimension) {
        this.id = id;
        this.description = description;
        this.dimension = dimension;
    }

    public Image(String description, String dimension) {
        this.description = description;
        this.dimension = dimension;
    }

    public Image() {
    }
}