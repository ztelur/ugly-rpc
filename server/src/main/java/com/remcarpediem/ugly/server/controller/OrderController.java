package com.remcarpediem.ugly.server.controller;

import com.remcarpediem.ugly.common.CreateOrderForm;
import com.remcarpediem.ugly.common.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @PostMapping("/order")
    public Order createOrder(@RequestBody CreateOrderForm form) {
        Order order = new Order();
        order.setContent(form.getContent() + "123123");
        return order;
    }
}
