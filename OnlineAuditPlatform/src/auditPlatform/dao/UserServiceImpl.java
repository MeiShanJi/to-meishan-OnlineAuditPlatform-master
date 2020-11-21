package auditPlatform.dao;


import auditPlatform.dao.impl.UserService;
import auditPlatform.pojo.User;
import auditPlatform.utils.JdbcUtil;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserServiceImpl implements UserService {
    /**
     * 判断用户名是否存在
     * @param con
     * @param name username用户名
     * @return 空 或 用户所有信息
     * @throws SQLException
     */
    public User existsUsername(Connection con, String name) throws SQLException {
        User resultUser=null;
        String sql="select * from user where username=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1, name);
        ResultSet rs=pstmt.executeQuery();
        if(rs.next()) {
            resultUser=new User();
            resultUser.setId(rs.getInt("id"));
            resultUser.setUsername(rs.getString("username"));
            resultUser.setPassword(rs.getString("password"));
        }
        return resultUser;
    }

    /**
     * 用户登录
     * @param con
     * @param user username,password
     * @return 用户所有信息
     * @throws SQLException
     */
    public User loginUser(Connection con,User user) throws SQLException {
        User resultUser=null;
        String sql="select * from user where username=? and password=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1, user.getUsername());
        pstmt.setString(2, user.getPassword());
        ResultSet rs=pstmt.executeQuery();
        if(rs.next()) {
            resultUser=new User();
            resultUser.setId(rs.getInt("id"));
            resultUser.setUsername(rs.getString("username"));
            resultUser.setPassword(rs.getString("password"));
            resultUser.setAdmin(rs.getInt("admin"));
            resultUser.setTel(rs.getString("tel"));
            resultUser.setPostbox(rs.getString("postbox"));
        }
        return resultUser;
    }

    /**
     * 用户注册
     * @param con
     * @param user  /username,password,0,tel,postbox/
     * @return int 成功与否状态
     * @throws SQLException
     */
    public int registerUser(Connection con, User user) throws SQLException {
        String sql="insert into user(username,password,admin,tel,postbox) values(?,?,?,?,?)";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1, user.getUsername());
        pstmt.setString(2, user.getPassword());
        pstmt.setInt(3, 0);
        pstmt.setString(4,user.getTel());
        pstmt.setString(5,user.getPostbox());
        int rs=pstmt.executeUpdate();
        return rs;
    }
    public static void main(String[] args) throws Exception {
        JdbcUtil db=new JdbcUtil();
        Connection con=db.getCon();
        UserService ss=new UserServiceImpl();
    }
}
