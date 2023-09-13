package task1;

import java.util.Scanner;

public class {
	public static void main(String[] args) {
		 Scanner s1=new Scanner(System.in);
		 System.out.println("enter the marks obtained in physics:");
		 int physics=s1.nextInt();
		 
		 System.out.println("enter marks obtained in chemistry:");
		 int chemistry=s1.nextInt();
		 
		 System.out.println("enter  marks obtained in mathematics:");
		 int math=s1.nextInt();
		 
		 System.out.println("enter marks obtained in science:");
		 int science=s1.nextInt();
		 
		 int totalmarks=physics+chemistry+math+science;
		 float percentage=totalmarks/4;
		 
		 System.out.println(" total marks obtained are: "   + totalmarks);
		 System.out.println("percentage obtained is: "      +percentage);
		 
		 
		 if(percentage>=91&& percentage<=100) {
			 System.out.println("grade-A");
			 
		 }
		 if(percentage>=81&&percentage<=90) {
			 System.out.println("grade-B");
			 		
		 }
		 if(percentage>=71&&percentage<=80) {
			 System.out.println("grade-C");
			 
		 }
		 if(percentage>=61&&percentage<=70) {
			 System.out.println("grade-D");
		 }
		 if(percentage>=51&&percentage<=60)  {
			 System.out.println("grade-E");
		 }
		 else if(percentage<=60){
			 System.out.println("fail");
		 }
		 
		}
}
[6:27 PM, 9/13/2023] Sonu Verma: package com.springcore.Dsa;
import java.util.Scanner;
import java.util.Random;

public class Numberguess {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Random rand = new Random();
		int numberoftries = 0;
		int randomnumber = rand.nextInt(100) + 1;

		System.out.println("enter your guess:");
		int playerguessingnumber = s1.nextInt();
		numberoftries++;

		if (playerguessingnumber == randomnumber) {
			System.out.println("correct option choose");

		} else if (randomnumber > playerguessingnumber) {
			System.out.println("nop the number is higher");

		} else {
			System.out.println("nop the numer is lower");

		}
	}
}