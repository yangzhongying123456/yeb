package com.lzj.serve.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzj.serve.pojo.Menu;
import com.lzj.serve.pojo.MenuRole;
import com.lzj.serve.pojo.RespBean;
import com.lzj.serve.pojo.Role;
import com.lzj.serve.service.IMenuRoleService;
import com.lzj.serve.service.IMenuService;
import com.lzj.serve.service.IRoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @date:2021/9/12 14:46
 * @author:yang
 */
@RestController
@RequestMapping("/system/basic/permiss")
public class PermissController {
    @Autowired
    private IRoleService roleService;
    @Autowired
    private IMenuService menuService;
    @Autowired
    private IMenuRoleService menuRoleService;

    @GetMapping("/")
    @ApiOperation(value = "获取所有角色")
    public List<Role> getAllRoles() {
        return roleService.list();
    }

    @PostMapping("/role")
    @ApiOperation(value = "添加角色")
    public RespBean addRole(@RequestBody Role role) {
        if (!role.getName().startsWith("ROLE_")) {
            role.setName("ROLE_" + role.getName());
        }
        if (roleService.save(role)) {
            return RespBean.success("添加成功");
        }
        return RespBean.error("添加失败");
    }

    @DeleteMapping("/role/{rid}")
    @ApiOperation(value = "删除角色")
    public RespBean deleteRole(@PathVariable Integer rid) {
        if (roleService.removeById(rid)) {
            return RespBean.success("删除成功");
        }
        return RespBean.error("删除失败");
    }

    @GetMapping("/menus")
    @ApiOperation(value = "查询所有菜单")
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    @GetMapping("/mid/{rid}")
    @ApiOperation(value = "通过用户id查询菜单id")
    public List<Integer> getMidByRid(@PathVariable Integer rid) {
        return menuRoleService.list(new QueryWrapper<MenuRole>().eq("rid", rid))
                .stream().map(MenuRole::getMid).collect(Collectors.toList());
    }

    @PutMapping("/")
    @ApiOperation(value = "更新角色菜单")
    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
        return menuRoleService.updateMenuRole(rid, mids);
    }

}
