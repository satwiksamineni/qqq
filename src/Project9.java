//16) int[] input={2,1,4,1,2,3,6};
//
// check whether the input has the sequence of "1,2,3". if so-
//
// output=true;
//
// int[] input={1,2,1,3,4,5,8};
//
// output=false
public class Project9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input={2,1,4,1,2,3,6};
	   StringBuffer sb=new StringBuffer();
		for (int i : input) {
			sb.append(Integer.toString(i));
		}
	String ss=sb.toString();
	if(ss.matches("(.*)123(.*)")){
		System.out.println("true");
	}
	else
		System.out.println("False");
	}
	

}
