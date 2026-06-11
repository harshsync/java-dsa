import java.util.*;
public class B_Two_gram
{
    public static String twogram(String s)
    {
        HashMap<String,Integer> map = new HashMap<>();
        int i = 0,j = 1;
        
        while(j<s.length())
        {
            String str = "" + s.charAt(i) + s.charAt(j);
            i++;
            j++;
            if(!map.containsKey(str))
            {
                map.put(str,1);
            }
            else
            {
                map.put(str,map.getOrDefault(str,0)+1);
            }
        }
        String str2 = "";
        int max = 0;
        for(Map.Entry<String,Integer> ele : map.entrySet())
        {
            
            if(ele.getValue() > max)
            {
                max = ele.getValue();
                str2 = ele.getKey();
            }
        }
        return str2;
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        ob.nextInt();
        String s = ob.next();
        System.out.println(twogram(s));    
    }
}