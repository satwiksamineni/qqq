import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//2) Create a program to get the hashmap from the given input string array where the key for the hashmap
//
// is first three letters of array element in uppercase and the value of hashmap is the element itself
//
// Input:{“goa”,”kerala”,”gujarat”} [string array]
//
// Output:{{GOA,goa},{KER,kerala},{GUJ,Gujarat}} [hashmap]
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int size=scan.nextInt();
		String[] sa = new String[size];
//String[] sa={"goa","kerala","Gujarat"};
		for(int i=0;i<size;i++){
			sa[i]=scan.next();
		}
Map<String, String>hm=new HashMap<String,String>();
for (String string : sa) {
	hm.put(string.substring(0,3).toUpperCase(), string);
}
for (Entry<String, String> string1 : hm.entrySet()) {
	System.out.println(string1);
}
	}

}
