package com.lanqiao.empsys.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

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