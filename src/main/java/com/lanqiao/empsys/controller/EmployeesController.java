package com.lanqiao.empsys.controller;


import com.github.pagehelper.Page;
import com.lanqiao.empsys.domain.Employees;
import com.lanqiao.empsys.service.IEmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes({"employeeList","employees"})
public class EmployeesController {

    @Autowired
    IEmployeesService employeesService;

    @GetMapping("/employees")
    public String queryAll(Employees employees,Integer pageNum, Model model){
        if (pageNum == null) {
            pageNum=1;
            model.addAttribute("employees",employees);
            System.out.println("没有查询条件："+employees);
        }else {
            employees= (Employees) model.getAttribute("employees");
            System.out.println("有查询条件"+employees);
        }
        Page<Employees> employeeList = this.employeesService.selectBySelective(employees,pageNum,5);
        model.addAttribute("employeeList",employeeList);
        return "employee/list";
    }
}
