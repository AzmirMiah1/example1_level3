
package Week8_StringBuffer;

public class Lecture8_StringBuffer 
{
    
    public static void methodnoreturn()
    {
        System.out.println("this ios an example of no return method");
        
    }
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static double multiplication(double a,int b, int c)
    {
        double total=a*b*c;
        return total;
    }
    
   public static String pad(String base,int n, char c)
   {
       while(base.length()<n)
       {
           base=base+c;
       } 
       
       return base;
   }
   public static int timesCharOccurs(String base,char n)
   {
       int time=0;
       for(int i=0;i<base.length();i++)
       {
           if(base.charAt(i)==n)
           {
               time=time+1;
           }
       }
       return time;
       
   }
   public static void main(String[] args)
    
    {
    ///  reference type
        String name= "Azmir Miah";
        String name2=new String("Helen Martin");
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name +" and " + name2+ " are lecturers");
        name.charAt(5);
        System.out.print("lenght "+ name.length());
        
        int total=sum(90,40);
        System.out.println("total="+total);
        
        double total2=multiplication(2.5,4,6);
        System.out.println("total2="+total2);
        
        String example=pad(name,20,'x');
        System.out.println("example "+ example);
        System.out.println(timesCharOccurs("abcaabcaaaade",'a'));
        
        System.out.println("++++++StringBuffers*****");
        StringBuffer name3=new StringBuffer("Trafford Collage");
        System.out.println(name3);
        System.out.println("name3 length="+ name3.length());
        name3.append(" campus Stockport");
        System.out.println(name3);
        System.out.println("name  length=");
        
    }
    
}
        
        
        
    
