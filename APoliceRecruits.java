import java.util.*;
public class APoliceRecruits
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int s = 0, c = 0;
        for(int i = 0; i < n; i++)
        {
            int a = ob.nextInt();
            if(a == -1)
            {
                if(s == 0)
                {
                    c++;
                }
                else
                {
                    s--;
                }

            }
            else
            {
                s += a;
            }
        } 
        System.out.println(c);   
    }
}
