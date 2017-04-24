package main.java.singleton;

/**
 * Created by mengye on 17/4/16.
 */
public class Singleton {

  private static Singleton instance = null;

  private Singleton() {
  }


  public static synchronized void syncInit() {
    if (instance == null) {
      instance = new Singleton();
    }
  }

  public static Singleton getInstance() {
    if (instance == null) {
      syncInit();
    }
    return instance;
  }

  public Object readResolve() {
    return instance;
  }

}
