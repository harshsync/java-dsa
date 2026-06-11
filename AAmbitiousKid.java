import java.util.Scanner;
public class AAmbitiousKid
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int min = Integer.MAX_VALUE; 
        for(int i = 0; i < n; i++)
        {
            int a = ob.nextInt();
            min = Math.min(min, Math.abs(a - 0));
        } 
        System.out.println(min);  
    }
}