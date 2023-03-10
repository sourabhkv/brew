import java.util.*;
import java.io.*;
public class arraylistexample
{
public static void main(String args[])throws IOException
{
ArrayList&lt;String&gt;obj = new ArrayList&lt;String&gt;();
Scanner sc=new Scanner(System.in);
int c,ch;
ch=1;
int i,j;
String str,str1;
do
{
System.out.println(&quot;STRING MANIPULATION&quot;);
System.out.println(&quot;******************************&quot;);
System.out.println(&quot; 1. Append at end \t 2.Insert at particular index \t 3.Search \t&quot;);
System.out.println( &quot;4.List string that starting with letter \t&quot;);
System.out.println(&quot;5.Size \t 6.Remove \t 7.Sort\t 8.Display\t&quot; );
System.out.println(&quot;Enter the choice &quot;);
c=sc.nextInt();
switch(c)
{
case 1:
{
System.out.println(&quot;Enter the string\n &quot;);
str=sc.next();
obj.add(str);
break;
}
case 2:
{
System.out.println(&quot;Enter the string\n &quot;);
str=sc.next();
System.out.println(&quot;\nSpecify the index/position to insert&quot;+&quot;starting with
1&quot;+&quot;and&quot;+&quot;ending with&quot;+(obj.size()+1));
i=sc.nextInt();
obj.add(i-1,str);
System.out.println(&quot;The array list has following elements:&quot;+obj);
break;
}

case 3:
{
System.out.println(&quot;Enter the string to search &quot;);
str=sc.next();
j=obj.indexOf(str);
if(j==-1)
System.out.println(&quot;Element not found&quot;);
else
System.out.println(&quot;Index of:&quot;+str+&quot;is&quot;+j);
break;
}
case 4:
{
System.out.println(&quot;Enter the character to List string that starts with specified
character&quot;);
str=sc.next();
System.out.println(&quot;searching for &quot;+str);
for(i=0;i&lt;(obj.size());i++)
{
str1=obj.get(i);
System.out.println(str1);
if(str1.startsWith(str))
{
System.out.println(str1+&quot;starts with&quot;+str);
}
}
break;
}
case 5:
{
System.out.println(&quot;Size of the list &quot;+obj.size());
break;
}
case 6:
{
System.out.println(&quot;Enter the element to remove&quot;);
str=sc.nextLine();
if(obj.remove(str))
{
System.out.println(&quot;Element Removed&quot;+str);
}
else
{
System.out.println(&quot;Element not present&quot;);
}

break;
}
case 7:
{
Collections.sort(obj);
System.out.println(&quot;The array list has following elements:&quot;+obj);
break;
}
case 8:
{
System.out.println(&quot;The array list has following elements:&quot;+obj);
break;
}
}
System.out.println(&quot;enter 0 to break and 1 to continue&quot;);
ch=sc.nextInt();
}while(ch==1);
}
}

System.out.println(&quot;Error:&quot;+e.getMessage());
System.out.println(&quot;Error:&quot;+e);
}
// here program ends.
System.out.println(&quot;End of Program...&quot;);
}
}
