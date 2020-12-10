package com.ms.learning.rpc;

import com.ms.learning.rpc.client.RPCClient;
import com.ms.learning.rpc.server.Server;
import com.ms.learning.rpc.server.ServiceCenter;
import com.ms.learning.rpc.service.HelloService;
import com.ms.learning.rpc.service.impl.HelloServiceImpl;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/8 14:28
 * @version: v1.0
 */
public class RPCTest {

    public static void main(String[] args) throws IOException {
        System.out.println("Runtime.getRuntime().availableProcessors() ======" + Runtime.getRuntime().availableProcessors());
        new Thread(new Runnable() {
            public void run() {
                try {
                    Server serviceServer = new ServiceCenter(8088);
                    serviceServer.register(HelloService.class, HelloServiceImpl.class);
                    serviceServer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        HelloService service = RPCClient.getRemoteProxyObj(HelloService.class, new InetSocketAddress("localhost", 8088));
        System.out.println(service.sayHello("test"));
    }
}
