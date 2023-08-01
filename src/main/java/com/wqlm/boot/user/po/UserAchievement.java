package com.wqlm.boot.user.po;

import javax.persistence.*;

@Table(name = "user_achievement")
public class UserAchievement {
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    private byte[] achievement;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return achievement
     */
    public byte[] getAchievement() {
        return achievement;
    }

    /**
     * @param achievement
     */
    public void setAchievement(byte[] achievement) {
        this.achievement = achievement;
    }
}