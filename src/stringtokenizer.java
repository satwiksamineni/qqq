import java.util.StringTokenizer;

//count the number of words in the string
//
// Input string="i work in cognizant.";
//
// output=4;
public class stringtokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String string1="i work in cognizant.";
int count=0;

	StringTokenizer st=new StringTokenizer(string1, " ");
	while (st.hasMoreTokens()){
		st.nextToken();
		count++;
	}
	System.out.println(count);
	
	}
}
