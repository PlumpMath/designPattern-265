package main.java.factory;

import main.java.entity.MailSender;
import main.java.entity.Sender;
import main.java.entity.SmsSender;

/**
 * Created by mengye on 17/4/16.
 */
public class SendFactory {

  public Sender produce(String type) {
    if ("sms".equals(type)) {
      return new SmsSender();
    } else if ("mail".equals(type)) {
      return new MailSender();
    } else {
      return null;
    }
  }

}
