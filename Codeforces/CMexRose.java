import java.util.*;
public class CMexRose
{

    public int occ(int arr[], int k)
    {
        Arrays.sort(arr);
        int kocc = 0;
        int not = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr)
        {
            set.add(x);
            if (x == k)
            {
                kocc++;    
            }
        }
       
        for(int i = 0; i < k; i++)
        {
            if(!set.contains(i))
            {
                not++;
            }
        }
        return Math.max(kocc,not);  
    }   
        

    public static void main(String[] args)
    {
        CMexRose obj = new CMexRose();
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n = ob.nextInt();
            int k = ob.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = ob.nextInt();
            }
            System.out.println(obj.occ(arr, k));
        }    
    }
}
