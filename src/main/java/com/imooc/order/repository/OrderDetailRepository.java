package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lt on 2018/9/30.
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
