package Dao;

import entity.Clsyrxx;
import entity.ClsyrxxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClsyrxxMapper {
    long countByExample(ClsyrxxExample example);

    int deleteByExample(ClsyrxxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Clsyrxx record);

    int insertSelective(Clsyrxx record);

    List<Clsyrxx> selectByExample(ClsyrxxExample example);

    Clsyrxx selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Clsyrxx record, @Param("example") ClsyrxxExample example);

    int updateByExample(@Param("record") Clsyrxx record, @Param("example") ClsyrxxExample example);

    int updateByPrimaryKeySelective(Clsyrxx record);

    int updateByPrimaryKey(Clsyrxx record);
}