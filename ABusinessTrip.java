import java.util.*;
public class ABusinessTrip
{
   public static void main(String[] args)
   {
        Scanner ob = new Scanner(System.in);
        int k = ob.nextInt();
        int s = 0, c = 0;
        int arr[] = new int[12];
        for(int i = 0; i < 12; i++)
        {
            arr[i]= ob.nextInt();

        }
        Arrays.sort(arr);
        for(int i = 11; i >= 0; i--)
        {
            s += arr[i];
            if(s >= k)
            {
                break;
            }
            c++;
        }
        if(k == 0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(s >= k ?c+1 : -1);
        }

   } 
}