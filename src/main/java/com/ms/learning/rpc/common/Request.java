package com.ms.learning.rpc.common;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/8 13:57
 * @version: v1.0
 */
public interface Request {

    String getInterfaceName();

    String getMethodName();

    Object [] getArguments();

    Class<?> [] getParameterTypes();



}
