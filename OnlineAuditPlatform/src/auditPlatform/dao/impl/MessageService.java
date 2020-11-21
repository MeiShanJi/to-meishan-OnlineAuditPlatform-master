package auditPlatform.dao.impl;

import auditPlatform.pojo.Message;

import java.sql.Connection;
import java.util.List;

public interface MessageService {
    /**
     * 添加消息
     * @param con
     * @param message
     * @return
     */
    int addMessage(Connection con, Message message);

    /**
     * 根据id删除消息
     * @param con
     * @param id
     * @return
     */
    int deleteMessageById(Connection con,int id);

    /**
     * 根据消息ID查找消息
     * @param con
     * @param id
     * @return
     */
    Message findMessageById(Connection con,int id);

    /**
     * 根据消息发出者id查找消息
     * @param con
     * @param userIdOne
     * @return
     */
    List<Message> findMessageByUserIdOne(Connection con,int userIdOne);
    /**
     * 根据消息接受者id查找消息
     * @param con
     * @param userIdTwo
     * @return
     */
    List<Message> findMessageByUserIdTwo(Connection con,int userIdTwo);
}
