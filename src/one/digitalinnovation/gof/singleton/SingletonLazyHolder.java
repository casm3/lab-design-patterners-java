package one.digitalinnovation.gof.singleton;

/**
 * Single Lazy Holder
 */
public class SingletonLazyHolder {

    private static class Holder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return Holder.instance;
    }

}
