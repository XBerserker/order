package com.imooc.order.enums;

import lombok.Getter;

/**
 * Created by lt on 2018/9/30.
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHIED(1, "完结"),
    CANCEL(2, "取消"),
    ;
    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
