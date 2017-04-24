package main.java.factory;

import main.java.entity.Sender;
import main.java.entity.SmsSender;

/**
 * Created by mengye on 17/4/16.
 */
public class SmsSenderFactory implements Provider {
  @Override
  public Sender produce() {
    return new SmsSender();
  }
}
