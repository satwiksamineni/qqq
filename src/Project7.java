//11) input="hello"
//
// output="hlo"; Alternative positions...
public class Project7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello";
char[] ch=s.toCharArray();
StringBuffer sb= new StringBuffer();
for(int i=0;i<ch.length;i++){
	sb.append(ch[i]);
	i=i+1;
}
		System.out.println(sb);
	}

}
