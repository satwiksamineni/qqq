import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

//17) input-- String input1="AAA/abb/CCC"
//
// char input2='/'
//
// output-- String[] output1;
//
// output1[]={"aaa","bba","ccc"};
public class stringtokenbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input1="AAA/abb/ccc";
		StringBuffer sb=new StringBuffer();
		StringTokenizer st=new StringTokenizer(input1, "/");
		List<String>l1=new LinkedList<>();
		while(st.hasMoreTokens()){
			sb.append(st.nextToken());
			sb.reverse();
			l1.add(sb.toString());
			sb.delete(0, sb.length());
		}
		
		String[] str = new String[l1.size()];
		int i=0;
		for (String string : l1) {
			str[i]=string.toLowerCase();
			i++;
		}
		for (String string : str) {
			System.out.println(string);
		}
	}

}
