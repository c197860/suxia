package cn.bdqn.mapper;

import cn.bdqn.pojo.Blogs_type;
import cn.bdqn.pojo.Blogs_typeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Blogs_typeMapper {
    long countByExample(Blogs_typeExample example);

    int deleteByExample(Blogs_typeExample example);

    int deleteByPrimaryKey(Integer blogsTypeId);

    int insert(Blogs_type record);

    int insertSelective(Blogs_type record);

    List<Blogs_type> selectByExample(Blogs_typeExample example);

    Blogs_type selectByPrimaryKey(Integer blogsTypeId);

    int updateByExampleSelective(@Param("record") Blogs_type record, @Param("example") Blogs_typeExample example);

    int updateByExample(@Param("record") Blogs_type record, @Param("example") Blogs_typeExample example);

    int updateByPrimaryKeySelective(Blogs_type record);

    int updateByPrimaryKey(Blogs_type record);
}