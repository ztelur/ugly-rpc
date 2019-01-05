package com.remcarpediem.ugly.client.service;

import com.remcarpediem.ugly.client.client.OrderClient;
import com.remcarpediem.ugly.common.CreateOrderForm;
import com.remcarpediem.ugly.common.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BenchmarkTestService {
    @Autowired
    private OrderClient orderClient;

    public Order createOrder(String content) {
        CreateOrderForm createOrderForm = new CreateOrderForm();
        createOrderForm.setContent(content);
        return orderClient.createOrder(createOrderForm);
    }
}
