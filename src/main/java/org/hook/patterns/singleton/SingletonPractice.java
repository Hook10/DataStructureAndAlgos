package org.hook.patterns.singleton;

public class SingletonPractice {
 private static volatile SingletonPractice instance;
 private String data;

 private SingletonPractice (String data) {
   this.data = data;
 }

 public static SingletonPractice getInstance(String data) {
   SingletonPractice result = instance;
   if (result == null) {
     synchronized (SingletonPractice.class) {
       result = instance;
       if (result == null) {
         instance = result = new SingletonPractice(data);
       }
     }
   }
   return result;
 }
}
