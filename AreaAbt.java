import java.util.*;
import java.io.*;
import java.util.Scanner;
abstract class Shape{
    abstract public void Print();
}
class Rect extends Shape{
    public void Print(){
        int a=2;
        int b=2;
        System.out.println(a*b);
    }
}
class tri extends Shape{
    public void Print(){
        int a=2;
        int b=2;
        System.out.println(0.5*2*2);
    }
}
public class AreaAbt {
    public static void main(String[] args) {
        Shape s;
        s=new Rect();
        s.Print();
        s=new tri();
        s.Print();
        
    }
}
