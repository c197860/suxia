package cn.bdqn.mapper;

import cn.bdqn.pojo.User_menu;
import cn.bdqn.pojo.User_menuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface User_menuMapper {
    long countByExample(User_menuExample example);

    int deleteByExample(User_menuExample example);

    int deleteByPrimaryKey(Integer evalId);

    int insert(User_menu record);

    int insertSelective(User_menu record);

    List<User_menu> selectByExample(User_menuExample example);

    User_menu selectByPrimaryKey(Integer evalId);

    int updateByExampleSelective(@Param("record") User_menu record, @Param("example") User_menuExample example);

    int updateByExample(@Param("record") User_menu record, @Param("example") User_menuExample example);

    int updateByPrimaryKeySelective(User_menu record);

    int updateByPrimaryKey(User_menu record);
}