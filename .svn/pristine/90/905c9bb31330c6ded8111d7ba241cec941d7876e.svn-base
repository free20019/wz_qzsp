package Dao;

import entity.Clsqxx;
import entity.ClsqxxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClsqxxMapper {
    long countByExample(ClsqxxExample example);

    int deleteByExample(ClsqxxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Clsqxx record);

    int insertSelective(Clsqxx record);

    List<Clsqxx> selectByExample(ClsqxxExample example);

    Clsqxx selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Clsqxx record, @Param("example") ClsqxxExample example);

    int updateByExample(@Param("record") Clsqxx record, @Param("example") ClsqxxExample example);

    int updateByPrimaryKeySelective(Clsqxx record);

    int updateByPrimaryKey(Clsqxx record);
}