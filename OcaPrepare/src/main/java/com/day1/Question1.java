package com.day1;

public class Question1 {
	int num1 = 6;
    static int num2 = 10;
    public static void main(String[] args) {
		Question1 ques1=new Question1();
		Question1 ques2=new Question1();
		ques1.num1=15;
		ques1.num2=17;
		ques2.num1=22;
		ques2.num2=28;
		System.out.println(ques1.num1 + " " + ques1.num2 + " " + ques2.num1 + " "+ ques2.num2);
		 
	}
}
