package com.lzj.serve.config.security;

import com.lzj.serve.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @date:2021/9/12 16:24
 * @author:yang
 */
public class AdminUtils {
    public static Admin getCurrentAdmin() {
        return ((Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
