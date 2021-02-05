package Dao;

import entity.Wyc_appointment;
import entity.Wyc_appointmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Wyc_appointmentMapper {
    long countByExample(Wyc_appointmentExample example);

    int deleteByExample(Wyc_appointmentExample example);

    int insert(Wyc_appointment record);

    int insertSelective(Wyc_appointment record);

    List<Wyc_appointment> selectByExample(Wyc_appointmentExample example);

    int updateByExampleSelective(@Param("record") Wyc_appointment record, @Param("example") Wyc_appointmentExample example);

    int updateByExample(@Param("record") Wyc_appointment record, @Param("example") Wyc_appointmentExample example);
}