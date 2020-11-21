package auditPlatform.dao;

import auditPlatform.dao.impl.CommentService;
import auditPlatform.pojo.Answer;
import auditPlatform.pojo.Comment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class CommentServiceImpl implements CommentService {
    @Override

    public int addComment(Connection con, Comment comment) throws Exception{

        int flag = 0;
        if(con != null){
            String sql="insert into comment(user_id,problems_id,answer_id,comment_id,txt,thumbs_up_num,date,image) values(?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setInt(1, comment.getUserId());
            pstmt.setInt(2, comment.getProblemsId());
            pstmt.setInt(3, comment.getAnswerId());
            pstmt.setInt(4,comment.getCommentId());
            pstmt.setString(5,comment.getTxt());
            pstmt.setInt(6,comment.getThumbsUpNum());
            pstmt.setDate(7,comment.getDate());
            pstmt.setString(8,comment.getImage());
            flag = pstmt.executeUpdate();
        }
        return flag;
    }

    @Override
    public int thumbsUpComment(Connection con, int id) {
        return 0;
    }

    @Override
    public int deleteComment(Connection con, int id) throws Exception{
        PreparedStatement pstm = null;
        int flag = 0;
        if(null != con){
            String sql = "delete from comment where id = ?";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1,id);
            flag=pstm.executeUpdate();
        }
        return flag;
    }

    @Override
    public Comment findCommentById(Connection con, int Id) throws Exception{
        Comment comment = null;
        ResultSet rs = null;
        PreparedStatement pstm = null;
        if(null != con) {
            String sql = "select * from comment where id = ?";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, Id);
            rs = pstm.executeQuery();
            if (rs.next()) {
                comment = new Comment();
                comment.setId(rs.getInt("id"));
                comment.setUserId(rs.getInt("user_id"));
                comment.setProblemsId(rs.getInt("problems_id"));
                comment.setAnswerId(rs.getInt("answer_id"));
                comment.setCommentId(rs.getInt("comment_id"));
                comment.setTxt(rs.getString("txt"));
                comment.setThumbsUpNum(rs.getInt("thumbs_up_num"));
                comment.setDate(rs.getDate("date"));
                comment.setImage(rs.getString("image"));
            }
        }
        return comment;
    }

    @Override
    public List<Comment> findCommentByProblemsId(Connection con, int problemsId) {
        return null;
    }

    @Override
    public List<Comment> findCommentByUserId(Connection con, int userId) {
        return null;
    }
}
