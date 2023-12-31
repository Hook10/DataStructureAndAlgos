package org.hook.patterns.mediator;

public interface ChatMediator {
  void sendMessage(String msg, User user);
  void addUser(User user);
}
