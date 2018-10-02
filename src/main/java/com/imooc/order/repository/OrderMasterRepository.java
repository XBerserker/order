package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lt on 2018/9/30.
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

}
