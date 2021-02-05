package Dao;

import entity.Wyc_jurisdiction;
import entity.Wyc_jurisdictionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Wyc_jurisdictionMapper {
    long countByExample(Wyc_jurisdictionExample example);

    int deleteByExample(Wyc_jurisdictionExample example);

    int insert(Wyc_jurisdiction record);

    int insertSelective(Wyc_jurisdiction record);

    List<Wyc_jurisdiction> selectByExample(Wyc_jurisdictionExample example);

    int updateByExampleSelective(@Param("record") Wyc_jurisdiction record, @Param("example") Wyc_jurisdictionExample example);

    int updateByExample(@Param("record") Wyc_jurisdiction record, @Param("example") Wyc_jurisdictionExample example);
}