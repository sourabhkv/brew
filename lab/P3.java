package com.sourabhkv.test;

import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner con =new Scanner(System.in);
		System.out.print("enter number : ");
		int n = con.nextInt();
		if (n==1 || n==0) {
			System.out.printf("%d is not prime\n",n);
			System.exit(0);
		}
		else {
			int flag=0;
			for (int i=2; i<n ; i++) {
				if (n%i==0) {
					flag=1;
					System.out.println(n+" is not prime");
					break;
				}
			}
			if (flag==0) {
				System.out.println(n+" is prime");
			}
		}
		con.close();
	}
}
