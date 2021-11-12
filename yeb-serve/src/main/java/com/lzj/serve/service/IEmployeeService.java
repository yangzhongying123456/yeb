package com.lzj.serve.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzj.serve.pojo.Employee;
import com.lzj.serve.pojo.RespBean;
import com.lzj.serve.pojo.RespPageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoubin
 * @since 2021-09-07
 */
public interface IEmployeeService extends IService<Employee> {

    RespPageBean getEmployeeByPage(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);

    RespBean addEmp(Employee employee);

    List<Employee> getEmployee(Integer id);
}
