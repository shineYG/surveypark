package com.kysoft.surveypark.model;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ky_pc
 * Date: 17-9-30
 * Time: 上午9:49
 * To change this template use File | Settings | File Templates.
 */
public class Survey {

    private Integer id;

    private String title = "未命名";

    private String preText = "上一步";

    private String nextText = "下一步";

    private String exitText = "退出";

    private String doneText = "完成";

    private Date createTime = new Date();

    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {

        return user;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPreText() {
        return preText;
    }

    public String getNextText() {
        return nextText;
    }

    public String getExitText() {
        return exitText;
    }

    public String getDoneText() {
        return doneText;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPreText(String preText) {
        this.preText = preText;
    }

    public void setNextText(String nextText) {
        this.nextText = nextText;
    }

    public void setExitText(String exitText) {
        this.exitText = exitText;
    }

    public void setDoneText(String doneText) {
        this.doneText = doneText;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
