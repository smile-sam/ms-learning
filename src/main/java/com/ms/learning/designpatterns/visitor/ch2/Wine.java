package com.ms.learning.designpatterns.visitor.ch2;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/8 10:30
 * @version: v1.0
 */
public class Wine  implements Goods {
    public double accountByBottle() {
        System.out.println("酒按瓶计价,购买的数量为：" + getCount() + "瓶，购买的单价为：" + getPrice() + "，总价为：" + getCount() * getPrice());
        return getCount() * getPrice();
    }

    public double accept(GoodVisitor visitor) {
        return visitor.visit(this);
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }

    public float getPrice(){ return price; }

    public void setPrice(float price){ this.price = price; }

    private int count;
    private float price;
}
