package cn.bdqn.mapper;

import cn.bdqn.pojo.Menu_country;
import cn.bdqn.pojo.Menu_countryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Menu_countryMapper {
    long countByExample(Menu_countryExample example);

    int deleteByExample(Menu_countryExample example);

    int deleteByPrimaryKey(Integer countryId);

    int insert(Menu_country record);

    int insertSelective(Menu_country record);

    List<Menu_country> selectByExample(Menu_countryExample example);

    Menu_country selectByPrimaryKey(Integer countryId);

    int updateByExampleSelective(@Param("record") Menu_country record, @Param("example") Menu_countryExample example);

    int updateByExample(@Param("record") Menu_country record, @Param("example") Menu_countryExample example);

    int updateByPrimaryKeySelective(Menu_country record);

    int updateByPrimaryKey(Menu_country record);
}