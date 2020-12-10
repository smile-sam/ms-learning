package com.ms.learning.rpc.common;

import com.ms.learning.rpc.service.HelloService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/8 13:59
 * @version: v1.0
 */
public class Registry {

    private static Map<String, Map<String,Object>> register = new ConcurrentHashMap<>();

    public static void addService(String serviceName, Map map) {
        register.put(serviceName, map);
    }

    public static Map<String, Object> getServiceInfo(String serviceName) {
        return register.get(serviceName);
    }

    public static void registerService() {
        Map<String, Object> info = new ConcurrentHashMap<>();
        info.put("host", "127.0.0.1");
        info.put("port", 39390);

        Registry.addService(HelloService.class.getName(), info);

    }
}
