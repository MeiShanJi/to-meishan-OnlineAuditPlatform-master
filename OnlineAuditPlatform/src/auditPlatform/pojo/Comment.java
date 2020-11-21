package auditPlatform.pojo;

import java.sql.Date;

public class Comment {
    private int id;
    private int userId;
    private int problemsId;
    private int answerId;
    private int commentId;
    private String txt;
    private int thumbsUpNum;
    private Date date;
    private String image;

    public Comment() {
    }

    public Comment(int id, int userId, int problemsId, String txt, int thumbsUpNum) {
        this.id = id;
        this.userId = userId;
        this.problemsId = problemsId;
        this.txt = txt;
        this.thumbsUpNum = thumbsUpNum;
    }

    public Comment(int id, int userId, int problemsId, int answerId, int commentId, String txt, int thumbsUpNum, Date date, String image) {
        this.id = id;
        this.userId = userId;
        this.problemsId = problemsId;
        this.answerId = answerId;
        this.commentId = commentId;
        this.txt = txt;
        this.thumbsUpNum = thumbsUpNum;
        this.date = date;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProblemsId() {
        return problemsId;
    }

    public void setProblemsId(int problemsId) {
        this.problemsId = problemsId;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public int getThumbsUpNum() {
        return thumbsUpNum;
    }

    public void setThumbsUpNum(int thumbsUpNum) {
        this.thumbsUpNum = thumbsUpNum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userId=" + userId +
                ", problemsId=" + problemsId +
                ", answerId=" + answerId +
                ", commentId=" + commentId +
                ", txt='" + txt + '\'' +
                ", thumbsUpNum=" + thumbsUpNum +
                ", date=" + date +
                ", image='" + image + '\'' +
                '}';
    }
}
