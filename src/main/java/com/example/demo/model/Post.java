package com.example.demo.model;

import java.util.Date;

public class Post {
    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;
    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;
    }


    public String getText() {
        return text;
    }
    public Integer getLikes() {
        return likes;
    }
    public Long getId() { return id; }
    public Date getCreationDate() {
        return creationDate;
        //return new Date(creationDate.getTime());
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
