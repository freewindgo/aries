package com.cf.aries.common.enums;

/**
 * @author 于文硕
 * @ClassName CreditEnum
 * @create 2018/3/14 10:18
 */
public enum CreditEnum implements BaseEnum {

    BANK((byte) 1, "银行卡"),
    CONSUME_CREDIT((byte) 2, "消费信贷"),;

    private Byte code;

    private String description;

    @Override
    public Byte getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    CreditEnum(Byte code, String description) {
        this.code = code;
        this.description = description;
    }
}
