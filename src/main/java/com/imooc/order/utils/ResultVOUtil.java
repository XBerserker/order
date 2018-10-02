package com.imooc.order.utils;

import com.imooc.order.VO.ResultVO;

/**
 * Created by lt on 2018/10/1.
 */
public class ResultVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
