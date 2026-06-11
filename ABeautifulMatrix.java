import java.util.*;
public class ABeautifulMatrix
{
    public static int ABeautifulMatrix(int x, int j)
    {
        return (Math.abs((2- x)))+(Math.abs(2-j));
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int x = 0,y = 0;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                int n = ob.nextInt();
                if(n == 1)
                {
                    x = i; 
                    y = j;
                }
            }
        }
        System.out.println(ABeautifulMatrix(x, y));
    }
}