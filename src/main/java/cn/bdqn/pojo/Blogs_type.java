package cn.bdqn.pojo;

public class Blogs_type {
    private Integer blogsTypeId;

    private String blogsTypeName;

    public Integer getBlogsTypeId() {
        return blogsTypeId;
    }

    public void setBlogsTypeId(Integer blogsTypeId) {
        this.blogsTypeId = blogsTypeId;
    }

    public String getBlogsTypeName() {
        return blogsTypeName;
    }

    public void setBlogsTypeName(String blogsTypeName) {
        this.blogsTypeName = blogsTypeName == null ? null : blogsTypeName.trim();
    }
}