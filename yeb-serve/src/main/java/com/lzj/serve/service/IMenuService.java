package com.lzj.serve.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzj.serve.pojo.Menu;
import com.lzj.serve.pojo.Role;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoubin
 * @since 2021-09-07
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> getMenuByAdminId();

    /**
     * 根据角色获取菜单列表
     * @return
     */
    List<Menu> getMenusWithRole();

    List<Menu> getAllMenus();
}
