package com.cf.aries.common.po;

public class WoolInfo {
    private Long id;

    private Integer bankId;

    private String bankName;

    private Long userId;

    private Long consumeId;

    private String woolName;

    private String woolCondition;

    private String woolContent;

    private Integer woolValue;

    private String expireDay;

    private String ctime;

    private String utime;

    private Byte isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getConsumeId() {
        return consumeId;
    }

    public void setConsumeId(Long consumeId) {
        this.consumeId = consumeId;
    }

    public String getWoolName() {
        return woolName;
    }

    public void setWoolName(String woolName) {
        this.woolName = woolName == null ? null : woolName.trim();
    }

    public String getWoolCondition() {
        return woolCondition;
    }

    public void setWoolCondition(String woolCondition) {
        this.woolCondition = woolCondition == null ? null : woolCondition.trim();
    }

    public String getWoolContent() {
        return woolContent;
    }

    public void setWoolContent(String woolContent) {
        this.woolContent = woolContent == null ? null : woolContent.trim();
    }

    public Integer getWoolValue() {
        return woolValue;
    }

    public void setWoolValue(Integer woolValue) {
        this.woolValue = woolValue;
    }

    public String getExpireDay() {
        return expireDay;
    }

    public void setExpireDay(String expireDay) {
        this.expireDay = expireDay == null ? null : expireDay.trim();
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    public String getUtime() {
        return utime;
    }

    public void setUtime(String utime) {
        this.utime = utime == null ? null : utime.trim();
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}