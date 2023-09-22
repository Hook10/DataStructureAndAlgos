package org.hook.patterns.chainofresponsibility.practice;

import org.hook.patterns.chainofresponsibility.practice.PaymentHandler;

public class PayPalPaymentHandler extends PaymentHandler {
  @Override
  public void handlePayment(double amount) {
    if (amount <= 1500) {
      System.out.println("Paid using PayPal: $" + amount);
    } else {
      next.handlePayment(amount);
    }
  }
}
