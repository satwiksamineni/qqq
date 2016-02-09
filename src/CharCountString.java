//facebook
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//8) INPUT1= helloworld
//
// INPUT2= 2. delete the char,if rpted twice.
//
// if occurs more than twice,leave the first occurence and delete the duplicate
//
// O/P= helwrd;

public class CharCountString{
	public static void main(String[] args){
		String input1="helloworld";
Map<Character, Integer>m1=new LinkedHashMap<>();
char[] c1=input1.toCharArray();
for(int i=0;i<c1.length;i++){
if(m1.containsKey(c1[i])){
	m1.put(c1[i], m1.get(c1[i])+1);
}
else
	m1.put(c1[i],1);
	}
System.out.println(m1);
StringBuffer sb=new StringBuffer();
for ( Entry<Character, Integer> s : m1.entrySet()) {
	if(s.getValue()==2){
		
	}
	else
		sb.append(s.getKey());
}
System.out.println(sb);
	}
}
