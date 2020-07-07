package cn.bdqn.mapper;

import cn.bdqn.pojo.Blogs;
import cn.bdqn.pojo.BlogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogsMapper {
    long countByExample(BlogsExample example);

    int deleteByExample(BlogsExample example);

    int deleteByPrimaryKey(Integer blogsId);

    int insert(Blogs record);

    int insertSelective(Blogs record);

    List<Blogs> selectByExample(BlogsExample example);

    Blogs selectByPrimaryKey(Integer blogsId);

    int updateByExampleSelective(@Param("record") Blogs record, @Param("example") BlogsExample example);

    int updateByExample(@Param("record") Blogs record, @Param("example") BlogsExample example);

    int updateByPrimaryKeySelective(Blogs record);

    int updateByPrimaryKey(Blogs record);
}