package Dao;

import entity.Jsysqxx;
import entity.JsysqxxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JsysqxxMapper {
    long countByExample(JsysqxxExample example);

    int deleteByExample(JsysqxxExample example);

    int deleteByPrimaryKey(String id);

    int insert(Jsysqxx record);

    int insertSelective(Jsysqxx record);

    List<Jsysqxx> selectByExample(JsysqxxExample example);

    Jsysqxx selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Jsysqxx record, @Param("example") JsysqxxExample example);

    int updateByExample(@Param("record") Jsysqxx record, @Param("example") JsysqxxExample example);

    int updateByPrimaryKeySelective(Jsysqxx record);

    int updateByPrimaryKey(Jsysqxx record);
}