package cn.bdqn.pojo;

public class User_menu {
    private Integer evalId;

    private Integer userId;

    private Integer menuId;

    private String evaluate;

    public Integer getEvalId() {
        return evalId;
    }

    public void setEvalId(Integer evalId) {
        this.evalId = evalId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate == null ? null : evaluate.trim();
    }
}