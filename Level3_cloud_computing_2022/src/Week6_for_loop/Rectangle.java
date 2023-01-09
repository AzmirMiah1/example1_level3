
package Week6_for_loop;


public class Rectangle {
    public static void main (String [] args)
    {
        int Rows=6;
        int Columns=4;
        
        int x,y;
        for (x=0; x < Rows;x++)
        {
            for (y=0; y < Columns; y++)
            {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
        
}
