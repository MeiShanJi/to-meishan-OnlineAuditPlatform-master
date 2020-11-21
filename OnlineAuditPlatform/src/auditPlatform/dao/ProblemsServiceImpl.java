package auditPlatform.dao;

import auditPlatform.dao.impl.ProblemsService;
import auditPlatform.pojo.Problems;

import java.sql.Connection;
import java.util.List;

public class ProblemsServiceImpl implements ProblemsService {
    @Override
    public int addProblems(Connection con, Problems problems) {
        return 0;
    }

    @Override
    public int deleteProblems(Connection con, int id) {
        return 0;
    }

    @Override
    public int publishProblems(Connection con, int id) {
        return 0;
    }

    @Override
    public Problems findProblemsById(Connection con, int id) {
        return null;
    }

    @Override
    public int findAnswerIdByProblemsId(Connection con, int problemsId) {
        return 0;
    }

    @Override
    public List<Problems> findProblemsUnpublished(Connection con, int userId) {
        return null;
    }
}
