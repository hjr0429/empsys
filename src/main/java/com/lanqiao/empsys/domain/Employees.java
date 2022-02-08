package com.lanqiao.empsys.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @TableName employees
 */
@Data
public class Employees implements Serializable {
    /**
     * 
     */
    private Integer empno;

    /**
     * 
     */
    private String ename;

    /**
     * 
     */
    private String job;

    /**
     * 
     */
    private Integer mgr;

    /**
     * 
     */
    /*前端input传入日期时必须使用注解，否则会类型转换错误*/
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hiredate;

    /**
     * 
     */
    private Double sal;

    /**
     * 
     */
    private Double comm;

    /**
     * 
     */
    private Integer deptno;

    private static final long serialVersionUID = 1L;
}