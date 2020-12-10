package com.ms.learning.rpc.server;

import java.io.IOException;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/8 14:27
 * @version: v1.0
 */
public interface Server {
    public void stop();

    public void start() throws IOException;

    public void register(Class serviceInterface, Class impl);

    public boolean isRunning();

    public int getPort();
}
