package Dao;

import entity.Wyc_answer;
import entity.Wyc_answerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Wyc_answerMapper {
    long countByExample(Wyc_answerExample example);

    int deleteByExample(Wyc_answerExample example);

    int insert(Wyc_answer record);

    int insertSelective(Wyc_answer record);

    List<Wyc_answer> selectByExample(Wyc_answerExample example);

    int updateByExampleSelective(@Param("record") Wyc_answer record, @Param("example") Wyc_answerExample example);

    int updateByExample(@Param("record") Wyc_answer record, @Param("example") Wyc_answerExample example);
}