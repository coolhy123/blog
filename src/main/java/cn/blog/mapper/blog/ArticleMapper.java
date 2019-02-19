package cn.blog.mapper.blog;

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
public interface ArticleMapper {
    /**
     * 查询所有博客
     */
    List<Article> getAllBlog();

    /**
     * 删除博客
     */
    int deleteBlogByBlogId(@Param("articleId") String blogId);

    /**
     * 修改博客
     * @param article
     * @return
     */
    int updateBlog(Article article);

    /**
     * 查看某一篇博客
     * @param blogId
     * @return
     */
    Article getOneBlogByBlogId(@Param("articleId")String blogId);


    /**
     * 按时间查询所有博客
     * @return
     */
    List<Article> getAllBlogOrderByTime();

    /**
     * 访问量由高到低
     * @return
     */
    List<Article> getAllBlogOrderByReadAccount();



    /**
     * 精华博客，访问量最高的前十章博客
     * @return
     */
    List<Article> getAllBlogOrderByReadAccountTopTen();

    /**
     * 新增博客
     * @param article
     * @return
     */
    int insertArticle(@RequestBody Article article );
}
