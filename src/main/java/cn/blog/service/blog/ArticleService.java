package cn.blog.service.blog;

import cn.blog.entity.article.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by Administrator on 2019/2/15.
 */
@Service
public interface ArticleService {


    /**
     * 查询所有博客
     * @return
     */
    List<Article> queryAllBlog();

    /**
     * 删除博客
     * @param blogId
     * @return
     */
    int removeBlogByBlogId(@Param("articleId") String blogId);

    /**
     * 修改某一篇博客文章
     * @param article
     * @return
     */
    int modifyBlog(Article article);

    /**
     * 查看某一篇博客
     * @param articleId
     * @return
     */
    Article getOneByBlogId(@Param("articleId") String articleId);

    /**
     * 按时间查询所有博客
     * @return
     */
    List<Article> queryAllBlogOrderByTime();

    /**
     * 访问量由高到低
     * @return
     */
    List<Article> queryAllBlogOrderByReadAccount();

    /**
     * 精华博客，访问量最高的前十章博客
     * @return
     */
    List<Article> queryAllBlogOrderByReadAccountTopTen();


    /**
     * 新增博客
     * @param article
     * @return
     */
    int addArticle(@RequestBody Article article);


}
