package com.lzj.serve.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzj.serve.pojo.Admin;
import com.lzj.serve.pojo.Menu;
import com.lzj.serve.pojo.RespBean;
import com.lzj.serve.pojo.Role;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoubin
 * @since 2021-09-07
 */
public interface IAdminService extends IService<Admin> {

    RespBean login(String username, String password, String code, HttpServletRequest request);

    Admin getAdminByUsername(String username);

    List<Role> getRoles(Integer adminId);

    List<Admin> getAllAdmins(String keywords);

    RespBean updateAdminRole(Integer adminId, Integer[] rids);
}
