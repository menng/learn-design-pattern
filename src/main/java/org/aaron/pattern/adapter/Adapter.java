package org.aaron.pattern.adapter;

/**
 * 类的适配器模式
 * 继承Adaptee，同时实现目标Target.
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        this.specificRequest();
    }

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
