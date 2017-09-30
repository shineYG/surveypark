package com.kysoft.surveypark.model;

/**
 * Created with IntelliJ IDEA.
 * User: ky_pc
 * Date: 17-9-30
 * Time: 上午10:18
 * To change this template use File | Settings | File Templates.
 */
public class Question {

    private Integer id;

    //题型0-8
    private int questionType;

    private String title;

    //选项
    private String options;
    private String[] optionArr;

    //其他项
    private boolean other;

    //其他项样式：0-无 1-文本框 2-下拉列表
    private int otherStyle;

    //其他下拉项选项
    private String otherSelectOptions;
    private String[] otherSelectOptionArr;

    //矩阵式行标题集
    private String matrixRowTitles;
    private String[] matrixRowTitleArr;

    //矩阵式列标题集
    private String matrixColTitles;
    private String[] matrixColTitleArr;

    //矩阵式下拉选项集
    private String matrixSelectOptions;
    private String[] matrixSelectOptionArr;

    private Page page;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuestionType(int questionType) {
        this.questionType = questionType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public void setOptionArr(String[] optionArr) {
        this.optionArr = optionArr;
    }

    public void setOther(boolean other) {
        this.other = other;
    }

    public void setOtherStyle(int otherStyle) {
        this.otherStyle = otherStyle;
    }

    public void setOtherSelectOptions(String otherSelectOptions) {
        this.otherSelectOptions = otherSelectOptions;
    }

    public void setOtherSelectOptionArr(String[] otherSelectOptionArr) {
        this.otherSelectOptionArr = otherSelectOptionArr;
    }

    public void setMatrixRowTitles(String matrixRowTitles) {
        this.matrixRowTitles = matrixRowTitles;
    }

    public void setMatrixRowTitleArr(String[] matrixRowTitleArr) {
        this.matrixRowTitleArr = matrixRowTitleArr;
    }

    public void setMatrixColTitles(String matrixColTitles) {
        this.matrixColTitles = matrixColTitles;
    }

    public void setMatrixColTitleArr(String[] matrixColTitleArr) {
        this.matrixColTitleArr = matrixColTitleArr;
    }

    public void setMatrixSelectOptions(String matrixSelectOptions) {
        this.matrixSelectOptions = matrixSelectOptions;
    }

    public void setMatrixSelectOptionArr(String[] matrixSelectOptionArr) {
        this.matrixSelectOptionArr = matrixSelectOptionArr;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Integer getId() {

        return id;
    }

    public int getQuestionType() {
        return questionType;
    }

    public String getTitle() {
        return title;
    }

    public String getOptions() {
        return options;
    }

    public String[] getOptionArr() {
        return optionArr;
    }

    public boolean isOther() {
        return other;
    }

    public int getOtherStyle() {
        return otherStyle;
    }

    public String getOtherSelectOptions() {
        return otherSelectOptions;
    }

    public String[] getOtherSelectOptionArr() {
        return otherSelectOptionArr;
    }

    public String getMatrixRowTitles() {
        return matrixRowTitles;
    }

    public String[] getMatrixRowTitleArr() {
        return matrixRowTitleArr;
    }

    public String getMatrixColTitles() {
        return matrixColTitles;
    }

    public String[] getMatrixColTitleArr() {
        return matrixColTitleArr;
    }

    public String getMatrixSelectOptions() {
        return matrixSelectOptions;
    }

    public String[] getMatrixSelectOptionArr() {
        return matrixSelectOptionArr;
    }

    public Page getPage() {
        return page;
    }
}
