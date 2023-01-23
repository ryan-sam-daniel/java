import java.util.*;
import java.util.Scanner;
public class Binary {
    void swap(int []a,int x,int y)
    {
        int t=a[x];
        a[x]=a[y];
        a[y]=t;
    }
    int[] sort(int a[])
    {
        for(int i=0;i<5;i++){
            int min=i;
            for(int j=i;j<5;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
                swap(a,min,i);
            
        }
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        return a;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a=new int[10];
        int i;
        for(i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        Binary b=new Binary();
        a=b.sort(a);
        for(i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}   