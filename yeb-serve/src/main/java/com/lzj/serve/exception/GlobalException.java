package com.lzj.serve.exception;

import com.lzj.serve.pojo.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 全局异常处理
 *
 * @date:2021/9/12 11:42
 * @author:yang
 */
@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(SQLException.class)
    public RespBean mySqlException(SQLException e) {
        if (e instanceof SQLIntegrityConstraintViolationException) {
            return RespBean.error("数据库有关联数据，操作失败!");
        }
        return RespBean.error("数据库异常，操作失败!");
    }
}
