package cn.bdqn.pojo;

public class Menu {
    private Integer menuId;

    private String menuName;

    private String menuImg;

    private Integer menuPrice;

    private String description;

    private Integer bld;

    private Integer menuTypeId;

    private Integer menuCountryId;

    private Integer cookId;

    private String cookIntro;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuImg() {
        return menuImg;
    }

    public void setMenuImg(String menuImg) {
        this.menuImg = menuImg == null ? null : menuImg.trim();
    }

    public Integer getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(Integer menuPrice) {
        this.menuPrice = menuPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getBld() {
        return bld;
    }

    public void setBld(Integer bld) {
        this.bld = bld;
    }

    public Integer getMenuTypeId() {
        return menuTypeId;
    }

    public void setMenuTypeId(Integer menuTypeId) {
        this.menuTypeId = menuTypeId;
    }

    public Integer getMenuCountryId() {
        return menuCountryId;
    }

    public void setMenuCountryId(Integer menuCountryId) {
        this.menuCountryId = menuCountryId;
    }

    public Integer getCookId() {
        return cookId;
    }

    public void setCookId(Integer cookId) {
        this.cookId = cookId;
    }

    public String getCookIntro() {
        return cookIntro;
    }

    public void setCookIntro(String cookIntro) {
        this.cookIntro = cookIntro == null ? null : cookIntro.trim();
    }
}