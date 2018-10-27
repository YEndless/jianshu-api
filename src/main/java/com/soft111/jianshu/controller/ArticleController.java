package com.soft111.jianshu.controller;

import com.soft111.jianshu.service.ArticleService;
import com.soft111.jianshu.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/article")
@CrossOrigin("http://localhost")
public class ArticleController {
    @Resource
    private ArticleService articleService;
    @GetMapping("/all")
    public ResponseUtil findAll(){
        return new ResponseUtil(0,"get all articles",articleService.findAll());
    }
    @PostMapping("/id")
    public ResponseUtil findArticle(@RequestParam String id){
        return new ResponseUtil(0,"get article by id",articleService.findArticle(id));
    }
}
