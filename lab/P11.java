import java.util.*;
import java.io.*;

class Filedemo{
	public static void p(String s){
		System.out.println(s);
	}
	public static void analyze(String s){
		p("file is");
		File f = new File(s);
		if (f.exists()){
			p("file name is "+f.getName());
			p(f.canRead()?" file can read":" file cannot read");
			p(f.canWrite()?" file can write":" file cannot write");
			p("length of the file = "+f.length()+" bytes");
			p("last accessed time = "+f.lastModified());
		}
		else{
			p("File not found");
		}
		if (f.isDirectory()){
			p("is directory");
			String dir[] = f.list();
			for (int i=0 ; i<dir.length ;i++){
				p(dir[i]);
			}
		}
	}
}

class Filedetails{
	public static void main(String rr[])throws IOException{
		Scanner sc = new Scanner(System.in);
		Filedemo fd  = new Filedemo();
		System.out.println("enter file name: ");
		String name = sc.next();
		fd.analyze(name);
	}
}