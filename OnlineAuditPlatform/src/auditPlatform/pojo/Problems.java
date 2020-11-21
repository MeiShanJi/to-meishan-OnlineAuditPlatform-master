package auditPlatform.pojo;

import java.sql.Date;

public class Problems {
    private int id;
    private int userId;
    private String txt;
    private int answerNum;
    private int submitNum;
    private int collectNum;
    private int highestScore;
    private int status;
    private int answerId;
    private String type;
    private int difficult;
    private String tip;
    private Date date;

    public Problems() {
    }

    public Problems(int id, int userId, String txt, int answerNum, int highestScore, int status, int answerId) {
        this.id = id;
        this.userId = userId;
        this.txt = txt;
        this.answerNum = answerNum;
        this.highestScore = highestScore;
        this.status = status;
        this.answerId = answerId;
    }

    public Problems(int id, int userId, String txt, int answerNum, int submitNum, int collectNum, int highestScore, int status, int answerId, String type, int difficult, String tip, Date date) {
        this.id = id;
        this.userId = userId;
        this.txt = txt;
        this.answerNum = answerNum;
        this.submitNum = submitNum;
        this.collectNum = collectNum;
        this.highestScore = highestScore;
        this.status = status;
        this.answerId = answerId;
        this.type = type;
        this.difficult = difficult;
        this.tip = tip;
        this.date = date;
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

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public int getAnswerNum() {
        return answerNum;
    }

    public void setAnswerNum(int answerNum) {
        this.answerNum = answerNum;
    }

    public int getHighestScore() {
        return highestScore;
    }

    public void setHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public int getSubmitNum() {
        return submitNum;
    }

    public void setSubmitNum(int submitNum) {
        this.submitNum = submitNum;
    }

    public int getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(int collectNum) {
        this.collectNum = collectNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDifficult() {
        return difficult;
    }

    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Problems{" +
                "id=" + id +
                ", userId=" + userId +
                ", txt='" + txt + '\'' +
                ", answerNum=" + answerNum +
                ", submitNum=" + submitNum +
                ", collectNum=" + collectNum +
                ", highestScore=" + highestScore +
                ", status=" + status +
                ", answerId=" + answerId +
                ", type='" + type + '\'' +
                ", difficult=" + difficult +
                ", tip='" + tip + '\'' +
                ", date=" + date +
                '}';
    }
}