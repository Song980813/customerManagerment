package com.huayu.management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 员工表
 * </p>
 *
 * @author Song
 * @since 2020-08-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TbEmployee implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 角色
     */
    private String postId;

    /**
     * 部门
     */
    private Integer deptId;

    /**
     * 月薪
     */
    private Integer salary;

    /**
     * 头像
     */
    private String identificationPhoto;


}
