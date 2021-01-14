package com.ms.learning.designpatterns.strategy.ch5;

import org.reflections.Reflections;
import sun.reflect.Reflection;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 16:24
 * @version: v1.0
 */
public class AnnotationTaxStrategyFactory {

    static Map<TaxType, TaxStrategy> taxTypeTaxStrategyMap = new HashMap<>();

    static {
        registerTaxStrategy();
    }


    public  static TaxStrategy getTaxStrategy(TaxType taxType) throws Exception {
        if(taxTypeTaxStrategyMap.containsKey(taxType)) {
            return taxTypeTaxStrategyMap.get(taxType);
        } else {
            throw  new Exception("The tax type is not supported.");
        }
    }

    private static void registerTaxStrategy() {
        try{
            // 通过反射找到所有的策略实现类进行注册
            // Reflections reflections = new Reflections(new Configurationbui)

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
