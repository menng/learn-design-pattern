package org.aaron.pattern.adapter;

/**
 * 对象的适配器模式
 * 继承Adaptee，同时实现目标Target.
 */
public class Adapter2 implements Target {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

    public static void main(String[] args) {
        Target target = new Adapter2(new Adaptee());
        target.request();
    }
}
