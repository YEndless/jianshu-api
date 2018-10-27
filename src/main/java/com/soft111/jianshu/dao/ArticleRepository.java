package com.soft111.jianshu.dao;

import com.soft111.jianshu.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,String> {

}
