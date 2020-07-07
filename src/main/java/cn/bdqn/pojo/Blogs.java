package cn.bdqn.pojo;

public class Blogs {
    private Integer blogsId;

    private String blogsImg;

    private String blogsIntro;

    private Integer blogsTypeId;

    public Integer getBlogsId() {
        return blogsId;
    }

    public void setBlogsId(Integer blogsId) {
        this.blogsId = blogsId;
    }

    public String getBlogsImg() {
        return blogsImg;
    }

    public void setBlogsImg(String blogsImg) {
        this.blogsImg = blogsImg == null ? null : blogsImg.trim();
    }

    public String getBlogsIntro() {
        return blogsIntro;
    }

    public void setBlogsIntro(String blogsIntro) {
        this.blogsIntro = blogsIntro == null ? null : blogsIntro.trim();
    }

    public Integer getBlogsTypeId() {
        return blogsTypeId;
    }

    public void setBlogsTypeId(Integer blogsTypeId) {
        this.blogsTypeId = blogsTypeId;
    }
}