package com.lanqiao.empsys.service;


import com.github.pagehelper.Page;
import com.lanqiao.empsys.domain.Employees;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 */
public interface IEmployeesService {
    int deleteByPrimaryKey(Integer id);

    int insert(Employees record);

    int insertSelective(Employees record);

    Employees selectByPrimaryKey(Integer id);

    Page<Employees> selectBySelective(Employees employees, Integer pageNum, Integer pageSize);

    int updateByPrimaryKeySelective(Employees record);

}
