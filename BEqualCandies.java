import java.util.*;
public class BEqualCandies
{
    public static int eatencandies(int arr[])
    {
        Arrays.sort(arr);
        int min = arr[0], sum = 0;
        for(int i = 1; i < arr.length; i++)
        {
            sum += arr[i] - min;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n = ob.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < arr.length; i++)
            {
                arr[i] = ob.nextInt();
            }
            System.out.println(eatencandies(arr));
        }   
    }
}