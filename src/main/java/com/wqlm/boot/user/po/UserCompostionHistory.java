package com.wqlm.boot.user.po;

import javax.persistence.*;

@Table(name = "user_compostion_history")
public class UserCompostionHistory {
    @Id
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "composition_id")
    private Integer compositionId;
    @Column(name = "score")
    private float score;
    @Column(name = "composition_content")
    private String compositionContent;
    @Column(name = "teacher_comment")
    private String teacherComment;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getCompositionId() {
        return compositionId;
    }
    public void setCompositionId(Integer compositionId) {
        this.compositionId = compositionId;
    }
    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }
    public String getCompositionContent() {
        return compositionContent;
    }
    public void setCompositionContent(String compositionContent) {
        this.compositionContent = compositionContent;
    }
    public String getTeacherComment() {
        return teacherComment;
    }
    public void setTeacherComment(String teacherComment) {
        this.teacherComment = teacherComment;
    }


    

    
}