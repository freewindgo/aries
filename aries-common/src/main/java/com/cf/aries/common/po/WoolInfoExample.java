package com.cf.aries.common.po;

import java.util.ArrayList;
import java.util.List;

public class WoolInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WoolInfoExample() {
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

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(Integer value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(Integer value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(Integer value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(Integer value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<Integer> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<Integer> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(Integer value1, Integer value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andWoolNameIsNull() {
            addCriterion("wool_name is null");
            return (Criteria) this;
        }

        public Criteria andWoolNameIsNotNull() {
            addCriterion("wool_name is not null");
            return (Criteria) this;
        }

        public Criteria andWoolNameEqualTo(String value) {
            addCriterion("wool_name =", value, "woolName");
            return (Criteria) this;
        }

        public Criteria andWoolNameNotEqualTo(String value) {
            addCriterion("wool_name <>", value, "woolName");
            return (Criteria) this;
        }

        public Criteria andWoolNameGreaterThan(String value) {
            addCriterion("wool_name >", value, "woolName");
            return (Criteria) this;
        }

        public Criteria andWoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("wool_name >=", value, "woolName");
            return (Criteria) this;
        }

        public Criteria andWoolNameLessThan(String value) {
            addCriterion("wool_name <", value, "woolName");
            return (Criteria) this;
        }

        public Criteria andWoolNameLessThanOrEqualTo(String value) {
            addCriterion("wool_name <=", value, "woolName");
            return (Criteria) this;
        }

        public Criteria andWoolNameLike(String value) {
            addCriterion("wool_name like", value, "woolName");
            return (Criteria) this;
        }

        public Criteria andWoolNameNotLike(String value) {
            addCriterion("wool_name not like", value, "woolName");
            return (Criteria) this;
        }

        public Criteria andWoolNameIn(List<String> values) {
            addCriterion("wool_name in", values, "woolName");
            return (Criteria) this;
        }

        public Criteria andWoolNameNotIn(List<String> values) {
            addCriterion("wool_name not in", values, "woolName");
            return (Criteria) this;
        }

        public Criteria andWoolNameBetween(String value1, String value2) {
            addCriterion("wool_name between", value1, value2, "woolName");
            return (Criteria) this;
        }

        public Criteria andWoolNameNotBetween(String value1, String value2) {
            addCriterion("wool_name not between", value1, value2, "woolName");
            return (Criteria) this;
        }

        public Criteria andWoolConditionIsNull() {
            addCriterion("wool_condition is null");
            return (Criteria) this;
        }

        public Criteria andWoolConditionIsNotNull() {
            addCriterion("wool_condition is not null");
            return (Criteria) this;
        }

        public Criteria andWoolConditionEqualTo(String value) {
            addCriterion("wool_condition =", value, "woolCondition");
            return (Criteria) this;
        }

        public Criteria andWoolConditionNotEqualTo(String value) {
            addCriterion("wool_condition <>", value, "woolCondition");
            return (Criteria) this;
        }

        public Criteria andWoolConditionGreaterThan(String value) {
            addCriterion("wool_condition >", value, "woolCondition");
            return (Criteria) this;
        }

        public Criteria andWoolConditionGreaterThanOrEqualTo(String value) {
            addCriterion("wool_condition >=", value, "woolCondition");
            return (Criteria) this;
        }

        public Criteria andWoolConditionLessThan(String value) {
            addCriterion("wool_condition <", value, "woolCondition");
            return (Criteria) this;
        }

        public Criteria andWoolConditionLessThanOrEqualTo(String value) {
            addCriterion("wool_condition <=", value, "woolCondition");
            return (Criteria) this;
        }

        public Criteria andWoolConditionLike(String value) {
            addCriterion("wool_condition like", value, "woolCondition");
            return (Criteria) this;
        }

        public Criteria andWoolConditionNotLike(String value) {
            addCriterion("wool_condition not like", value, "woolCondition");
            return (Criteria) this;
        }

        public Criteria andWoolConditionIn(List<String> values) {
            addCriterion("wool_condition in", values, "woolCondition");
            return (Criteria) this;
        }

        public Criteria andWoolConditionNotIn(List<String> values) {
            addCriterion("wool_condition not in", values, "woolCondition");
            return (Criteria) this;
        }

        public Criteria andWoolConditionBetween(String value1, String value2) {
            addCriterion("wool_condition between", value1, value2, "woolCondition");
            return (Criteria) this;
        }

        public Criteria andWoolConditionNotBetween(String value1, String value2) {
            addCriterion("wool_condition not between", value1, value2, "woolCondition");
            return (Criteria) this;
        }

        public Criteria andWoolContentIsNull() {
            addCriterion("wool_content is null");
            return (Criteria) this;
        }

        public Criteria andWoolContentIsNotNull() {
            addCriterion("wool_content is not null");
            return (Criteria) this;
        }

        public Criteria andWoolContentEqualTo(String value) {
            addCriterion("wool_content =", value, "woolContent");
            return (Criteria) this;
        }

        public Criteria andWoolContentNotEqualTo(String value) {
            addCriterion("wool_content <>", value, "woolContent");
            return (Criteria) this;
        }

        public Criteria andWoolContentGreaterThan(String value) {
            addCriterion("wool_content >", value, "woolContent");
            return (Criteria) this;
        }

        public Criteria andWoolContentGreaterThanOrEqualTo(String value) {
            addCriterion("wool_content >=", value, "woolContent");
            return (Criteria) this;
        }

        public Criteria andWoolContentLessThan(String value) {
            addCriterion("wool_content <", value, "woolContent");
            return (Criteria) this;
        }

        public Criteria andWoolContentLessThanOrEqualTo(String value) {
            addCriterion("wool_content <=", value, "woolContent");
            return (Criteria) this;
        }

        public Criteria andWoolContentLike(String value) {
            addCriterion("wool_content like", value, "woolContent");
            return (Criteria) this;
        }

        public Criteria andWoolContentNotLike(String value) {
            addCriterion("wool_content not like", value, "woolContent");
            return (Criteria) this;
        }

        public Criteria andWoolContentIn(List<String> values) {
            addCriterion("wool_content in", values, "woolContent");
            return (Criteria) this;
        }

        public Criteria andWoolContentNotIn(List<String> values) {
            addCriterion("wool_content not in", values, "woolContent");
            return (Criteria) this;
        }

        public Criteria andWoolContentBetween(String value1, String value2) {
            addCriterion("wool_content between", value1, value2, "woolContent");
            return (Criteria) this;
        }

        public Criteria andWoolContentNotBetween(String value1, String value2) {
            addCriterion("wool_content not between", value1, value2, "woolContent");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
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