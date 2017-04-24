package main.java.factory;

import main.java.entity.MailSender;
import main.java.entity.Sender;

/**
 * Created by mengye on 17/4/16.
 */
public class MailSenderFactory implements Provider {
  @Override
  public Sender produce() {
    return new MailSender();
  }
}
