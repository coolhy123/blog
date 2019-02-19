package cn.blog.entity.article;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

/**
 * Created by Administrator on 2019/2/15.
 */

public class Article {
    private String articleId;
    private String articleTitle;
    private String articleContent;
    private Date articlePublished;
    private int articleReadcount;
    private int articleRequirement;
    private String userId;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Date getArticlePublished() {
        return articlePublished;
    }

    public void setArticlePublished(Date articlePublished) {
        this.articlePublished = articlePublished;
    }

    public int getArticleReadcount() {
        return articleReadcount;
    }

    public void setArticleReadcount(int articleReadcount) {
        this.articleReadcount = articleReadcount;
    }

    public int getArticleRequirement() {
        return articleRequirement;
    }

    public void setArticleRequirement(int articleRequirement) {
        this.articleRequirement = articleRequirement;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
