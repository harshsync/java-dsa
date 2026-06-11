import java.util.*;
public class BNotQuiteLatinSquare
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        ob.nextLine();
        while(t-- > 0)
        {
            for(int i = 0; i < 3; i++)
            {
                int sum = 65+66+67;
                String s = ob.nextLine();
                for(char ch : s.toCharArray())
                {
                    if(ch >= 65 && ch <= 67)
                    sum -= (int)ch;
                    
                }
                if(sum != 0)
                {
                    System.out.println((char)sum);
                }
            }
        }    
    }
}