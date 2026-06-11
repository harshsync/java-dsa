import java.util.*;
public class BCardGame
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
           
            int a1 = ob.nextInt();   
            int a2 = ob.nextInt(); 
            int b1 = ob.nextInt();  
            int b2 = ob.nextInt();  
            int ans = 0;
            
           if ((a1 > b1 ? 1 : 0) + (a2 > b2 ? 1 : 0) >
    (a1 < b1 ? 1 : 0) + (a2 < b2 ? 1 : 0))
    ans++;


            if ((a1 > b2 ? 1 : 0) + (a2 > b1 ? 1 : 0) >
                (a1 < b2 ? 1 : 0) + (a2 < b1 ? 1 : 0))
                ans++;


            if ((a2 > b1 ? 1 : 0) + (a1 > b2 ? 1 : 0) >
                (a2 < b1 ? 1 : 0) + (a1 < b2 ? 1 : 0))
                ans++;


            if ((a2 > b2 ? 1 : 0) + (a1 > b1 ? 1 : 0) >
                (a2 < b2 ? 1 : 0) + (a1 < b1 ? 1 : 0))
                ans++;

            System.out.println(ans);
        }
    }
}