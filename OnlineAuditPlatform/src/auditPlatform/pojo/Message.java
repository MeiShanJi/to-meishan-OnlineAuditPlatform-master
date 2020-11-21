package auditPlatform.pojo;

import java.sql.Date;

public class Message {
    private int id;
    private int userIdOne;
    private int userIdTwo;
    private String comment;
    private Date date;

    public Message() {
    }

    public Message(int id, int userIdOne, int userIdTwo, String comment) {
        this.id = id;
        this.userIdOne = userIdOne;
        this.userIdTwo = userIdTwo;
        this.comment = comment;
    }

    public Message(int id, int userIdOne, int userIdTwo, String comment, Date date) {
        this.id = id;
        this.userIdOne = userIdOne;
        this.userIdTwo = userIdTwo;
        this.comment = comment;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserIdOne() {
        return userIdOne;
    }

    public void setUserIdOne(int userIdOne) {
        this.userIdOne = userIdOne;
    }

    public int getUserIdTwo() {
        return userIdTwo;
    }

    public void setUserIdTwo(int userIdTwo) {
        this.userIdTwo = userIdTwo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", userIdOne=" + userIdOne +
                ", userIdTwo=" + userIdTwo +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                '}';
    }
}
