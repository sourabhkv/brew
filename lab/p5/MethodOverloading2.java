public class MethodOverloading2{
	private static void display(int a){
		System.out.println(a+" Args");
	}
	private static void display(int a, int b){
		System.out.println(a+" "+b+" Args");
	}
	public static void main(String[] args){
		display(1);
		display(1,2);
	}
}