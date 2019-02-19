package cn.blog.entity;

/**
 * Created by Administrator on 2019/2/15.
 */
public class Comment {
    private String commentId;
    private String ArticleId;
    private String userId;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    private String commentContent;
}
