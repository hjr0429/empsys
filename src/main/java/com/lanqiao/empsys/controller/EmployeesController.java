package com.lanqiao.empsys.controller;


import com.github.pagehelper.Page;
import com.lanqiao.empsys.domain.Employees;
import com.lanqiao.empsys.service.IEmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@Controller
@SessionAttributes({"employeeList"})
public class EmployeesController {

    @Autowired
    IEmployeesService employeesService;

    @GetMapping("/employees")
    public String queryAll(Employees employees, Integer pageNum, Model model, HttpSession session){
        if (pageNum == null) {
            pageNum=1;
            session.setAttribute("employees",employees);
        }else {
            employees= (Employees) session.getAttribute("employees");
        }
        Page<Employees> employeeList = this.employeesService.selectBySelective(employees,pageNum,5);
        model.addAttribute("employeeList",employeeList);
        return "employee/list";
    }

    @GetMapping("/employees/{empno}")
    public String selectByPrimaryKey(@PathVariable("empno") Integer empno,Model model){
        Employees employee = this.employeesService.selectByPrimaryKey(empno);
        model.addAttribute("employee",employee);
        return "employee/updateForm";
    }

    @PostMapping("/employees/update")
    public String update(Employees employee){
        System.out.println(employee+"update");
        this.employeesService.updateByPrimaryKeySelective(employee);
        return "redirect:/employees";
    }

    @GetMapping("/employees/delete/{empno}")
    public String delete(@PathVariable("empno") Integer empno,Model model){
        this.employeesService.deleteByPrimaryKey(empno);
        return "redirect:/employees";
    }

    @GetMapping("/employees/add")
    public String add(){
        return "employee/addForm";
    }

    @PostMapping("/employees/insert")
    public String insert(Employees employees){
        System.out.println(employees+"here!!!!");
        this.employeesService.insertSelective(employees);
        return "redirect:/employees";
    }
}
