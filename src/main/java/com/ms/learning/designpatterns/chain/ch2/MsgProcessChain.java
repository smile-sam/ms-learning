package com.ms.learning.designpatterns.chain.ch2;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 14:15
 * @version: v1.0
 */
public class MsgProcessChain {
    private List<Process> chains = new ArrayList<>() ;
    /**
     * 添加责任链
     * @param process
     * @return
     */
    public MsgProcessChain addChain(Process process){
        chains.add(process) ;
        return this ;
    }
    /**
     * 执行处理
     * @param msg
     */
    public void process(String msg){
        for (Process chain : chains) {
            chain.handler(msg);
        }
    }
}
