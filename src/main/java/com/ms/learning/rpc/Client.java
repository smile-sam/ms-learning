package com.ms.learning.rpc;

import com.ms.learning.rpc.client.RPCClient;
import com.ms.learning.rpc.service.HelloService;

import java.net.InetSocketAddress;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/8 14:41
 * @version: v1.0
 */
public class Client {
    public static void main(String[] args) {
        HelloService service = RPCClient.getRemoteProxyObj(HelloService.class, new InetSocketAddress("localhost", 8088));
        System.out.println(service.sayHello("test"));
    }
}
