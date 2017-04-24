package main.java.multithreading;

/**
 * Created by mengye on 17/4/22.
 */
public class RunnableThreadTest implements Runnable {
  private int i;

  @Override
  public void run() {
    for (i = 0; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + "**" + i);
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      System.out.println(Thread.currentThread() + "  :" + i);
      if (i == 20) {
        RunnableThreadTest runnableThreadTest = new RunnableThreadTest();
        new Thread(runnableThreadTest, "线程1").start();
        new Thread(runnableThreadTest, "线程2").start();
      }
    }
  }
}
