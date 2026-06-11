import java.util.Scanner;
public class BOsuMania
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            int n = ob.nextInt();
            ob.nextLine();
            int arr[] = new int[n];
            int j = n - 1;
            for(int i = 0; i < n; i++)
            {
                String s = ob.nextLine();
                for(int k = 0; k < 4; k++)
                {
                    char ch = s.charAt(k);
                    if(ch == '#')
                    {
                        arr[j--] = k+1;
                    }
                }
            } 
            for(int x : arr)
            {
                System.out.print(x + " ");
            }
            System.out.println(); 
        }  
    }
}