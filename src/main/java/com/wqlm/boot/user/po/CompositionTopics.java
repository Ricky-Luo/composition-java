package com.wqlm.boot.user.po;

import javax.persistence.*;

@Table(name = "composition_topics")
public class CompositionTopics {
    
    @Id
    private Integer id;
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
    private Integer compositionTypeId;
    @Column(name = "composition_type_name")
    private String compositionTypeName;
    @Column(name = "lulu")
    private String lulu;
    @Column(name = "task_detail")
    private String taskDetail;
    @Column(name = "composition_graph_title_one")
    private String compositionGraphTitleOne;
    @Column(name = "composition_graph_title_two")
    private String compositionGraphTitleTwo;
    
    

    
    

    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
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
    public Integer getCompositionTypeId() {
        return compositionTypeId;
    }
    public void setCompositionTypeId(Integer compositionTypeId) {
        this.compositionTypeId = compositionTypeId;
    }
    public String getCompositionTypeName() {
        return compositionTypeName;
    }
    public void setCompositionTypeName(String compositionTypeName) {
        this.compositionTypeName = compositionTypeName;
    }
    public String getLulu() {
        return this.lulu;
    }
    public void setLulu(String lulu) {
        this.lulu = lulu;
    }
    public String getTaskDetail() {
        return this.taskDetail;
    }
    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }
    public void setCompositionGraphTitleOne(String compositionGraphTitleOne){
        this.compositionGraphTitleOne = compositionGraphTitleOne;
    }
    public String getCompositionGraphTitleOne() {
        return compositionGraphTitleOne;
    }
    public void setCompositionGraphTitleTwo(String compositionGraphTitleTwo){
        this.compositionGraphTitleTwo = compositionGraphTitleTwo;
    }
    public String getCompositionGraphTitleTwo() {
        return this.compositionGraphTitleTwo;
    }
}