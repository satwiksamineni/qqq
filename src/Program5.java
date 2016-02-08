//Input1={“ABX”,”ac”,”acd”};
//
// Input2=3;
//
// Output1=X$d
public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] ss={"ABZfgs","acfe","acd","2342rwfsv"};
int ii=3;
StringBuffer sb=new StringBuffer();
for (String string : ss) {
	if(string.length()>=ii){
		if(sb.length()!=0){
			sb.append("$");
		}
		sb.append(string.substring(ii-1,ii));
	}
}
System.out.println(sb);
	}

}
