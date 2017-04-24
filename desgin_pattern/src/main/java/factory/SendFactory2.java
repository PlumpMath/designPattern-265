package main.java.factory;

import main.java.entity.MailSender;
import main.java.entity.Sender;
import main.java.entity.SmsSender;

/**
 * Created by mengye on 17/4/16.
 */
public class SendFactory2 {

  public Sender produceSms() {
    return new SmsSender();
  }

  public Sender produceMail() {
    return new MailSender();
  }

}
