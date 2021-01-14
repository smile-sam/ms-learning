package com.ms.learning.designpatterns.visitor.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/8 10:30
 * @version: v1.0
 */
public class Pig implements Goods {
    public double accountByUnit() {
        System.out.println("猪肉按斤计价,购买的数量为：" + getCount() + "斤，购买的单价为：" + getPrice() + "，总价为：" + getCount() * getPrice());
        return getCount() * getPrice();
    }
    @Override
    public double accept(GoodVisitor visitor) {
        return visitor.visit(this);
    }

    public float getCount(){ return count; }

    public void setCount(float count){ this.count = count; }

    public float getPrice(){ return price; }

    public void setPrice(float price){ this.price = price; }

    private float count;
    private float price;
}

