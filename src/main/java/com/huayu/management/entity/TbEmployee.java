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
 * @since 2020-09-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TbEmployee implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer usernum;

    private String password;

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
     * 电话号码
     */
    private Integer phone;

    /**
     * 头像
     */
    private String identificationPhoto;

    /**
     * 人生格言
     */
    private String motto;


}
