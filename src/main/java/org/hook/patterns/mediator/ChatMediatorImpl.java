package org.hook.patterns.mediator;

import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

  private List<User> users;

  public ChatMediatorImpl(List<User> users) {
    this.users = users;
  }

  @Override
  public void sendMessage(String msg, User user) {
    for (User u : this.users) {
      if (u != user) {
         u.receive(msg);
      }
    }
  }

  @Override
  public void addUser(User user) {
    this.users.add(user);
  }
}
