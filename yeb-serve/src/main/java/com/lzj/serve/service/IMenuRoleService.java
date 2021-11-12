package com.lzj.serve.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzj.serve.pojo.MenuRole;
import com.lzj.serve.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoubin
 * @since 2021-09-07
 */
public interface IMenuRoleService extends IService<MenuRole> {

    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
