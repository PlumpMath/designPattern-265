package main.java.Bridge;

/**
 * Created by mengye on 17/4/16.
 */
public class MyBridge extends Bridge {

  public void method() {
    getSourceable().method();
  }
}
