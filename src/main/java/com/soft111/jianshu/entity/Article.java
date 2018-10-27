package com.soft111.jianshu.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
//@Builder
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
public class Article {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String id;
    private String authorId;
    private String collectionId;
    private String title;
    private String synopsis;
    private String cover;
    private String content;
    private Long wordCounts;
    private Long readCounts;
    private Long comments;
    private Long likes;
    private String creationTime;

    public Article(String authorId, String collectionId, String title, String synopsis, String cover, String content, Long wordCounts, Long readCounts, Long comments, Long likes, String creationTime) {
        this.authorId = authorId;
        this.collectionId = collectionId;
        this.title = title;
        this.synopsis = synopsis;
        this.cover = cover;
        this.content = content;
        this.wordCounts = wordCounts;
        this.readCounts = readCounts;
        this.comments = comments;
        this.likes = likes;
        this.creationTime = creationTime;
    }

    public Article() {
    }
}
