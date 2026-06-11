import java.util.*;
public class BKeyboardLayouts
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        String str1 = ob.nextLine();
        String str2 = ob.nextLine();
        String text = ob.nextLine();
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0; i < 26; i++)
        {
            char ch1 = str1.charAt(i); 
            char ch2 = str2.charAt(i); 
            map.put(ch1,ch2);
        } 
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            if(Character.isUpperCase(ch))
            {
                char ch1 = map.get(Character.toLowerCase(ch));
                sb.append(Character.toUpperCase(ch1));
            }
            else if(Character.isLowerCase(ch))
            {
                sb.append(map.get(ch));
            }
            else
            {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}