package org.aaron.pattern.singleton;

public class Singleton {
    private static volatile Singleton singleton;

    private Singleton(){}

    /**
     * DCL double-checked Locking
     * @return single instance
     */
    private static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
    }
}
