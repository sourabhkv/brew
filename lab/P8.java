import java.io.*;
import java.util.*;
interface Resume{
    void biodata(String n, String o , double e, String a);
}

class Teacher implements Resume{
    String Name;
    String Qual;
    double exp;
    String ach;
    public void biodata(String n, String o, double e, String a){
        Name = n;
        Qual = o;
        exp = e;
        ach = a;
    }

    public void printresume(){
        System.out.println("Name : "+Name+"Qualification : "+qual+"Experience : "+exp+" Achievement : "+ach);
    }
}

class Student implements Resume{
    String Name;
    String branch;
    double res;
    String std;
    public void biodata(String n, String o, double e, String a){
        Name = n;
        std = o;
        res = e;
        branch = a;
    }
    public void printresume(){
        System.out.println("Name : "+Name+"std : "+qual+"res : "+res+" Achievement : "+ach);
    }
}

class program7{
    public static void main(String[] args){
        Teacher t =new Teacher();
        T.biodata("RAJ","phd",28.4,"BEST teacher");
        System.out.println("Teacher biodata");
        T.printresume();

        Student s = new Student();
        S.biodata("rahul","first year",96.6,"CSE");
        System.out.println("student biodata");
        S.printresume();
    }
}