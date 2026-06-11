import java.util.*;

public class APetrAndBook
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);

        int pages = ob.nextInt();

        int arr[] = new int[7];

        for(int i = 0; i < 7; i++)
        {
            arr[i] = ob.nextInt();
        }

        int day = 0;

        while(true)
        {
            pages -= arr[day];

            if(pages <= 0)
            {
                System.out.println(day + 1);
                break;
            }

            day = (day + 1) % 7;
        }
    }
}