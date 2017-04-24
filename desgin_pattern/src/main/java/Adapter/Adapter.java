package main.java.Adapter;

import main.java.entity.Source;
import main.java.entity.Targetable;

/**
 * Created by mengye on 17/4/16.
 */
public class Adapter extends Source implements Targetable {


  @Override
  public void method2() {
    System.out.print("Targetable method2");
  }
}
