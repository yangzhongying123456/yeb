package com.lzj.serve.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lzj.serve.pojo.Admin;
import com.lzj.serve.pojo.Menu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhoubin
 * @since 2021-09-07
 */
public interface AdminMapper extends BaseMapper<Admin> {

    List<Admin> getAllAdmins(@Param("id") Integer id, @Param("keywords") String keywords);
}
