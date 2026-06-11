import java.util.*;

public class AInsertDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            String s = sc.next();

            boolean found = false;
            StringBuilder sb = new StringBuilder(s);

            for (int i = 0; i < n; i++) {
                if (sb.charAt(i) - '0' < d) {
                    sb.insert(i, (char) (d + '0'));
                    found = true;
                    break;
                }
            }

            if (!found) {
                sb.append((char) (d + '0'));
            }

            System.out.println(sb);
        }

        sc.close();
    }
}