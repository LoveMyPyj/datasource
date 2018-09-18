package com.example.boot.datasource.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OpUserLoginExample {
    /**
     * op_user_login
     */
    protected String orderByClause;

    /**
     * op_user_login
     */
    protected boolean distinct;

    /**
     * op_user_login
     */
    protected List<Criteria> oredCriteria;

    public OpUserLoginExample() {
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

    /**
     * op_user_login null
     */
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

        public Criteria andCPkIdIsNull() {
            addCriterion("C_PK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCPkIdIsNotNull() {
            addCriterion("C_PK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCPkIdEqualTo(String value) {
            addCriterion("C_PK_ID =", value, "cPkId");
            return (Criteria) this;
        }

        public Criteria andCPkIdNotEqualTo(String value) {
            addCriterion("C_PK_ID <>", value, "cPkId");
            return (Criteria) this;
        }

        public Criteria andCPkIdGreaterThan(String value) {
            addCriterion("C_PK_ID >", value, "cPkId");
            return (Criteria) this;
        }

        public Criteria andCPkIdGreaterThanOrEqualTo(String value) {
            addCriterion("C_PK_ID >=", value, "cPkId");
            return (Criteria) this;
        }

        public Criteria andCPkIdLessThan(String value) {
            addCriterion("C_PK_ID <", value, "cPkId");
            return (Criteria) this;
        }

        public Criteria andCPkIdLessThanOrEqualTo(String value) {
            addCriterion("C_PK_ID <=", value, "cPkId");
            return (Criteria) this;
        }

        public Criteria andCPkIdLike(String value) {
            addCriterion("C_PK_ID like", value, "cPkId");
            return (Criteria) this;
        }

        public Criteria andCPkIdNotLike(String value) {
            addCriterion("C_PK_ID not like", value, "cPkId");
            return (Criteria) this;
        }

        public Criteria andCPkIdIn(List<String> values) {
            addCriterion("C_PK_ID in", values, "cPkId");
            return (Criteria) this;
        }

        public Criteria andCPkIdNotIn(List<String> values) {
            addCriterion("C_PK_ID not in", values, "cPkId");
            return (Criteria) this;
        }

        public Criteria andCPkIdBetween(String value1, String value2) {
            addCriterion("C_PK_ID between", value1, value2, "cPkId");
            return (Criteria) this;
        }

        public Criteria andCPkIdNotBetween(String value1, String value2) {
            addCriterion("C_PK_ID not between", value1, value2, "cPkId");
            return (Criteria) this;
        }

        public Criteria andCChannelCodeIsNull() {
            addCriterion("C_CHANNEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCChannelCodeIsNotNull() {
            addCriterion("C_CHANNEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCChannelCodeEqualTo(String value) {
            addCriterion("C_CHANNEL_CODE =", value, "cChannelCode");
            return (Criteria) this;
        }

        public Criteria andCChannelCodeNotEqualTo(String value) {
            addCriterion("C_CHANNEL_CODE <>", value, "cChannelCode");
            return (Criteria) this;
        }

        public Criteria andCChannelCodeGreaterThan(String value) {
            addCriterion("C_CHANNEL_CODE >", value, "cChannelCode");
            return (Criteria) this;
        }

        public Criteria andCChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_CHANNEL_CODE >=", value, "cChannelCode");
            return (Criteria) this;
        }

        public Criteria andCChannelCodeLessThan(String value) {
            addCriterion("C_CHANNEL_CODE <", value, "cChannelCode");
            return (Criteria) this;
        }

        public Criteria andCChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("C_CHANNEL_CODE <=", value, "cChannelCode");
            return (Criteria) this;
        }

        public Criteria andCChannelCodeLike(String value) {
            addCriterion("C_CHANNEL_CODE like", value, "cChannelCode");
            return (Criteria) this;
        }

        public Criteria andCChannelCodeNotLike(String value) {
            addCriterion("C_CHANNEL_CODE not like", value, "cChannelCode");
            return (Criteria) this;
        }

        public Criteria andCChannelCodeIn(List<String> values) {
            addCriterion("C_CHANNEL_CODE in", values, "cChannelCode");
            return (Criteria) this;
        }

        public Criteria andCChannelCodeNotIn(List<String> values) {
            addCriterion("C_CHANNEL_CODE not in", values, "cChannelCode");
            return (Criteria) this;
        }

        public Criteria andCChannelCodeBetween(String value1, String value2) {
            addCriterion("C_CHANNEL_CODE between", value1, value2, "cChannelCode");
            return (Criteria) this;
        }

        public Criteria andCChannelCodeNotBetween(String value1, String value2) {
            addCriterion("C_CHANNEL_CODE not between", value1, value2, "cChannelCode");
            return (Criteria) this;
        }

        public Criteria andCMobileIsNull() {
            addCriterion("C_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andCMobileIsNotNull() {
            addCriterion("C_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andCMobileEqualTo(String value) {
            addCriterion("C_MOBILE =", value, "cMobile");
            return (Criteria) this;
        }

        public Criteria andCMobileNotEqualTo(String value) {
            addCriterion("C_MOBILE <>", value, "cMobile");
            return (Criteria) this;
        }

        public Criteria andCMobileGreaterThan(String value) {
            addCriterion("C_MOBILE >", value, "cMobile");
            return (Criteria) this;
        }

        public Criteria andCMobileGreaterThanOrEqualTo(String value) {
            addCriterion("C_MOBILE >=", value, "cMobile");
            return (Criteria) this;
        }

        public Criteria andCMobileLessThan(String value) {
            addCriterion("C_MOBILE <", value, "cMobile");
            return (Criteria) this;
        }

        public Criteria andCMobileLessThanOrEqualTo(String value) {
            addCriterion("C_MOBILE <=", value, "cMobile");
            return (Criteria) this;
        }

        public Criteria andCMobileLike(String value) {
            addCriterion("C_MOBILE like", value, "cMobile");
            return (Criteria) this;
        }

        public Criteria andCMobileNotLike(String value) {
            addCriterion("C_MOBILE not like", value, "cMobile");
            return (Criteria) this;
        }

        public Criteria andCMobileIn(List<String> values) {
            addCriterion("C_MOBILE in", values, "cMobile");
            return (Criteria) this;
        }

        public Criteria andCMobileNotIn(List<String> values) {
            addCriterion("C_MOBILE not in", values, "cMobile");
            return (Criteria) this;
        }

        public Criteria andCMobileBetween(String value1, String value2) {
            addCriterion("C_MOBILE between", value1, value2, "cMobile");
            return (Criteria) this;
        }

        public Criteria andCMobileNotBetween(String value1, String value2) {
            addCriterion("C_MOBILE not between", value1, value2, "cMobile");
            return (Criteria) this;
        }

        public Criteria andCPwdIsNull() {
            addCriterion("C_PWD is null");
            return (Criteria) this;
        }

        public Criteria andCPwdIsNotNull() {
            addCriterion("C_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andCPwdEqualTo(String value) {
            addCriterion("C_PWD =", value, "cPwd");
            return (Criteria) this;
        }

        public Criteria andCPwdNotEqualTo(String value) {
            addCriterion("C_PWD <>", value, "cPwd");
            return (Criteria) this;
        }

        public Criteria andCPwdGreaterThan(String value) {
            addCriterion("C_PWD >", value, "cPwd");
            return (Criteria) this;
        }

        public Criteria andCPwdGreaterThanOrEqualTo(String value) {
            addCriterion("C_PWD >=", value, "cPwd");
            return (Criteria) this;
        }

        public Criteria andCPwdLessThan(String value) {
            addCriterion("C_PWD <", value, "cPwd");
            return (Criteria) this;
        }

        public Criteria andCPwdLessThanOrEqualTo(String value) {
            addCriterion("C_PWD <=", value, "cPwd");
            return (Criteria) this;
        }

        public Criteria andCPwdLike(String value) {
            addCriterion("C_PWD like", value, "cPwd");
            return (Criteria) this;
        }

        public Criteria andCPwdNotLike(String value) {
            addCriterion("C_PWD not like", value, "cPwd");
            return (Criteria) this;
        }

        public Criteria andCPwdIn(List<String> values) {
            addCriterion("C_PWD in", values, "cPwd");
            return (Criteria) this;
        }

        public Criteria andCPwdNotIn(List<String> values) {
            addCriterion("C_PWD not in", values, "cPwd");
            return (Criteria) this;
        }

        public Criteria andCPwdBetween(String value1, String value2) {
            addCriterion("C_PWD between", value1, value2, "cPwd");
            return (Criteria) this;
        }

        public Criteria andCPwdNotBetween(String value1, String value2) {
            addCriterion("C_PWD not between", value1, value2, "cPwd");
            return (Criteria) this;
        }

        public Criteria andCSaltIsNull() {
            addCriterion("C_SALT is null");
            return (Criteria) this;
        }

        public Criteria andCSaltIsNotNull() {
            addCriterion("C_SALT is not null");
            return (Criteria) this;
        }

        public Criteria andCSaltEqualTo(String value) {
            addCriterion("C_SALT =", value, "cSalt");
            return (Criteria) this;
        }

        public Criteria andCSaltNotEqualTo(String value) {
            addCriterion("C_SALT <>", value, "cSalt");
            return (Criteria) this;
        }

        public Criteria andCSaltGreaterThan(String value) {
            addCriterion("C_SALT >", value, "cSalt");
            return (Criteria) this;
        }

        public Criteria andCSaltGreaterThanOrEqualTo(String value) {
            addCriterion("C_SALT >=", value, "cSalt");
            return (Criteria) this;
        }

        public Criteria andCSaltLessThan(String value) {
            addCriterion("C_SALT <", value, "cSalt");
            return (Criteria) this;
        }

        public Criteria andCSaltLessThanOrEqualTo(String value) {
            addCriterion("C_SALT <=", value, "cSalt");
            return (Criteria) this;
        }

        public Criteria andCSaltLike(String value) {
            addCriterion("C_SALT like", value, "cSalt");
            return (Criteria) this;
        }

        public Criteria andCSaltNotLike(String value) {
            addCriterion("C_SALT not like", value, "cSalt");
            return (Criteria) this;
        }

        public Criteria andCSaltIn(List<String> values) {
            addCriterion("C_SALT in", values, "cSalt");
            return (Criteria) this;
        }

        public Criteria andCSaltNotIn(List<String> values) {
            addCriterion("C_SALT not in", values, "cSalt");
            return (Criteria) this;
        }

        public Criteria andCSaltBetween(String value1, String value2) {
            addCriterion("C_SALT between", value1, value2, "cSalt");
            return (Criteria) this;
        }

        public Criteria andCSaltNotBetween(String value1, String value2) {
            addCriterion("C_SALT not between", value1, value2, "cSalt");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("C_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("C_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("C_NAME =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("C_NAME <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("C_NAME >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_NAME >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("C_NAME <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("C_NAME <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("C_NAME like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("C_NAME not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("C_NAME in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("C_NAME not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("C_NAME between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("C_NAME not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCProvinceIsNull() {
            addCriterion("C_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andCProvinceIsNotNull() {
            addCriterion("C_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andCProvinceEqualTo(String value) {
            addCriterion("C_PROVINCE =", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotEqualTo(String value) {
            addCriterion("C_PROVINCE <>", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceGreaterThan(String value) {
            addCriterion("C_PROVINCE >", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("C_PROVINCE >=", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLessThan(String value) {
            addCriterion("C_PROVINCE <", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLessThanOrEqualTo(String value) {
            addCriterion("C_PROVINCE <=", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceLike(String value) {
            addCriterion("C_PROVINCE like", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotLike(String value) {
            addCriterion("C_PROVINCE not like", value, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceIn(List<String> values) {
            addCriterion("C_PROVINCE in", values, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotIn(List<String> values) {
            addCriterion("C_PROVINCE not in", values, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceBetween(String value1, String value2) {
            addCriterion("C_PROVINCE between", value1, value2, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCProvinceNotBetween(String value1, String value2) {
            addCriterion("C_PROVINCE not between", value1, value2, "cProvince");
            return (Criteria) this;
        }

        public Criteria andCCityIsNull() {
            addCriterion("C_CITY is null");
            return (Criteria) this;
        }

        public Criteria andCCityIsNotNull() {
            addCriterion("C_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCCityEqualTo(String value) {
            addCriterion("C_CITY =", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotEqualTo(String value) {
            addCriterion("C_CITY <>", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityGreaterThan(String value) {
            addCriterion("C_CITY >", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityGreaterThanOrEqualTo(String value) {
            addCriterion("C_CITY >=", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLessThan(String value) {
            addCriterion("C_CITY <", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLessThanOrEqualTo(String value) {
            addCriterion("C_CITY <=", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityLike(String value) {
            addCriterion("C_CITY like", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotLike(String value) {
            addCriterion("C_CITY not like", value, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityIn(List<String> values) {
            addCriterion("C_CITY in", values, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotIn(List<String> values) {
            addCriterion("C_CITY not in", values, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityBetween(String value1, String value2) {
            addCriterion("C_CITY between", value1, value2, "cCity");
            return (Criteria) this;
        }

        public Criteria andCCityNotBetween(String value1, String value2) {
            addCriterion("C_CITY not between", value1, value2, "cCity");
            return (Criteria) this;
        }

        public Criteria andCComCodeIsNull() {
            addCriterion("C_COM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCComCodeIsNotNull() {
            addCriterion("C_COM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCComCodeEqualTo(String value) {
            addCriterion("C_COM_CODE =", value, "cComCode");
            return (Criteria) this;
        }

        public Criteria andCComCodeNotEqualTo(String value) {
            addCriterion("C_COM_CODE <>", value, "cComCode");
            return (Criteria) this;
        }

        public Criteria andCComCodeGreaterThan(String value) {
            addCriterion("C_COM_CODE >", value, "cComCode");
            return (Criteria) this;
        }

        public Criteria andCComCodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_COM_CODE >=", value, "cComCode");
            return (Criteria) this;
        }

        public Criteria andCComCodeLessThan(String value) {
            addCriterion("C_COM_CODE <", value, "cComCode");
            return (Criteria) this;
        }

        public Criteria andCComCodeLessThanOrEqualTo(String value) {
            addCriterion("C_COM_CODE <=", value, "cComCode");
            return (Criteria) this;
        }

        public Criteria andCComCodeLike(String value) {
            addCriterion("C_COM_CODE like", value, "cComCode");
            return (Criteria) this;
        }

        public Criteria andCComCodeNotLike(String value) {
            addCriterion("C_COM_CODE not like", value, "cComCode");
            return (Criteria) this;
        }

        public Criteria andCComCodeIn(List<String> values) {
            addCriterion("C_COM_CODE in", values, "cComCode");
            return (Criteria) this;
        }

        public Criteria andCComCodeNotIn(List<String> values) {
            addCriterion("C_COM_CODE not in", values, "cComCode");
            return (Criteria) this;
        }

        public Criteria andCComCodeBetween(String value1, String value2) {
            addCriterion("C_COM_CODE between", value1, value2, "cComCode");
            return (Criteria) this;
        }

        public Criteria andCComCodeNotBetween(String value1, String value2) {
            addCriterion("C_COM_CODE not between", value1, value2, "cComCode");
            return (Criteria) this;
        }

        public Criteria andCComNameIsNull() {
            addCriterion("C_COM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCComNameIsNotNull() {
            addCriterion("C_COM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCComNameEqualTo(String value) {
            addCriterion("C_COM_NAME =", value, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameNotEqualTo(String value) {
            addCriterion("C_COM_NAME <>", value, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameGreaterThan(String value) {
            addCriterion("C_COM_NAME >", value, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_COM_NAME >=", value, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameLessThan(String value) {
            addCriterion("C_COM_NAME <", value, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameLessThanOrEqualTo(String value) {
            addCriterion("C_COM_NAME <=", value, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameLike(String value) {
            addCriterion("C_COM_NAME like", value, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameNotLike(String value) {
            addCriterion("C_COM_NAME not like", value, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameIn(List<String> values) {
            addCriterion("C_COM_NAME in", values, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameNotIn(List<String> values) {
            addCriterion("C_COM_NAME not in", values, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameBetween(String value1, String value2) {
            addCriterion("C_COM_NAME between", value1, value2, "cComName");
            return (Criteria) this;
        }

        public Criteria andCComNameNotBetween(String value1, String value2) {
            addCriterion("C_COM_NAME not between", value1, value2, "cComName");
            return (Criteria) this;
        }

        public Criteria andCEmalIsNull() {
            addCriterion("C_EMAL is null");
            return (Criteria) this;
        }

        public Criteria andCEmalIsNotNull() {
            addCriterion("C_EMAL is not null");
            return (Criteria) this;
        }

        public Criteria andCEmalEqualTo(String value) {
            addCriterion("C_EMAL =", value, "cEmal");
            return (Criteria) this;
        }

        public Criteria andCEmalNotEqualTo(String value) {
            addCriterion("C_EMAL <>", value, "cEmal");
            return (Criteria) this;
        }

        public Criteria andCEmalGreaterThan(String value) {
            addCriterion("C_EMAL >", value, "cEmal");
            return (Criteria) this;
        }

        public Criteria andCEmalGreaterThanOrEqualTo(String value) {
            addCriterion("C_EMAL >=", value, "cEmal");
            return (Criteria) this;
        }

        public Criteria andCEmalLessThan(String value) {
            addCriterion("C_EMAL <", value, "cEmal");
            return (Criteria) this;
        }

        public Criteria andCEmalLessThanOrEqualTo(String value) {
            addCriterion("C_EMAL <=", value, "cEmal");
            return (Criteria) this;
        }

        public Criteria andCEmalLike(String value) {
            addCriterion("C_EMAL like", value, "cEmal");
            return (Criteria) this;
        }

        public Criteria andCEmalNotLike(String value) {
            addCriterion("C_EMAL not like", value, "cEmal");
            return (Criteria) this;
        }

        public Criteria andCEmalIn(List<String> values) {
            addCriterion("C_EMAL in", values, "cEmal");
            return (Criteria) this;
        }

        public Criteria andCEmalNotIn(List<String> values) {
            addCriterion("C_EMAL not in", values, "cEmal");
            return (Criteria) this;
        }

        public Criteria andCEmalBetween(String value1, String value2) {
            addCriterion("C_EMAL between", value1, value2, "cEmal");
            return (Criteria) this;
        }

        public Criteria andCEmalNotBetween(String value1, String value2) {
            addCriterion("C_EMAL not between", value1, value2, "cEmal");
            return (Criteria) this;
        }

        public Criteria andCProTypeIsNull() {
            addCriterion("C_PRO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCProTypeIsNotNull() {
            addCriterion("C_PRO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCProTypeEqualTo(String value) {
            addCriterion("C_PRO_TYPE =", value, "cProType");
            return (Criteria) this;
        }

        public Criteria andCProTypeNotEqualTo(String value) {
            addCriterion("C_PRO_TYPE <>", value, "cProType");
            return (Criteria) this;
        }

        public Criteria andCProTypeGreaterThan(String value) {
            addCriterion("C_PRO_TYPE >", value, "cProType");
            return (Criteria) this;
        }

        public Criteria andCProTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_PRO_TYPE >=", value, "cProType");
            return (Criteria) this;
        }

        public Criteria andCProTypeLessThan(String value) {
            addCriterion("C_PRO_TYPE <", value, "cProType");
            return (Criteria) this;
        }

        public Criteria andCProTypeLessThanOrEqualTo(String value) {
            addCriterion("C_PRO_TYPE <=", value, "cProType");
            return (Criteria) this;
        }

        public Criteria andCProTypeLike(String value) {
            addCriterion("C_PRO_TYPE like", value, "cProType");
            return (Criteria) this;
        }

        public Criteria andCProTypeNotLike(String value) {
            addCriterion("C_PRO_TYPE not like", value, "cProType");
            return (Criteria) this;
        }

        public Criteria andCProTypeIn(List<String> values) {
            addCriterion("C_PRO_TYPE in", values, "cProType");
            return (Criteria) this;
        }

        public Criteria andCProTypeNotIn(List<String> values) {
            addCriterion("C_PRO_TYPE not in", values, "cProType");
            return (Criteria) this;
        }

        public Criteria andCProTypeBetween(String value1, String value2) {
            addCriterion("C_PRO_TYPE between", value1, value2, "cProType");
            return (Criteria) this;
        }

        public Criteria andCProTypeNotBetween(String value1, String value2) {
            addCriterion("C_PRO_TYPE not between", value1, value2, "cProType");
            return (Criteria) this;
        }

        public Criteria andCMainTypeIsNull() {
            addCriterion("C_MAIN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCMainTypeIsNotNull() {
            addCriterion("C_MAIN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCMainTypeEqualTo(String value) {
            addCriterion("C_MAIN_TYPE =", value, "cMainType");
            return (Criteria) this;
        }

        public Criteria andCMainTypeNotEqualTo(String value) {
            addCriterion("C_MAIN_TYPE <>", value, "cMainType");
            return (Criteria) this;
        }

        public Criteria andCMainTypeGreaterThan(String value) {
            addCriterion("C_MAIN_TYPE >", value, "cMainType");
            return (Criteria) this;
        }

        public Criteria andCMainTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_MAIN_TYPE >=", value, "cMainType");
            return (Criteria) this;
        }

        public Criteria andCMainTypeLessThan(String value) {
            addCriterion("C_MAIN_TYPE <", value, "cMainType");
            return (Criteria) this;
        }

        public Criteria andCMainTypeLessThanOrEqualTo(String value) {
            addCriterion("C_MAIN_TYPE <=", value, "cMainType");
            return (Criteria) this;
        }

        public Criteria andCMainTypeLike(String value) {
            addCriterion("C_MAIN_TYPE like", value, "cMainType");
            return (Criteria) this;
        }

        public Criteria andCMainTypeNotLike(String value) {
            addCriterion("C_MAIN_TYPE not like", value, "cMainType");
            return (Criteria) this;
        }

        public Criteria andCMainTypeIn(List<String> values) {
            addCriterion("C_MAIN_TYPE in", values, "cMainType");
            return (Criteria) this;
        }

        public Criteria andCMainTypeNotIn(List<String> values) {
            addCriterion("C_MAIN_TYPE not in", values, "cMainType");
            return (Criteria) this;
        }

        public Criteria andCMainTypeBetween(String value1, String value2) {
            addCriterion("C_MAIN_TYPE between", value1, value2, "cMainType");
            return (Criteria) this;
        }

        public Criteria andCMainTypeNotBetween(String value1, String value2) {
            addCriterion("C_MAIN_TYPE not between", value1, value2, "cMainType");
            return (Criteria) this;
        }

        public Criteria andCMainNameIsNull() {
            addCriterion("C_MAIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCMainNameIsNotNull() {
            addCriterion("C_MAIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCMainNameEqualTo(String value) {
            addCriterion("C_MAIN_NAME =", value, "cMainName");
            return (Criteria) this;
        }

        public Criteria andCMainNameNotEqualTo(String value) {
            addCriterion("C_MAIN_NAME <>", value, "cMainName");
            return (Criteria) this;
        }

        public Criteria andCMainNameGreaterThan(String value) {
            addCriterion("C_MAIN_NAME >", value, "cMainName");
            return (Criteria) this;
        }

        public Criteria andCMainNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_MAIN_NAME >=", value, "cMainName");
            return (Criteria) this;
        }

        public Criteria andCMainNameLessThan(String value) {
            addCriterion("C_MAIN_NAME <", value, "cMainName");
            return (Criteria) this;
        }

        public Criteria andCMainNameLessThanOrEqualTo(String value) {
            addCriterion("C_MAIN_NAME <=", value, "cMainName");
            return (Criteria) this;
        }

        public Criteria andCMainNameLike(String value) {
            addCriterion("C_MAIN_NAME like", value, "cMainName");
            return (Criteria) this;
        }

        public Criteria andCMainNameNotLike(String value) {
            addCriterion("C_MAIN_NAME not like", value, "cMainName");
            return (Criteria) this;
        }

        public Criteria andCMainNameIn(List<String> values) {
            addCriterion("C_MAIN_NAME in", values, "cMainName");
            return (Criteria) this;
        }

        public Criteria andCMainNameNotIn(List<String> values) {
            addCriterion("C_MAIN_NAME not in", values, "cMainName");
            return (Criteria) this;
        }

        public Criteria andCMainNameBetween(String value1, String value2) {
            addCriterion("C_MAIN_NAME between", value1, value2, "cMainName");
            return (Criteria) this;
        }

        public Criteria andCMainNameNotBetween(String value1, String value2) {
            addCriterion("C_MAIN_NAME not between", value1, value2, "cMainName");
            return (Criteria) this;
        }

        public Criteria andCLeaderNameIsNull() {
            addCriterion("C_LEADER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCLeaderNameIsNotNull() {
            addCriterion("C_LEADER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCLeaderNameEqualTo(String value) {
            addCriterion("C_LEADER_NAME =", value, "cLeaderName");
            return (Criteria) this;
        }

        public Criteria andCLeaderNameNotEqualTo(String value) {
            addCriterion("C_LEADER_NAME <>", value, "cLeaderName");
            return (Criteria) this;
        }

        public Criteria andCLeaderNameGreaterThan(String value) {
            addCriterion("C_LEADER_NAME >", value, "cLeaderName");
            return (Criteria) this;
        }

        public Criteria andCLeaderNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_LEADER_NAME >=", value, "cLeaderName");
            return (Criteria) this;
        }

        public Criteria andCLeaderNameLessThan(String value) {
            addCriterion("C_LEADER_NAME <", value, "cLeaderName");
            return (Criteria) this;
        }

        public Criteria andCLeaderNameLessThanOrEqualTo(String value) {
            addCriterion("C_LEADER_NAME <=", value, "cLeaderName");
            return (Criteria) this;
        }

        public Criteria andCLeaderNameLike(String value) {
            addCriterion("C_LEADER_NAME like", value, "cLeaderName");
            return (Criteria) this;
        }

        public Criteria andCLeaderNameNotLike(String value) {
            addCriterion("C_LEADER_NAME not like", value, "cLeaderName");
            return (Criteria) this;
        }

        public Criteria andCLeaderNameIn(List<String> values) {
            addCriterion("C_LEADER_NAME in", values, "cLeaderName");
            return (Criteria) this;
        }

        public Criteria andCLeaderNameNotIn(List<String> values) {
            addCriterion("C_LEADER_NAME not in", values, "cLeaderName");
            return (Criteria) this;
        }

        public Criteria andCLeaderNameBetween(String value1, String value2) {
            addCriterion("C_LEADER_NAME between", value1, value2, "cLeaderName");
            return (Criteria) this;
        }

        public Criteria andCLeaderNameNotBetween(String value1, String value2) {
            addCriterion("C_LEADER_NAME not between", value1, value2, "cLeaderName");
            return (Criteria) this;
        }

        public Criteria andCCredNoIsNull() {
            addCriterion("C_CRED_NO is null");
            return (Criteria) this;
        }

        public Criteria andCCredNoIsNotNull() {
            addCriterion("C_CRED_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCCredNoEqualTo(String value) {
            addCriterion("C_CRED_NO =", value, "cCredNo");
            return (Criteria) this;
        }

        public Criteria andCCredNoNotEqualTo(String value) {
            addCriterion("C_CRED_NO <>", value, "cCredNo");
            return (Criteria) this;
        }

        public Criteria andCCredNoGreaterThan(String value) {
            addCriterion("C_CRED_NO >", value, "cCredNo");
            return (Criteria) this;
        }

        public Criteria andCCredNoGreaterThanOrEqualTo(String value) {
            addCriterion("C_CRED_NO >=", value, "cCredNo");
            return (Criteria) this;
        }

        public Criteria andCCredNoLessThan(String value) {
            addCriterion("C_CRED_NO <", value, "cCredNo");
            return (Criteria) this;
        }

        public Criteria andCCredNoLessThanOrEqualTo(String value) {
            addCriterion("C_CRED_NO <=", value, "cCredNo");
            return (Criteria) this;
        }

        public Criteria andCCredNoLike(String value) {
            addCriterion("C_CRED_NO like", value, "cCredNo");
            return (Criteria) this;
        }

        public Criteria andCCredNoNotLike(String value) {
            addCriterion("C_CRED_NO not like", value, "cCredNo");
            return (Criteria) this;
        }

        public Criteria andCCredNoIn(List<String> values) {
            addCriterion("C_CRED_NO in", values, "cCredNo");
            return (Criteria) this;
        }

        public Criteria andCCredNoNotIn(List<String> values) {
            addCriterion("C_CRED_NO not in", values, "cCredNo");
            return (Criteria) this;
        }

        public Criteria andCCredNoBetween(String value1, String value2) {
            addCriterion("C_CRED_NO between", value1, value2, "cCredNo");
            return (Criteria) this;
        }

        public Criteria andCCredNoNotBetween(String value1, String value2) {
            addCriterion("C_CRED_NO not between", value1, value2, "cCredNo");
            return (Criteria) this;
        }

        public Criteria andCCredFrontIsNull() {
            addCriterion("C_CRED_FRONT is null");
            return (Criteria) this;
        }

        public Criteria andCCredFrontIsNotNull() {
            addCriterion("C_CRED_FRONT is not null");
            return (Criteria) this;
        }

        public Criteria andCCredFrontEqualTo(String value) {
            addCriterion("C_CRED_FRONT =", value, "cCredFront");
            return (Criteria) this;
        }

        public Criteria andCCredFrontNotEqualTo(String value) {
            addCriterion("C_CRED_FRONT <>", value, "cCredFront");
            return (Criteria) this;
        }

        public Criteria andCCredFrontGreaterThan(String value) {
            addCriterion("C_CRED_FRONT >", value, "cCredFront");
            return (Criteria) this;
        }

        public Criteria andCCredFrontGreaterThanOrEqualTo(String value) {
            addCriterion("C_CRED_FRONT >=", value, "cCredFront");
            return (Criteria) this;
        }

        public Criteria andCCredFrontLessThan(String value) {
            addCriterion("C_CRED_FRONT <", value, "cCredFront");
            return (Criteria) this;
        }

        public Criteria andCCredFrontLessThanOrEqualTo(String value) {
            addCriterion("C_CRED_FRONT <=", value, "cCredFront");
            return (Criteria) this;
        }

        public Criteria andCCredFrontLike(String value) {
            addCriterion("C_CRED_FRONT like", value, "cCredFront");
            return (Criteria) this;
        }

        public Criteria andCCredFrontNotLike(String value) {
            addCriterion("C_CRED_FRONT not like", value, "cCredFront");
            return (Criteria) this;
        }

        public Criteria andCCredFrontIn(List<String> values) {
            addCriterion("C_CRED_FRONT in", values, "cCredFront");
            return (Criteria) this;
        }

        public Criteria andCCredFrontNotIn(List<String> values) {
            addCriterion("C_CRED_FRONT not in", values, "cCredFront");
            return (Criteria) this;
        }

        public Criteria andCCredFrontBetween(String value1, String value2) {
            addCriterion("C_CRED_FRONT between", value1, value2, "cCredFront");
            return (Criteria) this;
        }

        public Criteria andCCredFrontNotBetween(String value1, String value2) {
            addCriterion("C_CRED_FRONT not between", value1, value2, "cCredFront");
            return (Criteria) this;
        }

        public Criteria andCCredReverseIsNull() {
            addCriterion("C_CRED_REVERSE is null");
            return (Criteria) this;
        }

        public Criteria andCCredReverseIsNotNull() {
            addCriterion("C_CRED_REVERSE is not null");
            return (Criteria) this;
        }

        public Criteria andCCredReverseEqualTo(String value) {
            addCriterion("C_CRED_REVERSE =", value, "cCredReverse");
            return (Criteria) this;
        }

        public Criteria andCCredReverseNotEqualTo(String value) {
            addCriterion("C_CRED_REVERSE <>", value, "cCredReverse");
            return (Criteria) this;
        }

        public Criteria andCCredReverseGreaterThan(String value) {
            addCriterion("C_CRED_REVERSE >", value, "cCredReverse");
            return (Criteria) this;
        }

        public Criteria andCCredReverseGreaterThanOrEqualTo(String value) {
            addCriterion("C_CRED_REVERSE >=", value, "cCredReverse");
            return (Criteria) this;
        }

        public Criteria andCCredReverseLessThan(String value) {
            addCriterion("C_CRED_REVERSE <", value, "cCredReverse");
            return (Criteria) this;
        }

        public Criteria andCCredReverseLessThanOrEqualTo(String value) {
            addCriterion("C_CRED_REVERSE <=", value, "cCredReverse");
            return (Criteria) this;
        }

        public Criteria andCCredReverseLike(String value) {
            addCriterion("C_CRED_REVERSE like", value, "cCredReverse");
            return (Criteria) this;
        }

        public Criteria andCCredReverseNotLike(String value) {
            addCriterion("C_CRED_REVERSE not like", value, "cCredReverse");
            return (Criteria) this;
        }

        public Criteria andCCredReverseIn(List<String> values) {
            addCriterion("C_CRED_REVERSE in", values, "cCredReverse");
            return (Criteria) this;
        }

        public Criteria andCCredReverseNotIn(List<String> values) {
            addCriterion("C_CRED_REVERSE not in", values, "cCredReverse");
            return (Criteria) this;
        }

        public Criteria andCCredReverseBetween(String value1, String value2) {
            addCriterion("C_CRED_REVERSE between", value1, value2, "cCredReverse");
            return (Criteria) this;
        }

        public Criteria andCCredReverseNotBetween(String value1, String value2) {
            addCriterion("C_CRED_REVERSE not between", value1, value2, "cCredReverse");
            return (Criteria) this;
        }

        public Criteria andCDetailAddrIsNull() {
            addCriterion("C_DETAIL_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andCDetailAddrIsNotNull() {
            addCriterion("C_DETAIL_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCDetailAddrEqualTo(String value) {
            addCriterion("C_DETAIL_ADDR =", value, "cDetailAddr");
            return (Criteria) this;
        }

        public Criteria andCDetailAddrNotEqualTo(String value) {
            addCriterion("C_DETAIL_ADDR <>", value, "cDetailAddr");
            return (Criteria) this;
        }

        public Criteria andCDetailAddrGreaterThan(String value) {
            addCriterion("C_DETAIL_ADDR >", value, "cDetailAddr");
            return (Criteria) this;
        }

        public Criteria andCDetailAddrGreaterThanOrEqualTo(String value) {
            addCriterion("C_DETAIL_ADDR >=", value, "cDetailAddr");
            return (Criteria) this;
        }

        public Criteria andCDetailAddrLessThan(String value) {
            addCriterion("C_DETAIL_ADDR <", value, "cDetailAddr");
            return (Criteria) this;
        }

        public Criteria andCDetailAddrLessThanOrEqualTo(String value) {
            addCriterion("C_DETAIL_ADDR <=", value, "cDetailAddr");
            return (Criteria) this;
        }

        public Criteria andCDetailAddrLike(String value) {
            addCriterion("C_DETAIL_ADDR like", value, "cDetailAddr");
            return (Criteria) this;
        }

        public Criteria andCDetailAddrNotLike(String value) {
            addCriterion("C_DETAIL_ADDR not like", value, "cDetailAddr");
            return (Criteria) this;
        }

        public Criteria andCDetailAddrIn(List<String> values) {
            addCriterion("C_DETAIL_ADDR in", values, "cDetailAddr");
            return (Criteria) this;
        }

        public Criteria andCDetailAddrNotIn(List<String> values) {
            addCriterion("C_DETAIL_ADDR not in", values, "cDetailAddr");
            return (Criteria) this;
        }

        public Criteria andCDetailAddrBetween(String value1, String value2) {
            addCriterion("C_DETAIL_ADDR between", value1, value2, "cDetailAddr");
            return (Criteria) this;
        }

        public Criteria andCDetailAddrNotBetween(String value1, String value2) {
            addCriterion("C_DETAIL_ADDR not between", value1, value2, "cDetailAddr");
            return (Criteria) this;
        }

        public Criteria andCPersonStateIsNull() {
            addCriterion("C_PERSON_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCPersonStateIsNotNull() {
            addCriterion("C_PERSON_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCPersonStateEqualTo(String value) {
            addCriterion("C_PERSON_STATE =", value, "cPersonState");
            return (Criteria) this;
        }

        public Criteria andCPersonStateNotEqualTo(String value) {
            addCriterion("C_PERSON_STATE <>", value, "cPersonState");
            return (Criteria) this;
        }

        public Criteria andCPersonStateGreaterThan(String value) {
            addCriterion("C_PERSON_STATE >", value, "cPersonState");
            return (Criteria) this;
        }

        public Criteria andCPersonStateGreaterThanOrEqualTo(String value) {
            addCriterion("C_PERSON_STATE >=", value, "cPersonState");
            return (Criteria) this;
        }

        public Criteria andCPersonStateLessThan(String value) {
            addCriterion("C_PERSON_STATE <", value, "cPersonState");
            return (Criteria) this;
        }

        public Criteria andCPersonStateLessThanOrEqualTo(String value) {
            addCriterion("C_PERSON_STATE <=", value, "cPersonState");
            return (Criteria) this;
        }

        public Criteria andCPersonStateLike(String value) {
            addCriterion("C_PERSON_STATE like", value, "cPersonState");
            return (Criteria) this;
        }

        public Criteria andCPersonStateNotLike(String value) {
            addCriterion("C_PERSON_STATE not like", value, "cPersonState");
            return (Criteria) this;
        }

        public Criteria andCPersonStateIn(List<String> values) {
            addCriterion("C_PERSON_STATE in", values, "cPersonState");
            return (Criteria) this;
        }

        public Criteria andCPersonStateNotIn(List<String> values) {
            addCriterion("C_PERSON_STATE not in", values, "cPersonState");
            return (Criteria) this;
        }

        public Criteria andCPersonStateBetween(String value1, String value2) {
            addCriterion("C_PERSON_STATE between", value1, value2, "cPersonState");
            return (Criteria) this;
        }

        public Criteria andCPersonStateNotBetween(String value1, String value2) {
            addCriterion("C_PERSON_STATE not between", value1, value2, "cPersonState");
            return (Criteria) this;
        }

        public Criteria andCCheckReasonIsNull() {
            addCriterion("C_CHECK_REASON is null");
            return (Criteria) this;
        }

        public Criteria andCCheckReasonIsNotNull() {
            addCriterion("C_CHECK_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andCCheckReasonEqualTo(String value) {
            addCriterion("C_CHECK_REASON =", value, "cCheckReason");
            return (Criteria) this;
        }

        public Criteria andCCheckReasonNotEqualTo(String value) {
            addCriterion("C_CHECK_REASON <>", value, "cCheckReason");
            return (Criteria) this;
        }

        public Criteria andCCheckReasonGreaterThan(String value) {
            addCriterion("C_CHECK_REASON >", value, "cCheckReason");
            return (Criteria) this;
        }

        public Criteria andCCheckReasonGreaterThanOrEqualTo(String value) {
            addCriterion("C_CHECK_REASON >=", value, "cCheckReason");
            return (Criteria) this;
        }

        public Criteria andCCheckReasonLessThan(String value) {
            addCriterion("C_CHECK_REASON <", value, "cCheckReason");
            return (Criteria) this;
        }

        public Criteria andCCheckReasonLessThanOrEqualTo(String value) {
            addCriterion("C_CHECK_REASON <=", value, "cCheckReason");
            return (Criteria) this;
        }

        public Criteria andCCheckReasonLike(String value) {
            addCriterion("C_CHECK_REASON like", value, "cCheckReason");
            return (Criteria) this;
        }

        public Criteria andCCheckReasonNotLike(String value) {
            addCriterion("C_CHECK_REASON not like", value, "cCheckReason");
            return (Criteria) this;
        }

        public Criteria andCCheckReasonIn(List<String> values) {
            addCriterion("C_CHECK_REASON in", values, "cCheckReason");
            return (Criteria) this;
        }

        public Criteria andCCheckReasonNotIn(List<String> values) {
            addCriterion("C_CHECK_REASON not in", values, "cCheckReason");
            return (Criteria) this;
        }

        public Criteria andCCheckReasonBetween(String value1, String value2) {
            addCriterion("C_CHECK_REASON between", value1, value2, "cCheckReason");
            return (Criteria) this;
        }

        public Criteria andCCheckReasonNotBetween(String value1, String value2) {
            addCriterion("C_CHECK_REASON not between", value1, value2, "cCheckReason");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeIsNull() {
            addCriterion("T_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeIsNotNull() {
            addCriterion("T_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeEqualTo(Date value) {
            addCriterion("T_CREATE_TIME =", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotEqualTo(Date value) {
            addCriterion("T_CREATE_TIME <>", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeGreaterThan(Date value) {
            addCriterion("T_CREATE_TIME >", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("T_CREATE_TIME >=", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeLessThan(Date value) {
            addCriterion("T_CREATE_TIME <", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("T_CREATE_TIME <=", value, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeIn(List<Date> values) {
            addCriterion("T_CREATE_TIME in", values, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotIn(List<Date> values) {
            addCriterion("T_CREATE_TIME not in", values, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeBetween(Date value1, Date value2) {
            addCriterion("T_CREATE_TIME between", value1, value2, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("T_CREATE_TIME not between", value1, value2, "tCreateTime");
            return (Criteria) this;
        }

        public Criteria andTUpdateTimeIsNull() {
            addCriterion("T_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTUpdateTimeIsNotNull() {
            addCriterion("T_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTUpdateTimeEqualTo(Date value) {
            addCriterion("T_UPDATE_TIME =", value, "tUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTUpdateTimeNotEqualTo(Date value) {
            addCriterion("T_UPDATE_TIME <>", value, "tUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTUpdateTimeGreaterThan(Date value) {
            addCriterion("T_UPDATE_TIME >", value, "tUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("T_UPDATE_TIME >=", value, "tUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTUpdateTimeLessThan(Date value) {
            addCriterion("T_UPDATE_TIME <", value, "tUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("T_UPDATE_TIME <=", value, "tUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTUpdateTimeIn(List<Date> values) {
            addCriterion("T_UPDATE_TIME in", values, "tUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTUpdateTimeNotIn(List<Date> values) {
            addCriterion("T_UPDATE_TIME not in", values, "tUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("T_UPDATE_TIME between", value1, value2, "tUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("T_UPDATE_TIME not between", value1, value2, "tUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCResvTxt1IsNull() {
            addCriterion("C_RESV_TXT_1 is null");
            return (Criteria) this;
        }

        public Criteria andCResvTxt1IsNotNull() {
            addCriterion("C_RESV_TXT_1 is not null");
            return (Criteria) this;
        }

        public Criteria andCResvTxt1EqualTo(String value) {
            addCriterion("C_RESV_TXT_1 =", value, "cResvTxt1");
            return (Criteria) this;
        }

        public Criteria andCResvTxt1NotEqualTo(String value) {
            addCriterion("C_RESV_TXT_1 <>", value, "cResvTxt1");
            return (Criteria) this;
        }

        public Criteria andCResvTxt1GreaterThan(String value) {
            addCriterion("C_RESV_TXT_1 >", value, "cResvTxt1");
            return (Criteria) this;
        }

        public Criteria andCResvTxt1GreaterThanOrEqualTo(String value) {
            addCriterion("C_RESV_TXT_1 >=", value, "cResvTxt1");
            return (Criteria) this;
        }

        public Criteria andCResvTxt1LessThan(String value) {
            addCriterion("C_RESV_TXT_1 <", value, "cResvTxt1");
            return (Criteria) this;
        }

        public Criteria andCResvTxt1LessThanOrEqualTo(String value) {
            addCriterion("C_RESV_TXT_1 <=", value, "cResvTxt1");
            return (Criteria) this;
        }

        public Criteria andCResvTxt1Like(String value) {
            addCriterion("C_RESV_TXT_1 like", value, "cResvTxt1");
            return (Criteria) this;
        }

        public Criteria andCResvTxt1NotLike(String value) {
            addCriterion("C_RESV_TXT_1 not like", value, "cResvTxt1");
            return (Criteria) this;
        }

        public Criteria andCResvTxt1In(List<String> values) {
            addCriterion("C_RESV_TXT_1 in", values, "cResvTxt1");
            return (Criteria) this;
        }

        public Criteria andCResvTxt1NotIn(List<String> values) {
            addCriterion("C_RESV_TXT_1 not in", values, "cResvTxt1");
            return (Criteria) this;
        }

        public Criteria andCResvTxt1Between(String value1, String value2) {
            addCriterion("C_RESV_TXT_1 between", value1, value2, "cResvTxt1");
            return (Criteria) this;
        }

        public Criteria andCResvTxt1NotBetween(String value1, String value2) {
            addCriterion("C_RESV_TXT_1 not between", value1, value2, "cResvTxt1");
            return (Criteria) this;
        }

        public Criteria andCResvTxt2IsNull() {
            addCriterion("C_RESV_TXT_2 is null");
            return (Criteria) this;
        }

        public Criteria andCResvTxt2IsNotNull() {
            addCriterion("C_RESV_TXT_2 is not null");
            return (Criteria) this;
        }

        public Criteria andCResvTxt2EqualTo(String value) {
            addCriterion("C_RESV_TXT_2 =", value, "cResvTxt2");
            return (Criteria) this;
        }

        public Criteria andCResvTxt2NotEqualTo(String value) {
            addCriterion("C_RESV_TXT_2 <>", value, "cResvTxt2");
            return (Criteria) this;
        }

        public Criteria andCResvTxt2GreaterThan(String value) {
            addCriterion("C_RESV_TXT_2 >", value, "cResvTxt2");
            return (Criteria) this;
        }

        public Criteria andCResvTxt2GreaterThanOrEqualTo(String value) {
            addCriterion("C_RESV_TXT_2 >=", value, "cResvTxt2");
            return (Criteria) this;
        }

        public Criteria andCResvTxt2LessThan(String value) {
            addCriterion("C_RESV_TXT_2 <", value, "cResvTxt2");
            return (Criteria) this;
        }

        public Criteria andCResvTxt2LessThanOrEqualTo(String value) {
            addCriterion("C_RESV_TXT_2 <=", value, "cResvTxt2");
            return (Criteria) this;
        }

        public Criteria andCResvTxt2Like(String value) {
            addCriterion("C_RESV_TXT_2 like", value, "cResvTxt2");
            return (Criteria) this;
        }

        public Criteria andCResvTxt2NotLike(String value) {
            addCriterion("C_RESV_TXT_2 not like", value, "cResvTxt2");
            return (Criteria) this;
        }

        public Criteria andCResvTxt2In(List<String> values) {
            addCriterion("C_RESV_TXT_2 in", values, "cResvTxt2");
            return (Criteria) this;
        }

        public Criteria andCResvTxt2NotIn(List<String> values) {
            addCriterion("C_RESV_TXT_2 not in", values, "cResvTxt2");
            return (Criteria) this;
        }

        public Criteria andCResvTxt2Between(String value1, String value2) {
            addCriterion("C_RESV_TXT_2 between", value1, value2, "cResvTxt2");
            return (Criteria) this;
        }

        public Criteria andCResvTxt2NotBetween(String value1, String value2) {
            addCriterion("C_RESV_TXT_2 not between", value1, value2, "cResvTxt2");
            return (Criteria) this;
        }

        public Criteria andCResvTxt3IsNull() {
            addCriterion("C_RESV_TXT_3 is null");
            return (Criteria) this;
        }

        public Criteria andCResvTxt3IsNotNull() {
            addCriterion("C_RESV_TXT_3 is not null");
            return (Criteria) this;
        }

        public Criteria andCResvTxt3EqualTo(String value) {
            addCriterion("C_RESV_TXT_3 =", value, "cResvTxt3");
            return (Criteria) this;
        }

        public Criteria andCResvTxt3NotEqualTo(String value) {
            addCriterion("C_RESV_TXT_3 <>", value, "cResvTxt3");
            return (Criteria) this;
        }

        public Criteria andCResvTxt3GreaterThan(String value) {
            addCriterion("C_RESV_TXT_3 >", value, "cResvTxt3");
            return (Criteria) this;
        }

        public Criteria andCResvTxt3GreaterThanOrEqualTo(String value) {
            addCriterion("C_RESV_TXT_3 >=", value, "cResvTxt3");
            return (Criteria) this;
        }

        public Criteria andCResvTxt3LessThan(String value) {
            addCriterion("C_RESV_TXT_3 <", value, "cResvTxt3");
            return (Criteria) this;
        }

        public Criteria andCResvTxt3LessThanOrEqualTo(String value) {
            addCriterion("C_RESV_TXT_3 <=", value, "cResvTxt3");
            return (Criteria) this;
        }

        public Criteria andCResvTxt3Like(String value) {
            addCriterion("C_RESV_TXT_3 like", value, "cResvTxt3");
            return (Criteria) this;
        }

        public Criteria andCResvTxt3NotLike(String value) {
            addCriterion("C_RESV_TXT_3 not like", value, "cResvTxt3");
            return (Criteria) this;
        }

        public Criteria andCResvTxt3In(List<String> values) {
            addCriterion("C_RESV_TXT_3 in", values, "cResvTxt3");
            return (Criteria) this;
        }

        public Criteria andCResvTxt3NotIn(List<String> values) {
            addCriterion("C_RESV_TXT_3 not in", values, "cResvTxt3");
            return (Criteria) this;
        }

        public Criteria andCResvTxt3Between(String value1, String value2) {
            addCriterion("C_RESV_TXT_3 between", value1, value2, "cResvTxt3");
            return (Criteria) this;
        }

        public Criteria andCResvTxt3NotBetween(String value1, String value2) {
            addCriterion("C_RESV_TXT_3 not between", value1, value2, "cResvTxt3");
            return (Criteria) this;
        }

        public Criteria andNResvNum1IsNull() {
            addCriterion("N_RESV_NUM_1 is null");
            return (Criteria) this;
        }

        public Criteria andNResvNum1IsNotNull() {
            addCriterion("N_RESV_NUM_1 is not null");
            return (Criteria) this;
        }

        public Criteria andNResvNum1EqualTo(BigDecimal value) {
            addCriterion("N_RESV_NUM_1 =", value, "nResvNum1");
            return (Criteria) this;
        }

        public Criteria andNResvNum1NotEqualTo(BigDecimal value) {
            addCriterion("N_RESV_NUM_1 <>", value, "nResvNum1");
            return (Criteria) this;
        }

        public Criteria andNResvNum1GreaterThan(BigDecimal value) {
            addCriterion("N_RESV_NUM_1 >", value, "nResvNum1");
            return (Criteria) this;
        }

        public Criteria andNResvNum1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("N_RESV_NUM_1 >=", value, "nResvNum1");
            return (Criteria) this;
        }

        public Criteria andNResvNum1LessThan(BigDecimal value) {
            addCriterion("N_RESV_NUM_1 <", value, "nResvNum1");
            return (Criteria) this;
        }

        public Criteria andNResvNum1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("N_RESV_NUM_1 <=", value, "nResvNum1");
            return (Criteria) this;
        }

        public Criteria andNResvNum1In(List<BigDecimal> values) {
            addCriterion("N_RESV_NUM_1 in", values, "nResvNum1");
            return (Criteria) this;
        }

        public Criteria andNResvNum1NotIn(List<BigDecimal> values) {
            addCriterion("N_RESV_NUM_1 not in", values, "nResvNum1");
            return (Criteria) this;
        }

        public Criteria andNResvNum1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("N_RESV_NUM_1 between", value1, value2, "nResvNum1");
            return (Criteria) this;
        }

        public Criteria andNResvNum1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("N_RESV_NUM_1 not between", value1, value2, "nResvNum1");
            return (Criteria) this;
        }

        public Criteria andNResvNum2IsNull() {
            addCriterion("N_RESV_NUM_2 is null");
            return (Criteria) this;
        }

        public Criteria andNResvNum2IsNotNull() {
            addCriterion("N_RESV_NUM_2 is not null");
            return (Criteria) this;
        }

        public Criteria andNResvNum2EqualTo(BigDecimal value) {
            addCriterion("N_RESV_NUM_2 =", value, "nResvNum2");
            return (Criteria) this;
        }

        public Criteria andNResvNum2NotEqualTo(BigDecimal value) {
            addCriterion("N_RESV_NUM_2 <>", value, "nResvNum2");
            return (Criteria) this;
        }

        public Criteria andNResvNum2GreaterThan(BigDecimal value) {
            addCriterion("N_RESV_NUM_2 >", value, "nResvNum2");
            return (Criteria) this;
        }

        public Criteria andNResvNum2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("N_RESV_NUM_2 >=", value, "nResvNum2");
            return (Criteria) this;
        }

        public Criteria andNResvNum2LessThan(BigDecimal value) {
            addCriterion("N_RESV_NUM_2 <", value, "nResvNum2");
            return (Criteria) this;
        }

        public Criteria andNResvNum2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("N_RESV_NUM_2 <=", value, "nResvNum2");
            return (Criteria) this;
        }

        public Criteria andNResvNum2In(List<BigDecimal> values) {
            addCriterion("N_RESV_NUM_2 in", values, "nResvNum2");
            return (Criteria) this;
        }

        public Criteria andNResvNum2NotIn(List<BigDecimal> values) {
            addCriterion("N_RESV_NUM_2 not in", values, "nResvNum2");
            return (Criteria) this;
        }

        public Criteria andNResvNum2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("N_RESV_NUM_2 between", value1, value2, "nResvNum2");
            return (Criteria) this;
        }

        public Criteria andNResvNum2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("N_RESV_NUM_2 not between", value1, value2, "nResvNum2");
            return (Criteria) this;
        }

        public Criteria andCLocaFrontPathIsNull() {
            addCriterion("C_LOCA_FRONT_PATH is null");
            return (Criteria) this;
        }

        public Criteria andCLocaFrontPathIsNotNull() {
            addCriterion("C_LOCA_FRONT_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andCLocaFrontPathEqualTo(String value) {
            addCriterion("C_LOCA_FRONT_PATH =", value, "cLocaFrontPath");
            return (Criteria) this;
        }

        public Criteria andCLocaFrontPathNotEqualTo(String value) {
            addCriterion("C_LOCA_FRONT_PATH <>", value, "cLocaFrontPath");
            return (Criteria) this;
        }

        public Criteria andCLocaFrontPathGreaterThan(String value) {
            addCriterion("C_LOCA_FRONT_PATH >", value, "cLocaFrontPath");
            return (Criteria) this;
        }

        public Criteria andCLocaFrontPathGreaterThanOrEqualTo(String value) {
            addCriterion("C_LOCA_FRONT_PATH >=", value, "cLocaFrontPath");
            return (Criteria) this;
        }

        public Criteria andCLocaFrontPathLessThan(String value) {
            addCriterion("C_LOCA_FRONT_PATH <", value, "cLocaFrontPath");
            return (Criteria) this;
        }

        public Criteria andCLocaFrontPathLessThanOrEqualTo(String value) {
            addCriterion("C_LOCA_FRONT_PATH <=", value, "cLocaFrontPath");
            return (Criteria) this;
        }

        public Criteria andCLocaFrontPathLike(String value) {
            addCriterion("C_LOCA_FRONT_PATH like", value, "cLocaFrontPath");
            return (Criteria) this;
        }

        public Criteria andCLocaFrontPathNotLike(String value) {
            addCriterion("C_LOCA_FRONT_PATH not like", value, "cLocaFrontPath");
            return (Criteria) this;
        }

        public Criteria andCLocaFrontPathIn(List<String> values) {
            addCriterion("C_LOCA_FRONT_PATH in", values, "cLocaFrontPath");
            return (Criteria) this;
        }

        public Criteria andCLocaFrontPathNotIn(List<String> values) {
            addCriterion("C_LOCA_FRONT_PATH not in", values, "cLocaFrontPath");
            return (Criteria) this;
        }

        public Criteria andCLocaFrontPathBetween(String value1, String value2) {
            addCriterion("C_LOCA_FRONT_PATH between", value1, value2, "cLocaFrontPath");
            return (Criteria) this;
        }

        public Criteria andCLocaFrontPathNotBetween(String value1, String value2) {
            addCriterion("C_LOCA_FRONT_PATH not between", value1, value2, "cLocaFrontPath");
            return (Criteria) this;
        }

        public Criteria andCLocaRevPathIsNull() {
            addCriterion("C_LOCA_REV_PATH is null");
            return (Criteria) this;
        }

        public Criteria andCLocaRevPathIsNotNull() {
            addCriterion("C_LOCA_REV_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andCLocaRevPathEqualTo(String value) {
            addCriterion("C_LOCA_REV_PATH =", value, "cLocaRevPath");
            return (Criteria) this;
        }

        public Criteria andCLocaRevPathNotEqualTo(String value) {
            addCriterion("C_LOCA_REV_PATH <>", value, "cLocaRevPath");
            return (Criteria) this;
        }

        public Criteria andCLocaRevPathGreaterThan(String value) {
            addCriterion("C_LOCA_REV_PATH >", value, "cLocaRevPath");
            return (Criteria) this;
        }

        public Criteria andCLocaRevPathGreaterThanOrEqualTo(String value) {
            addCriterion("C_LOCA_REV_PATH >=", value, "cLocaRevPath");
            return (Criteria) this;
        }

        public Criteria andCLocaRevPathLessThan(String value) {
            addCriterion("C_LOCA_REV_PATH <", value, "cLocaRevPath");
            return (Criteria) this;
        }

        public Criteria andCLocaRevPathLessThanOrEqualTo(String value) {
            addCriterion("C_LOCA_REV_PATH <=", value, "cLocaRevPath");
            return (Criteria) this;
        }

        public Criteria andCLocaRevPathLike(String value) {
            addCriterion("C_LOCA_REV_PATH like", value, "cLocaRevPath");
            return (Criteria) this;
        }

        public Criteria andCLocaRevPathNotLike(String value) {
            addCriterion("C_LOCA_REV_PATH not like", value, "cLocaRevPath");
            return (Criteria) this;
        }

        public Criteria andCLocaRevPathIn(List<String> values) {
            addCriterion("C_LOCA_REV_PATH in", values, "cLocaRevPath");
            return (Criteria) this;
        }

        public Criteria andCLocaRevPathNotIn(List<String> values) {
            addCriterion("C_LOCA_REV_PATH not in", values, "cLocaRevPath");
            return (Criteria) this;
        }

        public Criteria andCLocaRevPathBetween(String value1, String value2) {
            addCriterion("C_LOCA_REV_PATH between", value1, value2, "cLocaRevPath");
            return (Criteria) this;
        }

        public Criteria andCLocaRevPathNotBetween(String value1, String value2) {
            addCriterion("C_LOCA_REV_PATH not between", value1, value2, "cLocaRevPath");
            return (Criteria) this;
        }

        public Criteria andCParentCodeIsNull() {
            addCriterion("C_PARENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCParentCodeIsNotNull() {
            addCriterion("C_PARENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCParentCodeEqualTo(String value) {
            addCriterion("C_PARENT_CODE =", value, "cParentCode");
            return (Criteria) this;
        }

        public Criteria andCParentCodeNotEqualTo(String value) {
            addCriterion("C_PARENT_CODE <>", value, "cParentCode");
            return (Criteria) this;
        }

        public Criteria andCParentCodeGreaterThan(String value) {
            addCriterion("C_PARENT_CODE >", value, "cParentCode");
            return (Criteria) this;
        }

        public Criteria andCParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_PARENT_CODE >=", value, "cParentCode");
            return (Criteria) this;
        }

        public Criteria andCParentCodeLessThan(String value) {
            addCriterion("C_PARENT_CODE <", value, "cParentCode");
            return (Criteria) this;
        }

        public Criteria andCParentCodeLessThanOrEqualTo(String value) {
            addCriterion("C_PARENT_CODE <=", value, "cParentCode");
            return (Criteria) this;
        }

        public Criteria andCParentCodeLike(String value) {
            addCriterion("C_PARENT_CODE like", value, "cParentCode");
            return (Criteria) this;
        }

        public Criteria andCParentCodeNotLike(String value) {
            addCriterion("C_PARENT_CODE not like", value, "cParentCode");
            return (Criteria) this;
        }

        public Criteria andCParentCodeIn(List<String> values) {
            addCriterion("C_PARENT_CODE in", values, "cParentCode");
            return (Criteria) this;
        }

        public Criteria andCParentCodeNotIn(List<String> values) {
            addCriterion("C_PARENT_CODE not in", values, "cParentCode");
            return (Criteria) this;
        }

        public Criteria andCParentCodeBetween(String value1, String value2) {
            addCriterion("C_PARENT_CODE between", value1, value2, "cParentCode");
            return (Criteria) this;
        }

        public Criteria andCParentCodeNotBetween(String value1, String value2) {
            addCriterion("C_PARENT_CODE not between", value1, value2, "cParentCode");
            return (Criteria) this;
        }
    }

    /**
     * 描述:op_user_login表的实体类
     * @version
     * @author:  issuser
     * @创建时间: 2018-09-18
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * op_user_login null
     */
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