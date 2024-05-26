package com.jxm.sideline.constant;

import lombok.Getter;

/**
 * @author jiangyk
 * Created on 2024-05-26
 */
@Getter
public enum RespCode {
    SUCCESS(200);

    private final int code;

    RespCode(int code) {
        this.code = code;
    }
}
