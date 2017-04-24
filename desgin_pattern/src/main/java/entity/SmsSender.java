package main.java.entity;

/**
 * Created by mengye on 17/4/16.
 */
public class SmsSender implements Sender {


  @Override
  public void sender() {
    System.out.print("Sms Sender");
  }
}
