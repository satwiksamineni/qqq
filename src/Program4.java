//fsdfsgsrs
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//6) I/P hashmap<String String>{"ram:hari","cisco:barfi","honeywell:cs","cts:hari"};
//
// i/p s2="hari";
//
//// o/p string[]={"ram","cts"};

public class Program4{
	public static void main(String[]args){
		Map<String,String>m1=new LinkedHashMap<>();
		List<String>l1=new ArrayList<>();
		m1.put("ram", "hari");
		m1.put("cisco", "barfi");
		m1.put("honeywell", "cs");
		m1.put("cts", "hari");
		String s="hari";
		
	for (Entry<String, String> string : m1.entrySet()) {
		System.out.println(string);
	}
		for (Entry<String, String> e1 : m1.entrySet()) {
			if(e1.getValue().equals(s)){
			//	System.out.println(e1.getKey().toString());
				l1.add(e1.getKey().toString());
				
			}
		}
		String[] ss = new String[l1.size()];
		int i=0;
		//Collections.reverse(l1);
		for (String string : l1) {
			ss[i]=string.toString();
			i++;
		}
		System.out.println(ss[1]);
	}
}
