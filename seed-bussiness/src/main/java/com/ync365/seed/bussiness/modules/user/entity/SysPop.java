package com.ync365.seed.bussiness.modules.user.entity;

import java.util.Date;

public class SysPop {
	
    private Integer id;
    
    private String popNum;

    private String popLoginName;

    private String popPassword;
    
    /**
     * 安全评分
     */
    private Integer safeScore;

    private String popMobile;

    private String popStoreNum;

    private Date createTime;

    private Date updateTime;

    private String lastOptName;

    private Boolean isDel;

    private Boolean isFrozen;

    private Boolean isAuthentication;

    private Integer address;

    private String decorate;

    private Date beforeLoginTime;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBeforeLoginTime() {
		return beforeLoginTime;
	}

	public void setBeforeLoginTime(Date beforeLoginTime) {
		this.beforeLoginTime = beforeLoginTime;
	}

	public String getPopNum() {
        return popNum;
    }

    public void setPopNum(String popNum) {
        this.popNum = popNum == null ? null : popNum.trim();
    }

    public String getPopLoginName() {
        return popLoginName;
    }

    public void setPopLoginName(String popLoginName) {
        this.popLoginName = popLoginName == null ? null : popLoginName.trim();
    }

    public String getPopPassword() {
        return popPassword;
    }

    public void setPopPassword(String popPassword) {
        this.popPassword = popPassword == null ? null : popPassword.trim();
    }

    public String getPopMobile() {
        return popMobile;
    }

    public void setPopMobile(String popMobile) {
        this.popMobile = popMobile == null ? null : popMobile.trim();
    }

    public String getPopStoreNum() {
        return popStoreNum;
    }

    public void setPopStoreNum(String popStoreNum) {
        this.popStoreNum = popStoreNum == null ? null : popStoreNum.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLastOptName() {
        return lastOptName;
    }

    public void setLastOptName(String lastOptName) {
        this.lastOptName = lastOptName == null ? null : lastOptName.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Boolean getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
    }

    public Boolean getIsAuthentication() {
        return isAuthentication;
    }

    public void setIsAuthentication(Boolean isAuthentication) {
        this.isAuthentication = isAuthentication;
    }

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public String getDecorate() {
        return decorate;
    }

    public void setDecorate(String decorate) {
        this.decorate = decorate;
    }

	public Integer getSafeScore() {
		return safeScore;
	}

	public void setSafeScore(Integer safeScore) {
		this.safeScore = safeScore;
	}

}