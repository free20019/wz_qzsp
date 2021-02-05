package Dao;

import entity.Wyc_topictype;
import entity.Wyc_topictypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Wyc_topictypeMapper {
    long countByExample(Wyc_topictypeExample example);

    int deleteByExample(Wyc_topictypeExample example);

    int insert(Wyc_topictype record);

    int insertSelective(Wyc_topictype record);

    List<Wyc_topictype> selectByExample(Wyc_topictypeExample example);

    int updateByExampleSelective(@Param("record") Wyc_topictype record, @Param("example") Wyc_topictypeExample example);

    int updateByExample(@Param("record") Wyc_topictype record, @Param("example") Wyc_topictypeExample example);
}