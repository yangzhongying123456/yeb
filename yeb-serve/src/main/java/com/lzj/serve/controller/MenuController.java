package com.lzj.serve.controller;


import com.lzj.serve.pojo.Menu;
import com.lzj.serve.service.IAdminService;
import com.lzj.serve.service.IMenuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhoubin
 * @since 2021-09-07
 */
@RestController
@RequestMapping("/system/cfg")
public class MenuController {
    @Autowired
    private IMenuService menuService;

    @GetMapping("/menu")
    @ApiOperation(value = "通过用户id查询菜单列表")
    public List<Menu> getMenuByAdminId() {
        return menuService.getMenuByAdminId();
    }

}
