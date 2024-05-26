package com.jxm.sideline.model.DO;

import com.jxm.sideline.constant.RespCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * <h1>通用响应对象定义</h1>
 *
 * @author jiangyk
 * Created on 2024-05-26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = -3022481486508067642L;

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String message;

    /**
     * 泛型响应数据
     */
    private T data;

    /**
     * 不需要 data 的返回
     */
    public CommonResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 只需要 data 的返回
     */
    public CommonResponse(T data) {
        this.code = RespCode.SUCCESS.getCode();
        this.data = data;
    }
}
