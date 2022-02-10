package com.lanqiao.empsys.service.impl;


import com.github.pagehelper.Page;
import com.lanqiao.empsys.domain.Employees;
import com.lanqiao.empsys.mapper.EmployeesMapper;
import com.lanqiao.empsys.service.IEmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service("employeesServise")
public class EmployeesServiceImpl implements IEmployeesService {

    @Autowired
    EmployeesMapper employeesMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.employeesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Employees record) {
        return this.employeesMapper.insert(record);
    }

    @Override

    public int insertSelective(Employees record) {
        return this.employeesMapper.insertSelective(record);
    }

    @Override
    public Employees selectByPrimaryKey(Integer id) {
        return this.employeesMapper.selectByPrimaryKey(id);
    }

    @Override
    @Cacheable(value = "EmployeeList",key = "#employees+'::'+#pageNum")
    public Page<Employees> selectBySelective(Employees employees, Integer pageNum, Integer pageSize) {
        return this.employeesMapper.selectBySelective(employees,pageNum,pageSize);
    }

    @Override
    public int updateByPrimaryKeySelective(Employees record) {
        return this.employeesMapper.updateByPrimaryKeySelective(record);
    }


}




