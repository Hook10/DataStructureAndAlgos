package org.hook.patterns.chainofresponsibility.practice;

public abstract class PaymentHandler {
  protected PaymentHandler next;

  public void setNext(PaymentHandler next) {
    this.next = next;
  }

  public abstract void handlePayment(double amount);
}
