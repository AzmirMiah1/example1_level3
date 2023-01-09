
package week4_condition.java;


public class Factorial 
{
 public static void main (string[] args)   
 {
     Scanner kb=new Scanner(System.in);
     System.out.println("Enter your factorial  number");
     int n=kb.nextint();
     int n=5;
     int m=1;
     int f=1;
     while(m<=n)
     {
         f=f*m;
         System.out.println("f: "+ f);
         m++;
         }
 }
 
 }
