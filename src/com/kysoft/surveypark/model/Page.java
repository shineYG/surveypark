package com.kysoft.surveypark.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ky_pc
 * Date: 17-9-30
 * Time: 上午10:17
 * To change this template use File | Settings | File Templates.
 */
public class Page {

    private Integer id;

    private String title = "未命名";

    private String description;

    private Survey survey;

    private Set<Question> questions = new HashSet<Question>();

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public Integer getId() {

        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Survey getSurvey() {
        return survey;
    }

    public Set<Question> getQuestions() {
        return questions;
    }
}
