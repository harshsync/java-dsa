import java.util.*;
public class B_Array
{
    public static void arrindx(int arr[])
    {
        int ans[] = new int[arr.length];
        int c = 0;
        int g,s;
        for(int i = 0; i < arr.length-1; i++)
        {
            c = 0;
            g = 0;
            s = 0;
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    s++;
                }
                else if(arr[i] < arr[j])
                {
                    g++;
                }
            }
            c = Math.max(g,s);
            ans[i] = c;
        }
        for(int i = 0; i < ans.length; i++)
        {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n = ob.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = ob.nextInt();
            }

            arrindx(arr);
        }    
    }
}