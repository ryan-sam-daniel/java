import java.util.*;
import java.util.Scanner;
public class sequential
{
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int [] a=new int [10];
        int i;
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched :");
        int ele=sc.nextInt();
        int flag=0;
        for(i=0;i<5;i++)
        {
        if(a[i]==ele)
        System.out.println(i);
        flag=1;
    }
    if(flag==0)
    System.out.println("Not foud");
    
}
}