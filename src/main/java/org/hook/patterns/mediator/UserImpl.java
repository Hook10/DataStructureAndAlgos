package org.hook.patterns.mediator;

public class UserImpl extends User {
  public UserImpl(ChatMediator med, String name) {
    super(med, name);
  }

  @Override
  public void sent(String msg) {
    System.out.println(this.name+": Sending Message="+msg);
    mediator.sendMessage(msg, this);
  }

  @Override
  public void receive(String msg) {
    System.out.println(this.name+": Receive Message:" + msg);
  }
}
