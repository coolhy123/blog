package cn.blog.service.blog.impl;

import cn.blog.entity.article.Article;
import cn.blog.mapper.blog.ArticleMapper;
import cn.blog.service.blog.ArticleService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by Administrator on 2019/2/15.
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;


    /**
     * 查询所有博客
     * @return
     */
    @Override
    public List<Article> queryAllBlog() {
        return articleMapper.getAllBlog();
    }

    /**
     * 删除博客
     * @param blogId
     * @return
     */
    @Override
    public int removeBlogByBlogId(@Param("articleId") String blogId) {
        return articleMapper.deleteBlogByBlogId(blogId);
    }

    /**
     * 修改某一篇博客文章
     * @param article
     * @return
     */
    @Override
    public int modifyBlog(Article article) {
        return articleMapper.updateBlog(article);
    }

    /**
     * 查看某一篇博客
     * @param articleId
     * @return
     */
    @Override
    public Article getOneByBlogId(@RequestBody String articleId) {
        return articleMapper.getOneBlogByBlogId(articleId);
    }

    /**
     * 按时间查询所有博客
     * @return
     */
    @Override
    public List<Article> queryAllBlogOrderByTime() {
        return articleMapper.getAllBlogOrderByTime();
    }

    /**
     * 访问量由高到低
     * @return
     */
    @Override
    public List<Article> queryAllBlogOrderByReadAccount() {
        return articleMapper.getAllBlogOrderByReadAccount();
    }

    /**
     * 精华博客，访问量最高的前十章博客
     * @return
     */
    @Override
    public List<Article> queryAllBlogOrderByReadAccountTopTen() {
        return articleMapper.getAllBlogOrderByReadAccountTopTen();
    }

    /**
     * 新增博客
     * @param article
     * @return
     */
    @Override
    public int addArticle(Article article) {

        return articleMapper.insertArticle(article);
    }


}
