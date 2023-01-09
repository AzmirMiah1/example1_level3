
package week_7_while_loop;

import java.util.Random;

public class doWhileloop 
{
    public static void main (String[] args)
    {    
        Scanner kb=new Random();
        int guess=0;
        do{
            System.out.println(" I am thinking a number"
                    +" between 1 and 100");
            System.out.println("What do you think it is?");
                    guess=kb.nextint();
                    
        }while(guess!=number);
        
        System.out.println("Program finished");
    }   
}
