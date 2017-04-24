package main.java.factory;

import main.java.entity.Sender;

/**
 * Created by mengye on 17/4/16.
 */
public interface Provider {
  public Sender produce();
}
