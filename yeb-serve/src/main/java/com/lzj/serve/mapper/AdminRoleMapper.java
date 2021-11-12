package com.lzj.serve.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lzj.serve.pojo.AdminRole;
import com.lzj.serve.pojo.RespBean;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhoubin
 * @since 2021-09-07
 */
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

    Integer updateAdminRole(@Param("adminId") Integer adminId, @Param("rids") Integer[] rids);
}
