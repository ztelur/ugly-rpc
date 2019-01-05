package com.remcarpediem.ugly.client.benchmark;
/**
 * nfs-rpc
 *   Apache License
 *   
 *   http://code.google.com/p/nfs-rpc (c) 2011
 */

import com.remcarpediem.ugly.client.service.BenchmarkTestService;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;


/**
 * Test for RPC based on reflection Benchmark
 * 
 * @author <a href="mailto:bluedavy@gmail.com">bluedavy</a>
 */

public abstract class AbstractRPCBenchmarkClient extends AbstractBenchmarkClient{

	public ClientRunnable
	getClientRunnable(String targetIP, int targetPort,
			int clientNums, int rpcTimeout, int codecType, int requestSize,
			CyclicBarrier barrier, CountDownLatch latch, long endTime, long startTime) {
		Map<String, Integer> methodTimeouts = new HashMap<String, Integer>();
		methodTimeouts.put("*", rpcTimeout);
		List<InetSocketAddress> servers = new ArrayList<InetSocketAddress>();
		servers.add(new InetSocketAddress(targetIP, targetPort));
		String serviceName = "testservice";
		return new FeignBenchmarkClientRunnable(
				getProxyInstance(servers, clientNums, 1000, serviceName,methodTimeouts, codecType, 1),
				requestSize, barrier, latch, startTime, endTime, codecType);
	}
	/*
	 * return ProxyObject
	 */
	public abstract BenchmarkTestService getProxyInstance(
			List<InetSocketAddress> servers, int clientNums,
			int connectTimeout, String targetInstanceName,
			Map<String, Integer> methodTimeouts, int codectype, Integer protocolType);
}