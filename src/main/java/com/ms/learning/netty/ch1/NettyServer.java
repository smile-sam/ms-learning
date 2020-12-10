package com.ms.learning.netty.ch1;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/7 14:39
 * @version: v1.0
 */
public class NettyServer {

    static final int PORT = Integer.parseInt(System.getProperty("port", "8007"));

    public static void main(String[] args) throws Exception
    {
        //1.1 创建主从Reactor线程池
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try
        {
            //1.2 创建启动类ServerBootstrap实例，用来设置客户端相关参数
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workerGroup)                      //1.2.1 设置主从线程池组
                    .channel(NioServerSocketChannel.class)       //1.2.2 指定用于创建客户端NIO通道的Class对象
                    .option(ChannelOption.SO_BACKLOG, 100)       //1.2.3 设置客户端套接字参数
                    .handler(new LoggingHandler(LogLevel.INFO))  //1.2.4 设置日志handler
                    .childHandler(new ChannelInitializer<SocketChannel>()
                    {
                        //1.2.5 设置用户自定义handler
                        @Override
                        public void initChannel(SocketChannel ch) throws Exception
                        {
                            ChannelPipeline p = ch.pipeline();
                            p.addLast((ChannelHandler) new NettyServerHandler());
                        }
                    });

            //1.3 启动服务器
            ChannelFuture f = b.bind(PORT).sync();
            System.out.println("----Server Started----");

            //1.4 同步等待服务socket关闭
            f.channel().closeFuture().sync();
        }
        finally
        {
            // 1.5 优雅关闭线程池组
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}
