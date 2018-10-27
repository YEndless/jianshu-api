package com.soft111.jianshu.service;

import com.soft111.jianshu.entity.Article;

import java.util.List;


public interface ArticleService {
    List<Article> findAll();
    Article findArticle(String id);
}
