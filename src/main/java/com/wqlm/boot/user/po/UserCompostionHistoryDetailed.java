package com.wqlm.boot.user.po;

import javax.persistence.*;

@Table(name = "user_compostion_history")
public class UserCompostionHistoryDetailed {
    
    @Column(name = "composition_chinese_title")
    private String compositionChineseTitle;
    @Column(name = "composition_english_title")
    private String compositionEnglishTitle;
    @Column(name = "composition_graph_one")
    private String compositionGraphOne;
    @Column(name = "composition_graph_two")
    private String compositionGraphTwo;
    @Column(name = "compostion_graph_three")
    private String compostionGraphThree;
    @Column(name = "composition_type_id")
    private String compositionTypeId;
    @Column(name = "composition_type_name")
    private String compositionTypeName;
    @Column(name = "task_detail")
    private String taskDetail;
    @Column(name = "composition_graph_title_one")
    private String compositionGraphTitleOne;
    @Column(name = "composition_graph_title_two")
    private String compositionGraphTitleTwo;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "composition_id")
    private String compositionId;
    @Column(name = "composition_content")
    private String compositionContent;
    @Column(name = "score")
    private String score;
    @Column(name = "teacher_comment")
    private String teacherComment;

    public String getCompositionChineseTitle() {
        return compositionChineseTitle;
    }
    public void setCompositionChineseTitle(String compositionChineseTitle) {
        this.compositionChineseTitle = compositionChineseTitle;
    }
    public String getCompositionEnglishTitle() {
        return compositionEnglishTitle;
    }
    public void setCompositionEnglishTitle(String compositionEnglishTitle) {
        this.compositionEnglishTitle = compositionEnglishTitle;
    }
    public String getCompositionGraphOne() {
        return compositionGraphOne;
    }
    public void setCompositionGraphOne(String compositionGraphOne) {
        this.compositionGraphOne = compositionGraphOne;
    }
    public String getCompositionGraphTwo() {
        return compositionGraphTwo;
    }
    public void setCompositionGraphTwo(String compositionGraphTwo) {
        this.compositionGraphTwo = compositionGraphTwo;
    }
    public String getCompostionGraphThree() {
        return compostionGraphThree;
    }
    public void setCompostionGraphThree(String compostionGraphThree) {
        this.compostionGraphThree = compostionGraphThree;
    }
    public String getCompositionTypeId() {
        return compositionTypeId;
    }
    public void setCompositionTypeId(String compositionTypeId) {
        this.compositionTypeId = compositionTypeId;
    }
    public String getCompositionTypeName() {
        return compositionTypeName;
    }
    public void setCompositionTypeName(String compositionTypeName) {
        this.compositionTypeName = compositionTypeName;
    }
    public String getTaskDetail() {
        return taskDetail;
    }
    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }
    public String getCompositionGraphTitleOne() {
        return compositionGraphTitleOne;
    }
    public void setCompositionGraphTitleOne(String compositionGraphTitleOne) {
        this.compositionGraphTitleOne = compositionGraphTitleOne;
    }
    public String getCompositionGraphTitleTwo() {
        return compositionGraphTitleTwo;
    }
    public void setCompositionGraphTitleTwo(String compositionGraphTitleTwo) {
        this.compositionGraphTitleTwo = compositionGraphTitleTwo;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getCompositionId() {
        return compositionId;
    }
    public void setCompositionId(String compositionId) {
        this.compositionId = compositionId;
    }
    public String getCompositionContent() {
        return compositionContent;
    }
    public void setCompositionContent(String compositionContent) {
        this.compositionContent = compositionContent;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    public String getTeacherComment() {
        return teacherComment;
    }
    public void setTeacherComment(String teacherComment) {
        this.teacherComment = teacherComment;
    }
    
}