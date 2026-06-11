import java.util.*;
public class AMediumNumber
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int arr[] = new int[3];
            for(int i = 0; i < 3; i++)
            {
                arr[i] = ob.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }    
    }
}