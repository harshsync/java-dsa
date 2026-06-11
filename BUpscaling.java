import java.util.*;
public class BUpscaling
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n = ob.nextInt();
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    if((i+j) % 2 == 0)
                    {
                        System.out.print("##");
                    }
                    else
                    {
                        System.out.print("..");
                    }
                }

                System.out.println();

                for(int j = 0; j < n; j++)
                {
                    if((i+j) % 2 == 0)
                    {
                        System.out.print("##");
                    }
                    else
                    {
                        System.out.print("..");
                    }
                }

                System.out.println();
            }
        }    
    }
}