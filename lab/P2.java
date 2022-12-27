package com.sourabhkv.test;
import java.util.Scanner;
class Student1{
	String USN,Name,Branch,Phone;
	Scanner con = new Scanner(System.in);
	void read() 
	{
		System.out.print("enter USN:");
		USN = con.nextLine();
		System.out.print("enter Name:");
		Name = con.nextLine();
		System.out.print("enter branch:");
		Branch = con.nextLine();
		System.out.print("enter phone:");
		Phone = con.nextLine();
	}
	
	void display() 
	{
		System.out.printf("%-20s %-20s %-20s %-20s", USN,Name,Branch,Phone);
	}
}

public class P2 {
	public static void main(String[] args) {
		Scanner con = new Scanner(System.in);
		System.out.print("enter no. of students");
		int number = con.nextInt();
		Student1 s[] = new Student1[number];
		for (int i=0 ; i<number ;i++) {
			s[i] = new Student1();
			s[i].read();
		}
		System.out.printf("%-20s %-20s %-20s %-20s\n","USN","Name","Branch","Phone");
		for (int i=0 ; i<number ;i++) {
			System.out.println();
			s[i].display();
		}
		con.close();
	}
}
