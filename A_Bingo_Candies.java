import java.security.KeyStore.Entry;
import java.util.*;
public class A_Bingo_Candies
{
    public static boolean candy(int mat[][])
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = mat.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j< n; j++)
            {
                map.put(mat[i][j],map.getOrDefault(mat[i][j],0)+1);
            }
        }
        int max = 0;
        for(Map.Entry<Integer,Integer> ele : map.entrySet())
        {
        
            max = Math.max(ele.getValue(), max);
        }
        if(max > n*(n-1))
        {
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n = ob.nextInt();
            int mat[][] = new int[n][n];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    mat[i][j] = ob.nextInt();
                }
            }
            System.out.println(candy(mat)?"YES":"NO");
        }
    }
}