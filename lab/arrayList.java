package com.sourabhkv.test;
import java.util.*;
import java.io.*;
public class ArrayLists {
	
	public static void main(String args[])throws IOException
	{
		ArrayList<String>obj = new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int c,ch;
		ch=1;
		int i,j;
		String str,str1;
		do{
			System.out.println("STRING MANIPULATION");
			System.out.println("******************************");
			System.out.println(" 1. Append at end \t 2.Insert at particular index \t 3.Search \t");System.out.println( "4.List string that starting with letter \t");
			System.out.println("5.Size \t 6.Remove \t 7.Sort\t 8.Display\t" );
			System.out.println("Enter the choice ");
			c=sc.nextInt();
			switch(c)
			{
			case 1:{
				System.out.println("Enter the string\n ");
				str=sc.next();
				obj.add(str);
				break;
			}
			case 2:{
				System.out.println("Enter the string\n ");
				str=sc.next();
				System.out.println("\nSpecify the index/position to insert"+"starting with 1"+"and"+"ending with"+(obj.size()+1));
				i=sc.nextInt();
				obj.add(i-1,str);
				System.out.println("The array list has following elements:"+obj);
				break;
			}
			case 3:{
				System.out.println("Enter the string to search ");
				str=sc.next();
				j=obj.indexOf(str);
				if(j==-1)
					System.out.println("Element not found");
				else
					System.out.println("Index of:"+str+"is"+j);
				break;
			}
			case 4:{
				System.out.println("Enter the character to List string that starts with specified character");
				str=sc.next();
				System.out.println("searching for "+str);
				for(i=0;i<(obj.size());i++){
					str1=obj.get(i);
					System.out.println(str1);
					if(str1.startsWith(str)){
						System.out.println(str1+"starts with"+str);
					}
				}
				break;
			}
			case 5:{
				System.out.println("Size of the list "+obj.size());
				break;
			}
			case 6:{
				System.out.println("Enter the element to remove");
				str=sc.nextLine();
				if(obj.remove(str)){
					System.out.println("Element Removed"+str);
				}
				else{
					System.out.println("Element not present");
				}
				break;
			}
			case 7:{
				Collections.sort(obj);
				System.out.println("The array list has following elements:"+obj);
				break;
			}
			case 8:{
				System.out.println("The array list has following elements:"+obj);
				break;
			}
		}
		System.out.println("enter 0 to break and 1 to continue");
		ch=sc.nextInt();
		}while(ch==1);
	}
}