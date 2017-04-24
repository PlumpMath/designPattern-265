package main.java;

import static main.java.factory.SenderFactory3.produceMail;

import main.java.Adapter.Adapter;
import main.java.entity.Sender;
import main.java.entity.Targetable;
import main.java.factory.Provider;
import main.java.factory.SendFactory;
import main.java.factory.SendFactory2;
import main.java.factory.SmsSenderFactory;

/**
 * Created by mengye on 17/4/16.
 */
public class Main {

  public static void main(String[] args) {
    SendFactory sendFactory = new SendFactory();
    Sender sender = sendFactory.produce("sms");
    System.out.print("SenderFactory:\n");
    sender.sender();

    System.out.print("\n");

    System.out.print("SenderFactory2:\n");
    SendFactory2 sendFactory2 = new SendFactory2();
    Sender sender1 = sendFactory2.produceMail();
    sender1.sender();

    System.out.print("\n");

    System.out.print("SenderFactory3:\n");
    Sender sender2 = produceMail();
    sender2.sender();

    System.out.print("\n");

    System.out.print("SenderFactory4:\n");
    Provider provider = new SmsSenderFactory();
    Sender sender3 = provider.produce();
    sender3.sender();

    System.out.print("\n");

    System.out.print("Adapter:\n");
    Targetable targetable = new Adapter();
    targetable.method1();
    System.out.print("\n");
    targetable.method2();

  }
}
