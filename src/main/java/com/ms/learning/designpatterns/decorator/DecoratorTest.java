package com.ms.learning.designpatterns.decorator;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/6 13:55
 * @version: v1.0
 */
/**
 * 需求
 * 一个照相机拥有拍照功能，在不改变拍照功能的情况下添加美颜和滤镜功能
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Component component = new ConcreteComponent2(new ConcreteComponent1(new ConcreteComponent()));
        component.operation();
    }
}

interface Component{
    void operation();
}
//拍照
class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("拍照");
    }
}
//装饰器
abstract class Decorator implements Component{

    Component component;
    public Decorator(Component component) {
        this.component = component;
    }
}
//美颜
class ConcreteComponent1 extends Decorator{
    public ConcreteComponent1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("美颜");
    }
}
class ConcreteComponent2 extends Decorator{
    public ConcreteComponent2(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("滤镜");
    }
}
