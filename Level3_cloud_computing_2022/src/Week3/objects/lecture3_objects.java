package Week3.objects;

import java.util.Random;
import java.util.Scanner;
        
public class lecture3_objects 
{
   public static void main(String[] args)
   {
     Random random=new Random();
    Scanner kb=new Scanner(System.in);
    String name=new String("James");
    String name2= "herlen Martin";
    Person p1=new Person();
    Person p2=new Person();
    Person p3=new Person();
    int number=2;
    p1.setName("Helen");
    p2.setName("Jhon");
    p3.setName("Charlie");
    p1.setAge(30);
    p2.setAge(40);
    p3.setAge(16);
    p1.setGender('F');
    p1.showInf();
    String city=new String("Manchester");
    for(int index=0;index<city.length();index++)
    {
        System.out.println("index:"
                +index+" "+city.charAt(index));
        
       
    }
    
}
