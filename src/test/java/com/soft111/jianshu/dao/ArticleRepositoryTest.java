package com.soft111.jianshu.dao;

import com.soft111.jianshu.entity.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ArticleRepositoryTest {
    @Resource
    private ArticleRepository articleRepository;
    @Test
    public void init() {
        Article[] articles = {
                new Article(
                        "1234ab4d6699ba75016699ba7e570000",
                        "111",
                        "Microsoft Office 2019 正式版已经发布赶紧试一试",
                        "近日微软发布了久违的 Microsoft Office 2019 正式版，不过仅支持Win10系统。office的激活工具在文章最后。 截止到目...",
                        "//upload-images.jianshu.io/upload_images/11438883-c2ce0d060f9ff5cb?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240",
                        "近日微软发布了久违的 Microsoft Office 2019 正式版，不过仅支持Win10系统。office的激活工具在文章最后。",
                        548L,
                        822L,
                        6L,
                        15L,
                        "2018.10.02 14:31"),
                new Article(
                        "1234ab4d6699ba75016699ba7e940001",
                        "111",
                        "“不是你好看，而是你看起来很好追”",
                        "文/番茄十八 刚刚在网上看到有人说：“好看的皮囊太多，温柔的灵魂才是重点，我有一同学，颜值5分，普普通通，保守文静，放人堆儿里也不出挑，身边却有...",
                        "//upload-images.jianshu.io/upload_images/6511360-abe3fe6bd6b9f08d.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240",
                        "刚刚在网上看到有人说：“好看的皮囊太多，温柔的灵魂才是重点，我有一同学，颜值5分，普普通通，保守文静，放人堆儿里也不出挑，身边却有挺多人追。",
                        2704L,
                        7235L,
                        42L,
                        235L,
                        "2018.10.09 16:42"),
                new Article(
                        "4028ab4d6699ba75016699ba7e970002",
                        "111",
                        "微信再次改版，内容运营该何去何从？",
                        "就在今晚，微信6.7.3 iOS版正式更新了！ 作为每天都需要和微信打交道的产品狗，听到这个消息后，立马更新了最新版微信体验了一番。这篇文章主要...",
                        "//upload-images.jianshu.io/upload_images/6877825-7de349446dadbcd5.png?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240",
                        "作为每天都需要和微信打交道的产品狗，听到这个消息后，立马更新了最新版微信体验了一番。这篇文章主要分析这次更新带来的改变，以及在微信体系下的运营该如何应对此次改版带来的冲击。",
                        1146L,
                        2343L,
                        0L,
                        22L,
                        "2018.09.25 23:32"),
                new Article(
                        "4028ab4d6699ba75016699ba7e990003",
                        "111",
                        "VS Code：让你工作效率翻倍的23个插件和23个编辑技巧",
                        "总结了一些平时常用且好用的 VS Code 的插件和编辑技巧分享出来。 文章详情可查阅我的博客：https://lishaoy.net 外观 主...",
                        "//upload-images.jianshu.io/upload_images/5211787-682dce301fa55675?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240",
                        "总结了一些平时常用且好用的 VS Code 的插件和编辑技巧分享出来。",
                        1233L,
                        272L,
                        0L,
                        10L,
                        "2018.10.15 20:26"),
                new Article(
                        "4028ab4d6699ba75016699ba7e9b0004",
                        "111",
                        "7款功能炸裂的手机APP，来给你手机加点料！",
                        "想让手机有灵魂，逼格高，好用的手机APP是少不了的，那么你的手机里有多少自己觉得超好用的手机APP呢？小编今天给大家分享6个功能炸裂的手机APP...",
                        "//upload-images.jianshu.io/upload_images/11438883-d81621a8cebda589?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240",
                        "想让手机有灵魂，逼格高，好用的手机APP是少不了的，那么你的手机里有多少自己觉得超好用的手机APP呢？小编今天给大家分享6个功能炸裂的手机APP，简直太牛了。",
                        703L,
                        920L,
                        0L,
                        17L,
                        "2018.10.01 10:25"),
        };
        for (Article a :articles) {
            articleRepository.save(a);
        }
    }
}