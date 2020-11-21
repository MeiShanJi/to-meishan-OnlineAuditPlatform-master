package auditPlatform.dao.impl;

import auditPlatform.pojo.Problems;

import java.sql.Connection;
import java.util.List;

public interface ProblemsService {
    /**
     * 添加问题,设置status为0表示未发布
     * @param con
     * @param problems
     * @return
     */
    int addProblems(Connection con, Problems problems);

    /**
     * 根据id删除问题
     * @param con
     * @param id
     * @return
     */
    int deleteProblems(Connection con,int id);

    /**
     * 发布题目（根据ID）
     * @param con
     * @param id
     * @return
     */
    int publishProblems(Connection con,int id);

    /**
     * 根据id查找题目
     * @param con
     * @param id
     * @return
     */
    Problems findProblemsById(Connection con,int id);

    /**
     * 根据题目Id查找对应的标准解id
     * @param con
     * @param problemsId
     * @return
     */
    int findAnswerIdByProblemsId(Connection con,int problemsId);

    /**
     * 根据考核方ID查找所有未发布的题目
     * @param con
     * @param userId
     * @return
     */
    List<Problems> findProblemsUnpublished(Connection con,int userId);

}
