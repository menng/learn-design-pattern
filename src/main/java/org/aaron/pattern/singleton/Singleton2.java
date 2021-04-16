package org.aaron.pattern.singleton;

public class Singleton2 {
    private static volatile Singleton2 singleton;

    private Singleton2(){}

    /**
     * 对方法加锁，不适用于高并发。
     * @return single instance
     */
    private static synchronized Singleton2 getInstance() {
        if (singleton == null) {
            singleton = new Singleton2();
        }

        return singleton;
    }

    public static void main(String[] args) {
        System.out.println(Singleton2.getInstance());
    }
}
