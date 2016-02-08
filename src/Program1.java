import java.util.ArrayList;
import java.util.Scanner;

//1) Find the sum of the numbers in the given input string array
//
// Input{“2AA”,”12”,”ABC”,”c1a”)
//
// Output:6 (2+1+2+1)
//
// Note in the above array 12 must not considered as such
//
// i.e,it must be considered as 1,2
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a1 = new ArrayList<String>();
		
		while (sc.hasNext()) {
			//System.out.println(sc.next());
			String s=sc.next();
//			if (s.equals("quit")) {
//				break;
//			} else {
				//System.out.println("ELSE BLOCK");
				a1.add(s);
				//System.out.println("added successfully" + a1.get(0).toString());
//			}
		}
for (String string : a1) {
	System.out.println(string);
}
		for (String string : a1) {
			for (int i = 0; i < string.length(); i++) {
				char ch = string.substring(i, i + 1).charAt(0);
				if ((int) ch <= 57 && (int) ch >= 48) {
					count += Character.getNumericValue(ch);
				}
			}
		}
		System.out.println(count);
	}

}
