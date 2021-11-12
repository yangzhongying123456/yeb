package com.lzj.serve.controller;


import com.lzj.serve.pojo.Admin;
import com.lzj.serve.pojo.RespBean;
import com.lzj.serve.pojo.Role;
import com.lzj.serve.service.IAdminService;
import com.lzj.serve.service.IRoleService;
import com.lzj.serve.service.imlp.RoleServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/system/admin")
public class AdminController {
    @Autowired
    private IAdminService adminService;
    @Autowired
    private IRoleService roleService;

    @GetMapping("/")
    @ApiOperation(value = "获取所有操作员")
    private List<Admin> getAllAdmins(String keywords) {
        return adminService.getAllAdmins(keywords);
    }

    @PutMapping("/")
    @ApiOperation(value = "更新操作员")
    private RespBean updateAdmin(@RequestBody Admin admin) {
        if (adminService.updateById(admin)) {
            return RespBean.success("更新成功");
        }
        return RespBean.success("更新失败");
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除操作员")
    public RespBean deleteAdmin(@PathVariable Integer id) {
        if (adminService.removeById(id)) {
            return RespBean.success("删除成功");
        }
        return RespBean.success("删除失败");
    }

    @GetMapping("/roles")
    @ApiOperation(value = "获取所有角色")
    public List<Role> getAllRoles() {
        return roleService.list();
    }

    @PutMapping("/role")
    @ApiOperation(value = "更新操作员角色")
    public RespBean updateAdminRole(Integer adminId, Integer[] rids) {
        return adminService.updateAdminRole(adminId, rids);
    }
}
