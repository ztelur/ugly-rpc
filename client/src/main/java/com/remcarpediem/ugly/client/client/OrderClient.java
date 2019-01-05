package com.remcarpediem.ugly.client.client;

import com.remcarpediem.ugly.common.CreateOrderForm;
import com.remcarpediem.ugly.common.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("order")
public interface OrderClient {
    @PostMapping("/order")
    Order createOrder(@RequestBody CreateOrderForm form);
}
