package Dao;

import entity.Wyc_classroom;
import entity.Wyc_classroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Wyc_classroomMapper {
    long countByExample(Wyc_classroomExample example);

    int deleteByExample(Wyc_classroomExample example);

    int insert(Wyc_classroom record);
    

    int insertSelective(Wyc_classroom record);

    List<Wyc_classroom> selectByExample(Wyc_classroomExample example);

    int updateByExampleSelective(@Param("record") Wyc_classroom record, @Param("example") Wyc_classroomExample example);

    int updateByExample(@Param("record") Wyc_classroom record, @Param("example") Wyc_classroomExample example);
}