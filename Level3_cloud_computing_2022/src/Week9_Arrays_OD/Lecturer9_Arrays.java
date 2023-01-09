
package Week9_Arrays_OD;


public class Lecturer9_Arrays 
{
public static void main(String[] args)    
{
    int numbers[]=new int [5];
    numbers[0]=20;
    numbers[1]-2;
    numbers[2]=100;
    numbers[3]=1;
    numbers[4]-30;
    numbers[7]=400;
    System.out.println("length= "+ numbers.length);
    System.out.print("index 2"+ numbers[2]);
    numbers[0]-numbers[1]+numbers[4];
    System.out.println("index 0 "+ numbers[0]);
    
    String names[]={"Leo","azmir","john","ichigo","goku","luffy"};
    System.out.println("length="+names.length);
    names[0]=names[0]+" is a lecturer";
    System.out.println(names[0]);
    for(int i=0;i<names.length;i++)
    {
        System.out.println("index:"+i+ " name:"+names[i]);
        if(names[i].equalsIgnoreCase("john"))
        {
            System.out.println(names[i]+" is a good student");
        }
    }
    for (String name:names)
    {
        System.out.println(name);
    }
    int myGrades[]=new int  [6];
    Scanner kb=new Scanner(System.in);
    for(int i=0;i<myGrades.length;i++)
    {
        System.out.println("Grade"+ i+" :"+ myGrade[i]);
    }
}
}
