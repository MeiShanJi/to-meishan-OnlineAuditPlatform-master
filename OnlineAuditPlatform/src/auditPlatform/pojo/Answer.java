package auditPlatform.pojo;

import java.sql.Date;

public class Answer {
    private int id;
    private int problemsId;
    private String txt;
    private int userId;
    private int grade;
    private int viewNum;
    private int collectNum;
    private int thumbsUpNum;
    private int commentNum;
    private int status;
    private Date date;

    public Answer() {
    }

    public Answer(int id, int problemsId, String txt, int userId, int viewNum, int collectNum, int thumbsUpNum, int commentNum) {
        this.id = id;
        this.problemsId = problemsId;
        this.txt = txt;
        this.userId = userId;
        this.viewNum = viewNum;
        this.collectNum = collectNum;
        this.thumbsUpNum = thumbsUpNum;
        this.commentNum = commentNum;
    }

    public Answer(int id, int problemsId, String txt, int userId, int viewNum, int collectNum, int thumbsUpNum, int commentNum, int status, Date date) {
        this.id = id;
        this.problemsId = problemsId;
        this.txt = txt;
        this.userId = userId;
        this.viewNum = viewNum;
        this.collectNum = collectNum;
        this.thumbsUpNum = thumbsUpNum;
        this.commentNum = commentNum;
        this.status = status;
        this.date = date;
    }

    public Answer(int id, int problemsId, String txt, int userId, int grade, int viewNum, int collectNum, int thumbsUpNum, int commentNum, int status, Date date) {
        this.id = id;
        this.problemsId = problemsId;
        this.txt = txt;
        this.userId = userId;
        this.grade = grade;
        this.viewNum = viewNum;
        this.collectNum = collectNum;
        this.thumbsUpNum = thumbsUpNum;
        this.commentNum = commentNum;
        this.status = status;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getViewNum() {
        return viewNum;
    }

    public void setViewNum(int viewNum) {
        this.viewNum = viewNum;
    }

    public int getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(int collectNum) {
        this.collectNum = collectNum;
    }

    public int getThumbsUpNum() {
        return thumbsUpNum;
    }

    public void setThumbsUpNum(int thumbsUpNum) {
        this.thumbsUpNum = thumbsUpNum;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", problemsId=" + problemsId +
                ", txt='" + txt + '\'' +
                ", userId=" + userId +
                ", grade=" + grade +
                ", viewNum=" + viewNum +
                ", collectNum=" + collectNum +
                ", thumbsUpNum=" + thumbsUpNum +
                ", commentNum=" + commentNum +
                ", status=" + status +
                ", date=" + date +
                '}';
    }
}
