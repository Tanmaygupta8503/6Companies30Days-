package microsoft;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BullsAndCows$299 {
	public static String getHint(String secret, String guess) {
	    Map<Character,Integer> map1 =new HashMap<>();
	    Map<Character,Integer> map2 =new HashMap<>();
	    int correctposn=0;
	    for(char c:secret.toCharArray())
	    {
	        map1.put(c,map1.getOrDefault(c,0)+1);
	    }
	    for(char c:guess.toCharArray())
	    {
	        map2.put(c,map2.getOrDefault(c,0)+1);
	    }
	    Set<Character> set = map1.keySet();
	    int sum = 0;
	    for(char c:set)
	    {
	        if(map1.containsKey(c) && map2.containsKey(c))
	        {
	            sum+=Math.min(map1.get(c),map2.get(c));
	        }
	    }
	    for(int i=0;i<guess.length();i++)
	    {
	        if(secret.charAt(i) == guess.charAt(i))
	        correctposn++;
	    }
	    return correctposn + "A" + (sum-correctposn)+"B"; 
	}
	public static void main(String[] args) {
		String secret = "7180";
		String guess = "1870";
		System.out.println(BullsAndCows$299.getHint(secret, guess));
	}
}
