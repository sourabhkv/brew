class MethodOverloading4{
	private static void display(int a){
		System.out.println(a);
	}
	
	private static void display(String a){
		System.out.println(a);
	}
	
	public static void main(String[] args){
		display(1);
		display("dfs");
	}
}