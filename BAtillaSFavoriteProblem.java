import java.util.Scanner;
public class BAtillaSFavoriteProblem
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            int a = ob.nextInt();
            ob.nextLine();
            String s = ob.nextLine();
            int m = 0;
            for(char ch : s.toCharArray())
            {
                int chi = (char)ch - 96;
                m = Math.max(m, chi);
            }
            System.out.println(m);
        }    
    }
}