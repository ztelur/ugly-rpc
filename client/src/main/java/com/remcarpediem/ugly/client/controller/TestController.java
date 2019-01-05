package com.remcarpediem.ugly.client.controller;

import com.remcarpediem.ugly.client.benchmark.FeignBenchmarkClient;
import com.remcarpediem.ugly.client.benchmark.FeignBenchmarkClientRunnable;
import com.remcarpediem.ugly.client.client.OrderClient;
import com.remcarpediem.ugly.client.form.TestForm;
import com.remcarpediem.ugly.common.CreateOrderForm;
import com.remcarpediem.ugly.common.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private OrderClient orderClient;
    @Autowired
    private FeignBenchmarkClient feignBenchmarkClient;

    @PostMapping("/test")
    public void test(@RequestBody TestForm form) {
        String[] args = new String[] {
//
        };
        try {
            feignBenchmarkClient.run(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        Order order = orderClient.createOrder(new CreateOrderForm());
    }
}
