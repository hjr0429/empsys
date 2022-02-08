package com.lanqiao.empsys.mapper;

import com.github.pagehelper.Page;
import com.lanqiao.empsys.domain.Employees;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Entity com.lanqiao.empsys.domain.Employees
 */
@Repository
public interface EmployeesMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Employees record);

    int insertSelective(Employees record);

    Employees selectByPrimaryKey(Integer id);

    Page<Employees> selectBySelective(@Param("employees") Employees employees, @Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

    int updateByPrimaryKeySelective(Employees record);

//    int updateByPrimaryKey(Employees record);

}
