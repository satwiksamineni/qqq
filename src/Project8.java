
public class Project8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hello World";
	StringBuffer sb= new StringBuffer(s);
	//System.out.println(sb.charAt(sb.length()-1));
	sb.setCharAt(0, s.charAt(s.length()-1));
	//System.out.println(sb);
	//System.out.println(sb.charAt(sb.length()-1));
	//System.out.println(s.charAt(0));
	System.out.println(s.charAt(0));
	sb.setCharAt(s.length()-1, s.charAt(0));
	
	System.out.println(sb);
	}

}
