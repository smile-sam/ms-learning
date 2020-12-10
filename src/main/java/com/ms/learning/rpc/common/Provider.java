package com.ms.learning.rpc.common;

import com.ms.learning.rpc.service.HelloService;
import com.ms.learning.rpc.service.impl.HelloServiceImpl;
import org.springframework.util.StreamUtils;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/8 14:16
 * @version: v1.0
 */
public class Provider {

    private Map<String, Class> cache = new HashMap<>();

    public void start() {
        Registry.registerService();
        cache.put(HelloService.class.getName(), HelloServiceImpl.class);

        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.bind(new InetSocketAddress("127.0.0.1", 39390));
            Selector selector = Selector.open();
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

            System.out.println("服务端开启");
            while (true) {
                selector.select();
                Iterator<SelectionKey> it = selector.selectedKeys().iterator();
                while(it.hasNext()) {
                    SelectionKey key = it.next();
                    it.remove();
                    if(key.isAcceptable()) {
                        SocketChannel socket = serverSocketChannel.accept();
                        socket.configureBlocking(false);
                        socket.register(selector, SelectionKey.OP_READ);
                    }

                    if(key.isReadable()) {
                        SocketChannel socket = (SocketChannel) key.channel();
                    }
                }
            }
        }catch (Exception e) {

        }finally {

        }
    }
}
