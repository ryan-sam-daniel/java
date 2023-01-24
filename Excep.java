import java.util.*;
class AgeException extends Exception{
    public AgeException(String str){
        super(str);
    }    
}

public class Excep{
    public static void main(String[] args) {
        try {
            int a=1,b=0;
            int res=a/b;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        try{
            int age=14;
            if(age<18){
                throw new AgeException("not elligoble");
            }
            else
            System.out.println("elligibel");
        }
        catch(AgeException e){
            System.out.println(e.getMessage());            
        }
    }
}