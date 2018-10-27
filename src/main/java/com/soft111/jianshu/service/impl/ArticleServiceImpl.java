package com.soft111.jianshu.service.impl;

import com.soft111.jianshu.dao.ArticleRepository;
import com.soft111.jianshu.entity.Article;
import com.soft111.jianshu.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleRepository articleRepository;
    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public Article findArticle(String id) {
        return articleRepository.findById(id).get();
    }
}
