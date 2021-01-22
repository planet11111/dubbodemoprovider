package com.atguigu.dao;

import com.atguigu.pojo.Travelgroup_TravelitemExample;
import com.atguigu.pojo.Travelgroup_TravelitemKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Travelgroup_TravelitemMapper {
    long countByExample(Travelgroup_TravelitemExample example);

    int deleteByExample(Travelgroup_TravelitemExample example);

    int deleteByPrimaryKey(Travelgroup_TravelitemKey key);

    int insert(Travelgroup_TravelitemKey record);

    int insertSelective(Travelgroup_TravelitemKey record);

    List<Travelgroup_TravelitemKey> selectByExample(Travelgroup_TravelitemExample example);

    int updateByExampleSelective(@Param("record") Travelgroup_TravelitemKey record, @Param("example") Travelgroup_TravelitemExample example);

    int updateByExample(@Param("record") Travelgroup_TravelitemKey record, @Param("example") Travelgroup_TravelitemExample example);
}