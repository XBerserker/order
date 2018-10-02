package com.imooc.order.VO;

import lombok.Data;

/**
 * Created by lt on 2018/10/1.
 */

@Data
public class ResultVO<T> {
    private Integer code;

    private String msg;

    private T data;
}
