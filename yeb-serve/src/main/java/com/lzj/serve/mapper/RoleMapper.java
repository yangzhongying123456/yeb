package com.lzj.serve.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lzj.serve.pojo.Role;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhoubin
 * @since 2021-09-07
 */
public interface RoleMapper extends BaseMapper<Role> {

    List<Role> getRoles(Integer adminId);
}
