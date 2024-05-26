package com.jxm.sideline.model.DO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 微信用户记录表
 * </p>
 *
 * @author jiangyk
 * @since 2024-05-26
 */
@Getter
@Setter
@TableName("wx_user_info")
public class WxUserInfoDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户唯一标识
     */
    @TableField("open_id")
    private String openId;

    /**
     * 用户积分
     */
    @TableField("points")
    private Integer points;

    /**
     * 用户名称
     */
    @TableField("name")
    private String name;

    /**
     * 用户类型
     */
    @TableField("type")
    private Integer type;
}
