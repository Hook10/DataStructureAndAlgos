package org.hook.patterns.proxy;

public class ATM implements Account{ // this is proxy to a bank account

  @Override
  public void withdraw() {
    // Access using actual object. You can also have checks on withdraw
    BankAccount bankAccount = new BankAccount();
    bankAccount.withdraw();
  }

  @Override
  public void getAccountNumber() {

  }
}
