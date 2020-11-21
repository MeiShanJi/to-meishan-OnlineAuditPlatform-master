package auditPlatform.dao;


import auditPlatform.utils.JdbcUtil;

public class BaseDao {
    public static void init(){
        new JdbcUtil();
    }

    public static void main(String[] args) {
        init();
    }
}
