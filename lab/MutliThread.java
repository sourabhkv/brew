package com.sourabhkv.test;
import java.util.Random;
class Square extends Thread{
	int x;
	Square(int n){
		x=n;
	}
	public void run() {
		int sqr = x*x;
		System.out.println("Square of "+x+" = "+sqr);
	}
}

class Cube extends Thread{
	int x;
	Cube(int n){
		x=n;
	}
	public void run() {
		int cube = x*x*x;
		System.out.println("Cube of "+x+" = "+cube);
	}
}

class Number extends Thread{
	public void run() {
		Random random = new Random();
		for (int i=0 ;i<5 ;i++) {
			int randomint = random.nextInt(100);
			System.out.println("random number generated = "+randomint);
			Square s = new Square(randomint);
			s.start();
			Cube c =new Cube(randomint);
			c.start();
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}
}

public class MultiThread {
	public static void main(String[] args) {
		Number n = new Number();
		n.start();
	}
}
