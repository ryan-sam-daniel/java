import java.util.*;
import java.util.Scanner;
public class Queue{
    int []a=new int[50];
    int front=-1,rear=-1;
    void enq(int data){
        if(front==-1 && rear==-1){
            front=0;rear=0;
            a[rear]=data;}
        else{
            rear=rear+1;
            a[rear]=data;
        }

    }
    void deq(){
        if(front==0 && rear==0)
        {
            System.out.println(a[rear]);
            front=-1;
            rear=-1;
        }
        else{
            System.out.println(a[front]);
            front=front+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue s=new Queue();
        int ch=0;
        while(ch!=4){
        System.out.println("Choice\n1.Enqueue\n2.Dequeue\n");
        ch=sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter data");
                int data=sc.nextInt();
                s.enq(data);
                break;
                case 2:
                s.deq();
                break;
                default:
                break;
            }
        }
    }
}