package cn.bdqn.pojo;

import java.util.ArrayList;
import java.util.List;

public class BlogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogsExample() {
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

        public Criteria andBlogsIdIsNull() {
            addCriterion("blogs_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogsIdIsNotNull() {
            addCriterion("blogs_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsIdEqualTo(Integer value) {
            addCriterion("blogs_id =", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdNotEqualTo(Integer value) {
            addCriterion("blogs_id <>", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdGreaterThan(Integer value) {
            addCriterion("blogs_id >", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogs_id >=", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdLessThan(Integer value) {
            addCriterion("blogs_id <", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdLessThanOrEqualTo(Integer value) {
            addCriterion("blogs_id <=", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdIn(List<Integer> values) {
            addCriterion("blogs_id in", values, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdNotIn(List<Integer> values) {
            addCriterion("blogs_id not in", values, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdBetween(Integer value1, Integer value2) {
            addCriterion("blogs_id between", value1, value2, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blogs_id not between", value1, value2, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsImgIsNull() {
            addCriterion("blogs_img is null");
            return (Criteria) this;
        }

        public Criteria andBlogsImgIsNotNull() {
            addCriterion("blogs_img is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsImgEqualTo(String value) {
            addCriterion("blogs_img =", value, "blogsImg");
            return (Criteria) this;
        }

        public Criteria andBlogsImgNotEqualTo(String value) {
            addCriterion("blogs_img <>", value, "blogsImg");
            return (Criteria) this;
        }

        public Criteria andBlogsImgGreaterThan(String value) {
            addCriterion("blogs_img >", value, "blogsImg");
            return (Criteria) this;
        }

        public Criteria andBlogsImgGreaterThanOrEqualTo(String value) {
            addCriterion("blogs_img >=", value, "blogsImg");
            return (Criteria) this;
        }

        public Criteria andBlogsImgLessThan(String value) {
            addCriterion("blogs_img <", value, "blogsImg");
            return (Criteria) this;
        }

        public Criteria andBlogsImgLessThanOrEqualTo(String value) {
            addCriterion("blogs_img <=", value, "blogsImg");
            return (Criteria) this;
        }

        public Criteria andBlogsImgLike(String value) {
            addCriterion("blogs_img like", value, "blogsImg");
            return (Criteria) this;
        }

        public Criteria andBlogsImgNotLike(String value) {
            addCriterion("blogs_img not like", value, "blogsImg");
            return (Criteria) this;
        }

        public Criteria andBlogsImgIn(List<String> values) {
            addCriterion("blogs_img in", values, "blogsImg");
            return (Criteria) this;
        }

        public Criteria andBlogsImgNotIn(List<String> values) {
            addCriterion("blogs_img not in", values, "blogsImg");
            return (Criteria) this;
        }

        public Criteria andBlogsImgBetween(String value1, String value2) {
            addCriterion("blogs_img between", value1, value2, "blogsImg");
            return (Criteria) this;
        }

        public Criteria andBlogsImgNotBetween(String value1, String value2) {
            addCriterion("blogs_img not between", value1, value2, "blogsImg");
            return (Criteria) this;
        }

        public Criteria andBlogsIntroIsNull() {
            addCriterion("blogs_intro is null");
            return (Criteria) this;
        }

        public Criteria andBlogsIntroIsNotNull() {
            addCriterion("blogs_intro is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsIntroEqualTo(String value) {
            addCriterion("blogs_intro =", value, "blogsIntro");
            return (Criteria) this;
        }

        public Criteria andBlogsIntroNotEqualTo(String value) {
            addCriterion("blogs_intro <>", value, "blogsIntro");
            return (Criteria) this;
        }

        public Criteria andBlogsIntroGreaterThan(String value) {
            addCriterion("blogs_intro >", value, "blogsIntro");
            return (Criteria) this;
        }

        public Criteria andBlogsIntroGreaterThanOrEqualTo(String value) {
            addCriterion("blogs_intro >=", value, "blogsIntro");
            return (Criteria) this;
        }

        public Criteria andBlogsIntroLessThan(String value) {
            addCriterion("blogs_intro <", value, "blogsIntro");
            return (Criteria) this;
        }

        public Criteria andBlogsIntroLessThanOrEqualTo(String value) {
            addCriterion("blogs_intro <=", value, "blogsIntro");
            return (Criteria) this;
        }

        public Criteria andBlogsIntroLike(String value) {
            addCriterion("blogs_intro like", value, "blogsIntro");
            return (Criteria) this;
        }

        public Criteria andBlogsIntroNotLike(String value) {
            addCriterion("blogs_intro not like", value, "blogsIntro");
            return (Criteria) this;
        }

        public Criteria andBlogsIntroIn(List<String> values) {
            addCriterion("blogs_intro in", values, "blogsIntro");
            return (Criteria) this;
        }

        public Criteria andBlogsIntroNotIn(List<String> values) {
            addCriterion("blogs_intro not in", values, "blogsIntro");
            return (Criteria) this;
        }

        public Criteria andBlogsIntroBetween(String value1, String value2) {
            addCriterion("blogs_intro between", value1, value2, "blogsIntro");
            return (Criteria) this;
        }

        public Criteria andBlogsIntroNotBetween(String value1, String value2) {
            addCriterion("blogs_intro not between", value1, value2, "blogsIntro");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdIsNull() {
            addCriterion("blogs_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdIsNotNull() {
            addCriterion("blogs_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdEqualTo(Integer value) {
            addCriterion("blogs_type_id =", value, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdNotEqualTo(Integer value) {
            addCriterion("blogs_type_id <>", value, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdGreaterThan(Integer value) {
            addCriterion("blogs_type_id >", value, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogs_type_id >=", value, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdLessThan(Integer value) {
            addCriterion("blogs_type_id <", value, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("blogs_type_id <=", value, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdIn(List<Integer> values) {
            addCriterion("blogs_type_id in", values, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdNotIn(List<Integer> values) {
            addCriterion("blogs_type_id not in", values, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("blogs_type_id between", value1, value2, "blogsTypeId");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blogs_type_id not between", value1, value2, "blogsTypeId");
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