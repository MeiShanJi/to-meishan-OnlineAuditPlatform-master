package auditPlatform.dao;

import auditPlatform.dao.impl.MessageService;
import auditPlatform.pojo.Message;

import java.sql.Connection;
import java.util.List;


public class MessageServiceImpl implements MessageService {
    @Override
    public int addMessage(Connection con, Message message) {
        return 0;
    }

    @Override
    public int deleteMessageById(Connection con, int id) {
        return 0;
    }

    @Override
    public Message findMessageById(Connection con, int id) {
        return null;
    }

    @Override
    public List<Message> findMessageByUserIdOne(Connection con, int userIdOne) {
        return null;
    }

    @Override
    public List<Message> findMessageByUserIdTwo(Connection con, int userIdTwo) {
        return null;
    }
}
