package com.fzj.cms.module.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TitleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table title
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table title
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table title
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table title
     *
     * @mbggenerated
     */
    public TitleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table title
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table title
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table title
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table title
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table title
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table title
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table title
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table title
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table title
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table title
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table title
     *
     * @mbggenerated
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andArticlenameIsNull() {
            addCriterion("articleName is null");
            return (Criteria) this;
        }

        public Criteria andArticlenameIsNotNull() {
            addCriterion("articleName is not null");
            return (Criteria) this;
        }

        public Criteria andArticlenameEqualTo(String value) {
            addCriterion("articleName =", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotEqualTo(String value) {
            addCriterion("articleName <>", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameGreaterThan(String value) {
            addCriterion("articleName >", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameGreaterThanOrEqualTo(String value) {
            addCriterion("articleName >=", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameLessThan(String value) {
            addCriterion("articleName <", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameLessThanOrEqualTo(String value) {
            addCriterion("articleName <=", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameLike(String value) {
            addCriterion("articleName like", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotLike(String value) {
            addCriterion("articleName not like", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameIn(List<String> values) {
            addCriterion("articleName in", values, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotIn(List<String> values) {
            addCriterion("articleName not in", values, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameBetween(String value1, String value2) {
            addCriterion("articleName between", value1, value2, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotBetween(String value1, String value2) {
            addCriterion("articleName not between", value1, value2, "articlename");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andArticleimgIsNull() {
            addCriterion("articleImg is null");
            return (Criteria) this;
        }

        public Criteria andArticleimgIsNotNull() {
            addCriterion("articleImg is not null");
            return (Criteria) this;
        }

        public Criteria andArticleimgEqualTo(String value) {
            addCriterion("articleImg =", value, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgNotEqualTo(String value) {
            addCriterion("articleImg <>", value, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgGreaterThan(String value) {
            addCriterion("articleImg >", value, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgGreaterThanOrEqualTo(String value) {
            addCriterion("articleImg >=", value, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgLessThan(String value) {
            addCriterion("articleImg <", value, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgLessThanOrEqualTo(String value) {
            addCriterion("articleImg <=", value, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgLike(String value) {
            addCriterion("articleImg like", value, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgNotLike(String value) {
            addCriterion("articleImg not like", value, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgIn(List<String> values) {
            addCriterion("articleImg in", values, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgNotIn(List<String> values) {
            addCriterion("articleImg not in", values, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgBetween(String value1, String value2) {
            addCriterion("articleImg between", value1, value2, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgNotBetween(String value1, String value2) {
            addCriterion("articleImg not between", value1, value2, "articleimg");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNull() {
            addCriterion("isShow is null");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNotNull() {
            addCriterion("isShow is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowEqualTo(Boolean value) {
            addCriterion("isShow =", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotEqualTo(Boolean value) {
            addCriterion("isShow <>", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThan(Boolean value) {
            addCriterion("isShow >", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isShow >=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThan(Boolean value) {
            addCriterion("isShow <", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThanOrEqualTo(Boolean value) {
            addCriterion("isShow <=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowIn(List<Boolean> values) {
            addCriterion("isShow in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotIn(List<Boolean> values) {
            addCriterion("isShow not in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowBetween(Boolean value1, Boolean value2) {
            addCriterion("isShow between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isShow not between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andReadnumIsNull() {
            addCriterion("readNum is null");
            return (Criteria) this;
        }

        public Criteria andReadnumIsNotNull() {
            addCriterion("readNum is not null");
            return (Criteria) this;
        }

        public Criteria andReadnumEqualTo(Integer value) {
            addCriterion("readNum =", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumNotEqualTo(Integer value) {
            addCriterion("readNum <>", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumGreaterThan(Integer value) {
            addCriterion("readNum >", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("readNum >=", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumLessThan(Integer value) {
            addCriterion("readNum <", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumLessThanOrEqualTo(Integer value) {
            addCriterion("readNum <=", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumIn(List<Integer> values) {
            addCriterion("readNum in", values, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumNotIn(List<Integer> values) {
            addCriterion("readNum not in", values, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumBetween(Integer value1, Integer value2) {
            addCriterion("readNum between", value1, value2, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumNotBetween(Integer value1, Integer value2) {
            addCriterion("readNum not between", value1, value2, "readnum");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table title
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table title
     *
     * @mbggenerated
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