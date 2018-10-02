package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

/**
 * Created by lt on 2018/9/30.
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
