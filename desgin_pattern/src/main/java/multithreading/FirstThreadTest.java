package main.java.multithreading;

/**
 * Created by mengye on 17/4/22.
 */
public class FirstThreadTest extends Thread {
  private int i;

  @Override
  public void run() {
    for (i = 0; i < 100; i++) {
      System.out.println(getName() + "**" + i);
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      System.out.println(Thread.currentThread() + "  :" + i);
      if (i == 20) {
        new FirstThreadTest().start();
        new FirstThreadTest().start();
      }
    }
  }

}
