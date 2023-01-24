import java.util.*;
import java.util.Scanner;
public class Stack {
    int []a=new int [50];
    int top=-1;
    void push(int data){
        a[++top]=data;
    }
    void pop(){
        System.out.println(a[top--]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        int ch=0;
        while(ch!=4){
        System.out.println("Choice\n1.Push\n2.Pop\n");
        ch=sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter data");
                int data=sc.nextInt();
                s.push(data);
                break;
                case 2:
                s.pop();
                break;
                default:
                break;
            }
        }
            
    }
}
