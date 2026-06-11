import java.util.*;
public class ADislikeOfThrees
{
    public static int kth(int k)
    {
        int i = 1;
        while(k > 0)
        {
            if(i % 3 == 0 || i % 10 == 3)
            {
                i++;
                continue;
            }
            i++;
            k--;
        }
        return i-1;
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int k = ob.nextInt();
            System.out.println(kth(k));
        }
    }
}