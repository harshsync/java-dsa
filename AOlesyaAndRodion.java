import java.util.*;
public class AOlesyaAndRodion
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int t = ob.nextInt();
        String s = Integer.toString(t);
        int constrain;
        if(t < 10)
        {
            constrain = n - 1;
        }
        else
        {
            constrain = n - 2;
        }
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < constrain; i++)
        {
            sb.append("0");
        }
        if(n == 1 && t == 10)
        {
            sb = new StringBuilder("-1");
        }
        System.out.println(sb);
    }
}