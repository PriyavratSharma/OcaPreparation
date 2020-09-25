package com.day1;

 
public class Question5 {
 
int num1 = 3;
static int num2 = 5;
 
Question5(int num1, int num2) {
 
   if (num2 < 30) {
    this.num2 = num2;
   }
     num1 = num1;
}
 
  public static void main(String args[]) {
 
         Question5 s1 = new Question5(9, 10);
         Question5 s2 = new Question5(12, 22);
 
         System.out.println(s1.num1 + " " + s1.num2 + " " + s2.num1 + " "+ s2.num2);
 
  }
}
