package auditPlatform.dao.impl;

import auditPlatform.pojo.Comment;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface CommentService {
    /**
     * 添加评论
     * @param con
     * @param comment
     * @return
     */
    int addComment(Connection con, Comment comment) throws Exception;
    /**
     * 点赞评论(根据id)
     * @param con
     * @param id
     * @return
     */
    int thumbsUpComment(Connection con,int id);

    /**
     * 根据id删除评论
     * @param con
     * @param id
     * @return
     */
    int deleteComment(Connection con,int id) throws Exception;

    /**
     * 根据id查找评论
     * @param con
     * @param Id
     * @return
     */
    Comment findCommentById(Connection con,int Id) throws Exception;

    /**
     * 根据问题id查找评论
     * @param con
     * @param problemsId
     * @return
     */
    List<Comment> findCommentByProblemsId(Connection con,int problemsId);

    /**
     * 根据用户ID查找评论
     * @param con
     * @param userId
     * @return
     */
    List<Comment> findCommentByUserId(Connection con,int userId);

}
