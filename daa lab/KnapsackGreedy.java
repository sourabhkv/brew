import java.util.Scanner;
class Kobject{
    float w,p,r;
}
public class KnapsackGreedy {
    static final int MAX =20;
    static int n;
    static float m;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of objects:");
        n  =scanner.nextInt();
        Kobject obj[] = new Kobject[n];
        for (int i=0 ; i<n ; i++)
            obj[i] = new Kobject();
        
        ReadObjects(obj);
        KnapSack(obj);
        scanner.close();
    }

    static void ReadObjects(Kobject obj[]){
        Kobject temp = new Kobject();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the max knapsack:");
        m =  sc.nextFloat();
        System.out.println("enter weights");
        for (int i=0 ;i<n ; i++)
            obj[i].w = sc.nextFloat();
        
        System.out.println("enter progits");
        for (int i=0 ; i<n ; i++)
            obj[i].p = sc.nextFloat();
        for (int i=0 ; i<n ;i++)
            obj[i].r = obj[i].p/obj[i].w;
        
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<n-i-1 ; j++){
                if (obj[j].r < obj[j+1].r){
                    temp = obj[j];
                    obj[j] = obj[j+1];
                    obj[j+1] = temp;
                }
            }
        }
        sc.close();
    }

    static void KnapSack(Kobject Kobj[]){
        float x[]  = new float[MAX];
        float totalprofit=0;
        int i;
        float u=0;
        for (i=0 ; i<n ;i++)
            x[i] = 0;
        
        for(i=0 ; i<n ; i++){
            if (Kobj[i].w > u)
                break;
            else{
                x[i] = 1;
                totalprofit+= Kobj[i].p;
                u = u - Kobj[i].w;
            }
        }
        if (i<n)
            x[i] = u/Kobj[i].w;
        
        totalprofit+= x[i]*Kobj[i].p;
        System.out.println("the soln vector is ");
        for (i=0 ; i<n ; i++){
            System.out.println(x[i]+" ");
        }
        System.out.println("the totalprofit= "+totalprofit);
    }
}
