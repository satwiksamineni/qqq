import java.util.Scanner;

//String[] input1=["Vikas","Lokesh",Ashok]
//
// expected output String: "Vikas,Lokesh,Ashok"
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
StringBuffer sb=new StringBuffer();
int size=scan.nextInt();
String[] s1=new String[size];
for(int i=0;i<size;i++)
{
	s1[i]=scan.next();
}
for (String string : s1) {
	System.out.println(string);
}
for (String string : s1) {
	if(sb.length()!=0){
		sb.append(",");
	}
		sb.append(string);
}
		System.out.println(sb);
	}

}
