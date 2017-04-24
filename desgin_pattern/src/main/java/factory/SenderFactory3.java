package main.java.factory;

import main.java.entity.MailSender;
import main.java.entity.Sender;
import main.java.entity.SmsSender;

/**
 * Created by mengye on 17/4/16.
 */
public class SenderFactory3 {
  public static Sender produceSms() {
    return new SmsSender();
  }

  public static Sender produceMail() {
    return new MailSender();
  }
}
