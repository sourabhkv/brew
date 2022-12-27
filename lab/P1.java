package com.sourabhkv.test;
import java.lang.Math;
import java.util.Scanner;
public class P1{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("enter a:");
		double a = inp.nextDouble();
		System.out.print("enter b:");
		double b = inp.nextDouble();
		System.out.print("enter c:");
		double c = inp.nextDouble();
		if (a==0 && b==0) 
		{
			System.out.println("Cannot find value of x");
			System.exit(0);
		}
		else if (b!=0 && a==0) 
		{
			System.out.println("Linear equation");
			double root1 = -c/b;
			System.out.printf("The root = %.2f\n",root1);
		}
		else 
		{
			double d = b*b-4*a*c;
			double disc = Math.sqrt(Math.abs(d));
			System.out.print(disc);
			if (d==0) 
			{
				System.out.println("both roots are real and equal");
				double root1 = -b/(2*a);
				System.out.printf("root1 = %.2f\n",root1);
				System.out.printf("root2 = %.2f\n",root1);
			}
			else if (d>0) 
			{
				System.out.printf("Roots are real and unequal\n");
				double root1 = (-b-disc)/(2*a);
				double root2 = (-b+disc)/(2*a);
				System.out.printf("root1 = %.2f\n", root1);
				System.out.printf("root2 = %.2f\n", root2);
			}
			else 
			{
				System.out.println("roots are imaginary and conjugate");
				double img,real;
				real = -b/(2*a);
				img = disc/(2*a);
				System.out.printf("root1 = %.2f + %.2f i\n", real,img);
				System.out.printf("root1 = %.2f - %.2f i\n", real,img);
			}
		}
		inp.close();
	}
}
