package com.remcarpediem.ugly.client.benchmark;

import com.remcarpediem.ugly.client.service.BenchmarkTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;
import java.util.List;
import java.util.Map;
@Component
public class FeignBenchmarkClient extends AbstractRPCBenchmarkClient {
    @Autowired
    private BenchmarkTestService service;


    @Override
    public BenchmarkTestService getProxyInstance(List<InetSocketAddress> servers, int clientNums, int connectTimeout, String targetInstanceName, Map<String, Integer> methodTimeouts, int codectype, Integer protocolType) {
        return service;
    }
}
