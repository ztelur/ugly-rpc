package com.remcarpediem.ugly.server.controller;

import com.google.gson.Gson;
import com.remcarpediem.ugly.common.CreateOrderForm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @PostMapping("/order")
    public String createOrder(@RequestBody CreateOrderForm form) {
        Gson gson = new Gson();
        return gson.toJson(form);
    }
}
