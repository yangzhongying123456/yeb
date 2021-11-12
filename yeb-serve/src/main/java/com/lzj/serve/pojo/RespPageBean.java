package com.lzj.serve.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @date:2021/9/12 19:59
 * @author:yang
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespPageBean {
    // 总条数
    private long total;
    // 数据
    private List<?> data;
}
