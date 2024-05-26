package com.jxm.sideline.model.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Builder
public class WxUserInfoVO implements Serializable {
    @Serial
    private static final long serialVersionUID = 742913121420935121L;
    private String openId;
    private Integer points;
    private String name;
    private Integer type;
}
