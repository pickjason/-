package com.wzz.personal.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author wzz
 * @since 2019-07-31
 */
@Data
@TableName("user")
public class User  {

    private static final long serialVersionUID = 1L;

    private LocalDateTime createTime;

    private String name;

    private String passworld;


}
