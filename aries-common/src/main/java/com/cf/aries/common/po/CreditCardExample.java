package com.cf.aries.common.po;

import java.util.ArrayList;
import java.util.List;

public class CreditCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditCardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("card_no =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("card_no <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("card_no >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("card_no <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("card_no like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("card_no not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("card_no in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("card_no not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNull() {
            addCriterion("card_name is null");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNotNull() {
            addCriterion("card_name is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameEqualTo(String value) {
            addCriterion("card_name =", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotEqualTo(String value) {
            addCriterion("card_name <>", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThan(String value) {
            addCriterion("card_name >", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("card_name >=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThan(String value) {
            addCriterion("card_name <", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThanOrEqualTo(String value) {
            addCriterion("card_name <=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLike(String value) {
            addCriterion("card_name like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotLike(String value) {
            addCriterion("card_name not like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameIn(List<String> values) {
            addCriterion("card_name in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotIn(List<String> values) {
            addCriterion("card_name not in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameBetween(String value1, String value2) {
            addCriterion("card_name between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotBetween(String value1, String value2) {
            addCriterion("card_name not between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardLevelIsNull() {
            addCriterion("card_level is null");
            return (Criteria) this;
        }

        public Criteria andCardLevelIsNotNull() {
            addCriterion("card_level is not null");
            return (Criteria) this;
        }

        public Criteria andCardLevelEqualTo(Byte value) {
            addCriterion("card_level =", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelNotEqualTo(Byte value) {
            addCriterion("card_level <>", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelGreaterThan(Byte value) {
            addCriterion("card_level >", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("card_level >=", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelLessThan(Byte value) {
            addCriterion("card_level <", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelLessThanOrEqualTo(Byte value) {
            addCriterion("card_level <=", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelIn(List<Byte> values) {
            addCriterion("card_level in", values, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelNotIn(List<Byte> values) {
            addCriterion("card_level not in", values, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelBetween(Byte value1, Byte value2) {
            addCriterion("card_level between", value1, value2, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("card_level not between", value1, value2, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNull() {
            addCriterion("credit_limit is null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNotNull() {
            addCriterion("credit_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitEqualTo(Integer value) {
            addCriterion("credit_limit =", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotEqualTo(Integer value) {
            addCriterion("credit_limit <>", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThan(Integer value) {
            addCriterion("credit_limit >", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_limit >=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThan(Integer value) {
            addCriterion("credit_limit <", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThanOrEqualTo(Integer value) {
            addCriterion("credit_limit <=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIn(List<Integer> values) {
            addCriterion("credit_limit in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotIn(List<Integer> values) {
            addCriterion("credit_limit not in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitBetween(Integer value1, Integer value2) {
            addCriterion("credit_limit between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_limit not between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTempLimitIsNull() {
            addCriterion("credit_temp_limit is null");
            return (Criteria) this;
        }

        public Criteria andCreditTempLimitIsNotNull() {
            addCriterion("credit_temp_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditTempLimitEqualTo(Integer value) {
            addCriterion("credit_temp_limit =", value, "creditTempLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTempLimitNotEqualTo(Integer value) {
            addCriterion("credit_temp_limit <>", value, "creditTempLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTempLimitGreaterThan(Integer value) {
            addCriterion("credit_temp_limit >", value, "creditTempLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTempLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_temp_limit >=", value, "creditTempLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTempLimitLessThan(Integer value) {
            addCriterion("credit_temp_limit <", value, "creditTempLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTempLimitLessThanOrEqualTo(Integer value) {
            addCriterion("credit_temp_limit <=", value, "creditTempLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTempLimitIn(List<Integer> values) {
            addCriterion("credit_temp_limit in", values, "creditTempLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTempLimitNotIn(List<Integer> values) {
            addCriterion("credit_temp_limit not in", values, "creditTempLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTempLimitBetween(Integer value1, Integer value2) {
            addCriterion("credit_temp_limit between", value1, value2, "creditTempLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTempLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_temp_limit not between", value1, value2, "creditTempLimit");
            return (Criteria) this;
        }

        public Criteria andCreditOtherLimitIsNull() {
            addCriterion("credit_other_limit is null");
            return (Criteria) this;
        }

        public Criteria andCreditOtherLimitIsNotNull() {
            addCriterion("credit_other_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditOtherLimitEqualTo(Integer value) {
            addCriterion("credit_other_limit =", value, "creditOtherLimit");
            return (Criteria) this;
        }

        public Criteria andCreditOtherLimitNotEqualTo(Integer value) {
            addCriterion("credit_other_limit <>", value, "creditOtherLimit");
            return (Criteria) this;
        }

        public Criteria andCreditOtherLimitGreaterThan(Integer value) {
            addCriterion("credit_other_limit >", value, "creditOtherLimit");
            return (Criteria) this;
        }

        public Criteria andCreditOtherLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_other_limit >=", value, "creditOtherLimit");
            return (Criteria) this;
        }

        public Criteria andCreditOtherLimitLessThan(Integer value) {
            addCriterion("credit_other_limit <", value, "creditOtherLimit");
            return (Criteria) this;
        }

        public Criteria andCreditOtherLimitLessThanOrEqualTo(Integer value) {
            addCriterion("credit_other_limit <=", value, "creditOtherLimit");
            return (Criteria) this;
        }

        public Criteria andCreditOtherLimitIn(List<Integer> values) {
            addCriterion("credit_other_limit in", values, "creditOtherLimit");
            return (Criteria) this;
        }

        public Criteria andCreditOtherLimitNotIn(List<Integer> values) {
            addCriterion("credit_other_limit not in", values, "creditOtherLimit");
            return (Criteria) this;
        }

        public Criteria andCreditOtherLimitBetween(Integer value1, Integer value2) {
            addCriterion("credit_other_limit between", value1, value2, "creditOtherLimit");
            return (Criteria) this;
        }

        public Criteria andCreditOtherLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_other_limit not between", value1, value2, "creditOtherLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTotalLimitIsNull() {
            addCriterion("credit_total_limit is null");
            return (Criteria) this;
        }

        public Criteria andCreditTotalLimitIsNotNull() {
            addCriterion("credit_total_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditTotalLimitEqualTo(Integer value) {
            addCriterion("credit_total_limit =", value, "creditTotalLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTotalLimitNotEqualTo(Integer value) {
            addCriterion("credit_total_limit <>", value, "creditTotalLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTotalLimitGreaterThan(Integer value) {
            addCriterion("credit_total_limit >", value, "creditTotalLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTotalLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_total_limit >=", value, "creditTotalLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTotalLimitLessThan(Integer value) {
            addCriterion("credit_total_limit <", value, "creditTotalLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTotalLimitLessThanOrEqualTo(Integer value) {
            addCriterion("credit_total_limit <=", value, "creditTotalLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTotalLimitIn(List<Integer> values) {
            addCriterion("credit_total_limit in", values, "creditTotalLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTotalLimitNotIn(List<Integer> values) {
            addCriterion("credit_total_limit not in", values, "creditTotalLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTotalLimitBetween(Integer value1, Integer value2) {
            addCriterion("credit_total_limit between", value1, value2, "creditTotalLimit");
            return (Criteria) this;
        }

        public Criteria andCreditTotalLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_total_limit not between", value1, value2, "creditTotalLimit");
            return (Criteria) this;
        }

        public Criteria andBillDayIsNull() {
            addCriterion("bill_day is null");
            return (Criteria) this;
        }

        public Criteria andBillDayIsNotNull() {
            addCriterion("bill_day is not null");
            return (Criteria) this;
        }

        public Criteria andBillDayEqualTo(String value) {
            addCriterion("bill_day =", value, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayNotEqualTo(String value) {
            addCriterion("bill_day <>", value, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayGreaterThan(String value) {
            addCriterion("bill_day >", value, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayGreaterThanOrEqualTo(String value) {
            addCriterion("bill_day >=", value, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayLessThan(String value) {
            addCriterion("bill_day <", value, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayLessThanOrEqualTo(String value) {
            addCriterion("bill_day <=", value, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayLike(String value) {
            addCriterion("bill_day like", value, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayNotLike(String value) {
            addCriterion("bill_day not like", value, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayIn(List<String> values) {
            addCriterion("bill_day in", values, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayNotIn(List<String> values) {
            addCriterion("bill_day not in", values, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayBetween(String value1, String value2) {
            addCriterion("bill_day between", value1, value2, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayNotBetween(String value1, String value2) {
            addCriterion("bill_day not between", value1, value2, "billDay");
            return (Criteria) this;
        }

        public Criteria andPayDayIsNull() {
            addCriterion("pay_day is null");
            return (Criteria) this;
        }

        public Criteria andPayDayIsNotNull() {
            addCriterion("pay_day is not null");
            return (Criteria) this;
        }

        public Criteria andPayDayEqualTo(String value) {
            addCriterion("pay_day =", value, "payDay");
            return (Criteria) this;
        }

        public Criteria andPayDayNotEqualTo(String value) {
            addCriterion("pay_day <>", value, "payDay");
            return (Criteria) this;
        }

        public Criteria andPayDayGreaterThan(String value) {
            addCriterion("pay_day >", value, "payDay");
            return (Criteria) this;
        }

        public Criteria andPayDayGreaterThanOrEqualTo(String value) {
            addCriterion("pay_day >=", value, "payDay");
            return (Criteria) this;
        }

        public Criteria andPayDayLessThan(String value) {
            addCriterion("pay_day <", value, "payDay");
            return (Criteria) this;
        }

        public Criteria andPayDayLessThanOrEqualTo(String value) {
            addCriterion("pay_day <=", value, "payDay");
            return (Criteria) this;
        }

        public Criteria andPayDayLike(String value) {
            addCriterion("pay_day like", value, "payDay");
            return (Criteria) this;
        }

        public Criteria andPayDayNotLike(String value) {
            addCriterion("pay_day not like", value, "payDay");
            return (Criteria) this;
        }

        public Criteria andPayDayIn(List<String> values) {
            addCriterion("pay_day in", values, "payDay");
            return (Criteria) this;
        }

        public Criteria andPayDayNotIn(List<String> values) {
            addCriterion("pay_day not in", values, "payDay");
            return (Criteria) this;
        }

        public Criteria andPayDayBetween(String value1, String value2) {
            addCriterion("pay_day between", value1, value2, "payDay");
            return (Criteria) this;
        }

        public Criteria andPayDayNotBetween(String value1, String value2) {
            addCriterion("pay_day not between", value1, value2, "payDay");
            return (Criteria) this;
        }

        public Criteria andBillCycleIsNull() {
            addCriterion("bill_cycle is null");
            return (Criteria) this;
        }

        public Criteria andBillCycleIsNotNull() {
            addCriterion("bill_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andBillCycleEqualTo(Byte value) {
            addCriterion("bill_cycle =", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleNotEqualTo(Byte value) {
            addCriterion("bill_cycle <>", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleGreaterThan(Byte value) {
            addCriterion("bill_cycle >", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleGreaterThanOrEqualTo(Byte value) {
            addCriterion("bill_cycle >=", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleLessThan(Byte value) {
            addCriterion("bill_cycle <", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleLessThanOrEqualTo(Byte value) {
            addCriterion("bill_cycle <=", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleIn(List<Byte> values) {
            addCriterion("bill_cycle in", values, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleNotIn(List<Byte> values) {
            addCriterion("bill_cycle not in", values, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleBetween(Byte value1, Byte value2) {
            addCriterion("bill_cycle between", value1, value2, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleNotBetween(Byte value1, Byte value2) {
            addCriterion("bill_cycle not between", value1, value2, "billCycle");
            return (Criteria) this;
        }

        public Criteria andRemindDayIsNull() {
            addCriterion("remind_day is null");
            return (Criteria) this;
        }

        public Criteria andRemindDayIsNotNull() {
            addCriterion("remind_day is not null");
            return (Criteria) this;
        }

        public Criteria andRemindDayEqualTo(Byte value) {
            addCriterion("remind_day =", value, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayNotEqualTo(Byte value) {
            addCriterion("remind_day <>", value, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayGreaterThan(Byte value) {
            addCriterion("remind_day >", value, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayGreaterThanOrEqualTo(Byte value) {
            addCriterion("remind_day >=", value, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayLessThan(Byte value) {
            addCriterion("remind_day <", value, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayLessThanOrEqualTo(Byte value) {
            addCriterion("remind_day <=", value, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayIn(List<Byte> values) {
            addCriterion("remind_day in", values, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayNotIn(List<Byte> values) {
            addCriterion("remind_day not in", values, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayBetween(Byte value1, Byte value2) {
            addCriterion("remind_day between", value1, value2, "remindDay");
            return (Criteria) this;
        }

        public Criteria andRemindDayNotBetween(Byte value1, Byte value2) {
            addCriterion("remind_day not between", value1, value2, "remindDay");
            return (Criteria) this;
        }

        public Criteria andExpireDayIsNull() {
            addCriterion("expire_day is null");
            return (Criteria) this;
        }

        public Criteria andExpireDayIsNotNull() {
            addCriterion("expire_day is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDayEqualTo(String value) {
            addCriterion("expire_day =", value, "expireDay");
            return (Criteria) this;
        }

        public Criteria andExpireDayNotEqualTo(String value) {
            addCriterion("expire_day <>", value, "expireDay");
            return (Criteria) this;
        }

        public Criteria andExpireDayGreaterThan(String value) {
            addCriterion("expire_day >", value, "expireDay");
            return (Criteria) this;
        }

        public Criteria andExpireDayGreaterThanOrEqualTo(String value) {
            addCriterion("expire_day >=", value, "expireDay");
            return (Criteria) this;
        }

        public Criteria andExpireDayLessThan(String value) {
            addCriterion("expire_day <", value, "expireDay");
            return (Criteria) this;
        }

        public Criteria andExpireDayLessThanOrEqualTo(String value) {
            addCriterion("expire_day <=", value, "expireDay");
            return (Criteria) this;
        }

        public Criteria andExpireDayLike(String value) {
            addCriterion("expire_day like", value, "expireDay");
            return (Criteria) this;
        }

        public Criteria andExpireDayNotLike(String value) {
            addCriterion("expire_day not like", value, "expireDay");
            return (Criteria) this;
        }

        public Criteria andExpireDayIn(List<String> values) {
            addCriterion("expire_day in", values, "expireDay");
            return (Criteria) this;
        }

        public Criteria andExpireDayNotIn(List<String> values) {
            addCriterion("expire_day not in", values, "expireDay");
            return (Criteria) this;
        }

        public Criteria andExpireDayBetween(String value1, String value2) {
            addCriterion("expire_day between", value1, value2, "expireDay");
            return (Criteria) this;
        }

        public Criteria andExpireDayNotBetween(String value1, String value2) {
            addCriterion("expire_day not between", value1, value2, "expireDay");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(String value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(String value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(String value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(String value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(String value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLike(String value) {
            addCriterion("ctime like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotLike(String value) {
            addCriterion("ctime not like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<String> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<String> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(String value1, String value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(String value1, String value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNull() {
            addCriterion("utime is null");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion("utime is not null");
            return (Criteria) this;
        }

        public Criteria andUtimeEqualTo(String value) {
            addCriterion("utime =", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotEqualTo(String value) {
            addCriterion("utime <>", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThan(String value) {
            addCriterion("utime >", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(String value) {
            addCriterion("utime >=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThan(String value) {
            addCriterion("utime <", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThanOrEqualTo(String value) {
            addCriterion("utime <=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLike(String value) {
            addCriterion("utime like", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotLike(String value) {
            addCriterion("utime not like", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeIn(List<String> values) {
            addCriterion("utime in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotIn(List<String> values) {
            addCriterion("utime not in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeBetween(String value1, String value2) {
            addCriterion("utime between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotBetween(String value1, String value2) {
            addCriterion("utime not between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}