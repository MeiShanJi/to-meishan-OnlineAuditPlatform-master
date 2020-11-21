package auditPlatform.dao;

import auditPlatform.dao.impl.AnswerService;
import auditPlatform.pojo.Answer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class AnswerServiceImpl implements AnswerService {
    @Override
    /**
     * @Method addAnswer
     * @param con
     * @param answer
     * @Description 增加题解
     * @Return int
     * @Date 2020/11/18 13:07
     */
    public int addAnswer(Connection con, Answer answer) throws Exception{

        PreparedStatement pstmt = null;
        int flag = 0;
        if(null != con){
            String sql = "insert into answer(problem_id,txt,user_id," +
                    "grade,view_num,collect_num,thumbs_up_num,comment_num,status,date) " +
                    "values(?,?,?,?,?,?,?,?,?,?)";
            /*
            Object[] params ={answer.getProblemsId(),answer.getTxt(),answer.getUserId(),
                    answer.getGrade(),answer.getViewNum(),answer.getCollectNum(),
                    answer.getThumbsUpNum(),answer.getCommentNum(),answer.getStatus(),answer.getDate()};
             */
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,answer.getProblemsId());
            pstmt.setString(2, answer.getTxt());
            pstmt.setInt(3, answer.getUserId());
            pstmt.setInt(4,answer.getGrade());
            pstmt.setInt(5,answer.getViewNum());
            pstmt.setInt(6, answer.getCollectNum());
            pstmt.setInt(7,answer.getThumbsUpNum());
            pstmt.setInt(8,answer.getCommentNum());
            pstmt.setInt(9, 1);
            pstmt.setDate(10, answer.getDate());
            flag=pstmt.executeUpdate();
        }
        return flag;
    }

    @Override

    public int deleteAnswer(Connection con, int id) throws Exception{
        PreparedStatement pstm = null;
        int flag = 0;
        if(null != con){
            String sql = "delete from answer where id=?";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1,id);
            flag=pstm.executeUpdate();
        }
        return flag;
    }

    @Override
    public Answer findAnswerById(Connection con, int id) throws Exception{
        Answer answer = null;
        ResultSet rs = null;
        PreparedStatement pstm = null;
        if(null != con) {
            String sql = "select * from answer where id = ?";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            if (rs.next()) {
                answer = new Answer();
                answer.setId(rs.getInt("id"));
                answer.setProblemsId(rs.getInt("problems_id"));
                answer.setTxt(rs.getString("txt"));
                answer.setUserId(rs.getInt("user_id"));
                answer.setGrade(rs.getInt("grade"));
                answer.setViewNum(rs.getInt("view_num"));
                answer.setCollectNum(rs.getInt("collect_num"));
                answer.setThumbsUpNum(rs.getInt("thumbs_up_num"));
                answer.setCommentNum(rs.getInt("comment_num"));
                answer.setStatus(rs.getInt("status"));
                answer.setDate(rs.getDate("date"));
            }
        }
        return answer;
    }

    @Override
    public List<Answer> findAnswerByProblemsId(Connection con, int problemsId) {
        return null;
    }

    @Override
    public List<Answer> findAnswerByUserId(Connection con, int userId) {
        return null;
    }

    @Override
    public int publishAnswer(Connection con, int id) {
        return 0;
    }

    @Override
    public int thumbsUpAnswer(Connection con, int id) {
        return 0;
    }

    @Override
    public int collectAnswer(Connection con, int id) {
        return 0;
    }

    @Override
    public int viewAnswer(Connection con, int id) {
        return 0;
    }

    @Override
    public int commentAnswer(Connection con, int id) {
        return 0;
    }
}
