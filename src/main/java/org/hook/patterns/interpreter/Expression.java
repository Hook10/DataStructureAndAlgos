package org.hook.patterns.interpreter;

public interface Expression {
  boolean interpret(String context);
}
