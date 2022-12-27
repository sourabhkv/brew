public class Student{
	int id;
	String Name;
	Student(){
		System.out.println("this is default constructor");
	}
	
	Student(int i, String n){
		id = i;
		Name = n;
		System.out.println("parameterized");
	}
	
	public static void main(String[] args){
		Student s = new Student();
		Student t = new Student(1,"hello");
		System.out.println(t.id+t.Name);
	}
}
