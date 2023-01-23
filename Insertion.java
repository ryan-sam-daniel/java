import java.util.Scanner;
import java.util.*;
public class Insertion {
    public static void main(String[] args) {
        int i=0;
        Scanner sc=new Scanner(System.in);
        int[] a=new int[50];
        for(i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        for(i=1;i<5;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=key;
        }
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
