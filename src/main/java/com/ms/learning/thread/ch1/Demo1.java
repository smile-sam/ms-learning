package com.ms.learning.thread.ch1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/7 14:32
 * @version: v1.0
 */
public class Demo1 {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            // 1 创建服务端监听套接字
            serverSocket = new ServerSocket(7001);

            System.out.println("server is started ");
            // 2 循环监控客户端发来的请求连接
            while (true) {
                // 2.1 获取客户端的连接套接字
                final Socket acceptSocket = serverSocket.accept();
                // 2.2 开启线程处理接受套接字
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        processAcceptSocket(acceptSocket);
                    }
                }).start();
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            // 3 关闭服务监听套接字
            if (null != serverSocket) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void processAcceptSocket(Socket acceptSocket) {
        // 封装socket为SocketProcessor后投递到线程池进行处理
        // try
        // {
        //     SocketWrapper<Socket> wrapper = new SocketWrapper<Socket>(socket);
        //     wrapper.setKeepAliveLeft(getMaxKeepAliveRequests());
        //     wrapper.setSecure(isSSLEnabled());
        // // ...
        //     getExecutor().execute(new SocketProcessor(wrapper));
        // }
        // // ...
        // return true;

    }
}
