package Dao;

import entity.Wyc_post;
import entity.Wyc_postExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Wyc_postMapper {
    long countByExample(Wyc_postExample example);

    int deleteByExample(Wyc_postExample example);

    int insert(Wyc_post record);

    int insertSelective(Wyc_post record);

    List<Wyc_post> selectByExample(Wyc_postExample example);

    int updateByExampleSelective(@Param("record") Wyc_post record, @Param("example") Wyc_postExample example);

    int updateByExample(@Param("record") Wyc_post record, @Param("example") Wyc_postExample example);
}