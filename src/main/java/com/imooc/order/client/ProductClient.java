package com.imooc.order.client;

import com.imooc.order.dataobject.ProductInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by lt on 2018/10/1.
 */
@FeignClient(name = "product")
public interface ProductClient {

    @GetMapping("/msg")//通过url mapping来调用其他服务
    String productMsg();

    @GetMapping("/product/listForOrder")
    List<ProductInfo> productInfoList(List<String> productIdList);
}
