import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class SelectionSort
{
static final int MAX = 10010;
static int[] a = new int[MAX];
public static void main(String[ ] args)
{
	Scanner input = new Scanner(System.in);
	System.out.print("Enter Max array size: ");
	int n = input.nextInt();
	Random random = new Random();
	//System.out.println("Enter the array elements: ");
	for (int i = 0; i < n; i++)
	//a[i] = input.nextInt(); // for keyboard entry
	a[i] = random.nextInt(1000); // generate
	//random numbers – uniform distribution;

	a = Arrays.copyOf(a, n); // keep only non zero elements
	//Selection(a,n);
			System.out.println("Input Array:");
	for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
			System.out.print("\n");
	// set start time
	long startTime = System.nanoTime( );
	Selection(a,n);
	long stopTime = System.nanoTime( );
	long elapsedTime = stopTime - startTime;
	/* System.out.println("\nSorted Array:");
	for (int i = 0; i < n; i++)
	System.out.print(a[i] + " ");
	System.out.println( ); */
	System.out.println("Time Complexity in ms for n=" + n + " is: " + (double)          elapsedTime / 1000000);
}
public static void Selection(int a[], int n)
{
		
int i=0;
		int minindex=i;
		int temp;
		for(i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[minindex])
				minindex=j;
			}
			if(minindex!=i)
			{
				temp=a[i];
				a[i]=a[minindex];
				a[minindex]=temp;
			}
		}
		System.out.println("Sorted array elements are: ");
		for(int t=0;t<n;t++)
		{
			System.out.print(a[t]+" ");
		}
		System.out.println("\n");
	}
}
