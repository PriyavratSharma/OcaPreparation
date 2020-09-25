package com.day1;

public class Question4 {
	 
Question4 sd = new Question4();
void method1() {
   method4();  // 1
   Question4.method2(); // 2
  // StaticDemo.method3(); // 3  --> non static methods cannot be called directly by class name
 
}
 
  static void method2() {
 }
 
  void method3() {
   method1(); //4
   method2(); //5
   sd.method2(); //6
}
 
   static void method4() {
   }
}
