package com.wqlm.boot.user.po;

import javax.persistence.*;

@Table(name = "user")
public class User {
    @Id
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    private String password;

    private String salt;

    @Column(name = "purse_balance")
    private Float purseBalance;

    @Column(name = "coin_balance")
    private Integer coinBalance;

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
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * @return purse_balance
     */
    public Float getPurseBalance() {
        return purseBalance;
    }

    /**
     * @param purseBalance
     */
    public void setPurseBalance(Float purseBalance) {
        this.purseBalance = purseBalance;
    }

    /**
     * @return coin_balance
     */
    public Integer getCoinBalance() {
        return coinBalance;
    }

    /**
     * @param coinBalance
     */
    public void setCoinBalance(Integer coinBalance) {
        this.coinBalance = coinBalance;
    }
}