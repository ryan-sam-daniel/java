import java.util.*;
interface Shape{
    void print(int a ,int b);
}
class rect implements Shape{
    public void print(int a, int b){
        System.out.println(a*b);
    }
}
public class ShapeInt {
    public static void main(String[] args) {
        Shape s=new rect();
        s.print(2, 2);
    }
}
