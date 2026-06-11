import java.util.*;

public class AWrongSubtraction
 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int n = ob.nextInt();
        int k = ob.nextInt();

        for (int i = 0; i < k; i++) {
            if (n % 10 == 0) {
                n = n / 10;
            } else {
                n = n - 1;
            }
        }

        System.out.println(n);
    }
}