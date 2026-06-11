import java.util.*;
public class BThe67Th67IntegerProblem
{
    public static int maxa(int arr[])
    {
        Arrays.sort(arr);
        int sum = 0;
        int i;
        for(i = 0; i < arr.length - 1; i++)
        {
            sum -= arr[i];
        }
        sum += arr[i];
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int arr[] = new int[7];
            for(int i = 0; i < 7; i++)
            {
                arr[i] = ob.nextInt();
            }
            System.out.println(maxa(arr));
        }
    }
}