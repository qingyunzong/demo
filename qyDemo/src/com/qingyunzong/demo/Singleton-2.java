//为了解决上面的问题，最简单的方法是将整个 getInstance() 方法设为同步（synchronized）
//虽然做到了线程安全，并且解决了多实例的问题，但是它并不高效。因为在任何时候只能有一个线程调用 getInstance() 方法。但是同步操作只需要在第一次调用时才被需要，即第一次创建单例实例对象时。这就引出了双重检验锁。
public class Singleton {
    private static Singleton instance;
    private Singleton (){}

    public static synchronized Singleton getInstance() {
     if (instance == null) {
         instance = new Singleton();
     }
     return instance;
    }
}