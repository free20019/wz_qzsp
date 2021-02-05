package Dao;

import entity.Wyc_questions;
import entity.Wyc_questionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Wyc_questionsMapper {
    long countByExample(Wyc_questionsExample example);

    int deleteByExample(Wyc_questionsExample example);

    int insert(Wyc_questions record);

    int insertSelective(Wyc_questions record);

    List<Wyc_questions> selectByExampleWithBLOBs(Wyc_questionsExample example);

    List<Wyc_questions> selectByExample(Wyc_questionsExample example);

    int updateByExampleSelective(@Param("record") Wyc_questions record, @Param("example") Wyc_questionsExample example);

    int updateByExampleWithBLOBs(@Param("record") Wyc_questions record, @Param("example") Wyc_questionsExample example);

    int updateByExample(@Param("record") Wyc_questions record, @Param("example") Wyc_questionsExample example);
}