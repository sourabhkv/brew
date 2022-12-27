class Adder{
	static int  add(int a, int b){return a+b;}
	static double add(double a, double b){return a+b;}
}
public class MethodOverloading3{
	public static void main(String[] args){
		System.out.println(Adder.add(12,12));
		System.out.println(Adder.add(12.1,12.1));
	}
}