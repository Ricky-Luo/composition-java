package com.wqlm.boot.user.po;

import javax.persistence.*;

@Table(name = "user_charge_history")
public class UserChargeHistory {
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "charge_amount")
    private Float chargeAmount;

    @Column(name = "balance_before")
    private Float balanceBefore;

    @Column(name = "balance_after")
    private Float balanceAfter;

    @Column(name = "charge_date")
    private byte[] chargeDate;

    @Column(name = "charge_time")
    private byte[] chargeTime;

    @Column(name = "charge_way")
    private byte[] chargeWay;

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
     * @return charge_amount
     */
    public Float getChargeAmount() {
        return chargeAmount;
    }

    /**
     * @param chargeAmount
     */
    public void setChargeAmount(Float chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    /**
     * @return balance_before
     */
    public Float getBalanceBefore() {
        return balanceBefore;
    }

    /**
     * @param balanceBefore
     */
    public void setBalanceBefore(Float balanceBefore) {
        this.balanceBefore = balanceBefore;
    }

    /**
     * @return balance_after
     */
    public Float getBalanceAfter() {
        return balanceAfter;
    }

    /**
     * @param balanceAfter
     */
    public void setBalanceAfter(Float balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    /**
     * @return charge_date
     */
    public byte[] getChargeDate() {
        return chargeDate;
    }

    /**
     * @param chargeDate
     */
    public void setChargeDate(byte[] chargeDate) {
        this.chargeDate = chargeDate;
    }

    /**
     * @return charge_time
     */
    public byte[] getChargeTime() {
        return chargeTime;
    }

    /**
     * @param chargeTime
     */
    public void setChargeTime(byte[] chargeTime) {
        this.chargeTime = chargeTime;
    }

    /**
     * @return charge_way
     */
    public byte[] getChargeWay() {
        return chargeWay;
    }

    /**
     * @param chargeWay
     */
    public void setChargeWay(byte[] chargeWay) {
        this.chargeWay = chargeWay;
    }
}