package com.emmett.choiceboard.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Choice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String text;
    private String imageUrl;

    public Choice() {}

    public Choice(String text, String imageUrl) {
        this.text = text;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString(){
        return "Choice{" +
                "id=" + id  +
                ", text='" + text + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                "}";
    }
}
