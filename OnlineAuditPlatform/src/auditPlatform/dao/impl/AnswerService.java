package auditPlatform.dao.impl;

import auditPlatform.pojo.Answer;

import java.sql.Connection;
import java.util.List;

public interface AnswerService {
    /**
     * 增加题解
     * @param con
     * @param answer
     * @return
     */
    int addAnswer(Connection con, Answer answer) throws Exception;

    /**
     * 根据ID删除题解
     * @param con
     * @param id
     * @return
     */
    int deleteAnswer(Connection con,int id) throws Exception;

    /**
     * 根据id查找题解
     * @param con
     * @param id
     * @return
     */
    Answer findAnswerById(Connection con,int id) throws Exception;

    /**
     * 根据问题id查找题解(并根据数据权值从大到小排序)
     * @param con
     * @param problemsId
     * @return
     */
    List<Answer> findAnswerByProblemsId(Connection con, int problemsId);
    /**
     * 根据用户id查找题解
     * @param con
     * @param userId
     * @return
     */
    List<Answer> findAnswerByUserId(Connection con, int userId);

    /**
     * 根据题解id发布题解
     * @param con
     * @param id
     * @return
     */
    int publishAnswer(Connection con,int id);

    /**
     * 点赞题解
     * @param con
     * @param id
     * @return
     */
    int thumbsUpAnswer(Connection con,int id);
    /**
     * 题解收藏+1
     * @param con
     * @param id
     * @return
     */
    int collectAnswer(Connection con,int id);
    /**
     * 题解浏览量+1
     * @param con
     * @param id
     * @return
     */
    int viewAnswer(Connection con,int id);
    /**
     * 题解评论+1
     * @param con
     * @param id
     * @return
     */
    int commentAnswer(Connection con,int id);

}
