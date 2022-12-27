package com.sourabhkv.test;

import java.util.Scanner;
class Staff{
	String StaffID,Name,Phone,Salary;
	Scanner input =new Scanner(System.in);
	void read() {
		System.out.println("enter staffid:");
		StaffID = input.nextLine();
		System.out.println("enter Name:");
		Name = input.nextLine();
		System.out.println("enter Phone:");
		Phone = input.nextLine();
		System.out.println("enter salary:");
		Salary = input.nextLine();
	}
	
	void display() {
		System.out.printf("\n%-15s", "StaffID");
		System.out.printf("%-15s", StaffID);
		System.out.printf("\n%-15s", "Name");
		System.out.printf("%-15s", Name);
		System.out.printf("\n%-15s", "Phone");
		System.out.printf("%-15s", Phone);
		System.out.printf("\n%-15s", "Salary");
		System.out.printf("%-15s", Salary);
	}
}

class Teaching extends Staff{
	String Domain,Publication;
	void read_teaching() {
		super.read();
		System.out.println("enter domain");
		Domain = input.nextLine();
		System.out.println("enter publication");
		Publication =input.nextLine();
	}
	
	void display() {
		super.display();
		System.out.printf("\n%-15s","Domain");
		System.out.printf("%-15s",Domain);
		System.out.printf("\n%-15s","Publications");
		System.out.printf("%-15s",Publication);
	}
}

class Technical extends Staff{
	String Skills;
	void read_Technical() {
		super.read();
		System.out.println("enter skills");
		Skills = input.nextLine();
	}
	
	void display() {
		super.display();
		System.out.printf("\n%-15s","Skills");
		System.out.printf("%-15s", Skills);
	}
}

class Contract extends Staff{
	String Period;
	void read_Contract() {
		super.read();
		System.out.println("enter period");
		Period = input.nextLine();
	}
	
	void display() {
		super.display();
		System.out.printf("\n%-15s","Period");
		System.out.printf("%-15s", Period);
	}
}

public class StaffDetails {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter no. of staff details");
		int n =input.nextInt();
		Teaching steach[] = new Teaching[n];
		Technical stech[] = new Technical[n];
		Contract scon[]  = new Contract[n];
		for (int i=0 ; i<n ;i++) {
			System.out.println("enter teaching staff details:");
			steach[i] = new Teaching();
			steach[i].read_teaching();
		}
		
		for (int i=0 ; i<n ;i++) {
			System.out.println("enter teaching staff details:");
			stech[i] = new Technical();
			stech[i].read_Technical();
		}
		
		for (int i=0 ; i<n ;i++) {
			System.out.println("enter teaching staff details:");
			scon[i] = new Contract();
			scon[i].read_Contract();
		}
		
		System.out.println("\nStaff details\n");
		System.out.println("-------Teaching staff details--------");
		for (int i=0; i<n ;i++)
			steach[i].display();
		System.out.println();
		System.out.println("-------Technical staff details--------");
		for (int i=0; i<n ;i++)
			stech[i].display();
		System.out.println();
		System.out.println("-------Contract staff details--------");
		for(int i=0; i<n ;i++)
			scon[i].display();
		System.out.println();
		input.close();
	}
}
