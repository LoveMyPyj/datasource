package com.example.boot.datasource.dao.test;

import com.example.boot.datasource.model.OpUserLogin;
import com.example.boot.datasource.model.OpUserLoginExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestOpUserLoginMapper {
    int countByExample(OpUserLoginExample example);

    int deleteByExample(OpUserLoginExample example);

    int deleteByPrimaryKey(String cPkId);

    int insert(OpUserLogin record);

    int insertSelective(OpUserLogin record);

    List<OpUserLogin> selectByExample(OpUserLoginExample example);

    OpUserLogin selectByPrimaryKey(String cPkId);

    int updateByExampleSelective(@Param("record") OpUserLogin record, @Param("example") OpUserLoginExample example);

    int updateByExample(@Param("record") OpUserLogin record, @Param("example") OpUserLoginExample example);

    int updateByPrimaryKeySelective(OpUserLogin record);

    int updateByPrimaryKey(OpUserLogin record);
}