import java.util.*;
public class ABeautifulYear
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int y = ob.nextInt();

        while (true) {
            y++;

            String s = String.valueOf(y);

            if (s.charAt(0) != s.charAt(1) &&
                s.charAt(0) != s.charAt(2) &&
                s.charAt(0) != s.charAt(3) &&
                s.charAt(1) != s.charAt(2) &&
                s.charAt(1) != s.charAt(3) &&
                s.charAt(2) != s.charAt(3)) {

                System.out.println(y);
                break;
            }
        }
    }
}