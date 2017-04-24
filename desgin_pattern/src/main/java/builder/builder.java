package main.java.builder;

import java.util.ArrayList;
import java.util.List;

import main.java.entity.MailSender;
import main.java.entity.Sender;
import main.java.entity.SmsSender;

/**
 * Created by mengye on 17/4/16.
 */
public class builder {

  private List<Sender> senders = new ArrayList<>();

  public void produceSmsSender(int count) {
    for (int i = 0; i < count; i++) {
      senders.add(new SmsSender());
    }
  }

  public void produceMailSender(int count) {
    for (int i = 0; i < count; i++) {
      senders.add(new MailSender());
    }
  }

}
