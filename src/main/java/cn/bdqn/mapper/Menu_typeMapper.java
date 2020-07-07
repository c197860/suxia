package cn.bdqn.mapper;

import cn.bdqn.pojo.Menu_type;
import cn.bdqn.pojo.Menu_typeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Menu_typeMapper {
    long countByExample(Menu_typeExample example);

    int deleteByExample(Menu_typeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(Menu_type record);

    int insertSelective(Menu_type record);

    List<Menu_type> selectByExample(Menu_typeExample example);

    Menu_type selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") Menu_type record, @Param("example") Menu_typeExample example);

    int updateByExample(@Param("record") Menu_type record, @Param("example") Menu_typeExample example);

    int updateByPrimaryKeySelective(Menu_type record);

    int updateByPrimaryKey(Menu_type record);
}