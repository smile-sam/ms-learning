package com.ms.learning.designpatterns.strategy.ch5;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 16:23
 * @version: v1.0
 */
@TaxTypeAnnotation(taxType = TaxType.INNER)
public class InterTaxStrategy implements TaxStrategy {
    @Override
    public double cacl(long amount) {
        final double taxRate =0.2;
        return amount * taxRate;
    }
}
