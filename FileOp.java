import java.util.*;
import java.util.Scanner;
import java.io.*;
public class FileOp{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String fn="hello";
    File f=new File(fn);
    try{
    if(f.createNewFile())
    {
        System.out.println(f.getAbsolutePath());
    }
    else{
        System.out.println("exists");
    }
}
catch(IOException e){
    System.out.println(e.getMessage());
}
Scanner scan=new Scanner(fn);
while(scan.hasNextLine()){
    System.out.println(scan.nextLine());
}
try{FileWriter fw=new FileWriter(f);
fw.write("Hi this is Ryan");
fw.close();
}
catch(IOException e){
    e.getMessage();
}
try{
    FileWriter fa=new FileWriter(f,true);
    fa.write("how are you");
    fa.close();
}
catch(IOException e){
    e.getMessage();
}
    }
}
