package Dao;

import entity.Wyc_seat;
import entity.Wyc_seatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Wyc_seatMapper {
    long countByExample(Wyc_seatExample example);

    int deleteByExample(Wyc_seatExample example);

    int insert(Wyc_seat record);

    int insertSelective(Wyc_seat record);

    List<Wyc_seat> selectByExample(Wyc_seatExample example);

    int updateByExampleSelective(@Param("record") Wyc_seat record, @Param("example") Wyc_seatExample example);

    int updateByExample(@Param("record") Wyc_seat record, @Param("example") Wyc_seatExample example);
}