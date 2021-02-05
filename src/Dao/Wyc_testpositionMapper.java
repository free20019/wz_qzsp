package Dao;

import entity.Wyc_testposition;
import entity.Wyc_testpositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Wyc_testpositionMapper {
    long countByExample(Wyc_testpositionExample example);

    int deleteByExample(Wyc_testpositionExample example);

    int insert(Wyc_testposition record);

    int insertSelective(Wyc_testposition record);

    List<Wyc_testposition> selectByExample(Wyc_testpositionExample example);

    int updateByExampleSelective(@Param("record") Wyc_testposition record, @Param("example") Wyc_testpositionExample example);

    int updateByExample(@Param("record") Wyc_testposition record, @Param("example") Wyc_testpositionExample example);
}