//String[] input={"100","111","10100","10","1111"}; input2="10"
//
// output=2;count strings having prefix"10" but "10" not included in count
//
// operation-- for how many strings input2 matches the prefix of each string in input1
//
// String[] input={"01","01010","1000","10","011"};
//
// output=3; count the strings having prefix"10","01" but "10","01" not included
public class StringBufferReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input={"100","111","10100","10","1111"};
		int count1=0;
		String s2="10";
		StringBuffer sb=new StringBuffer(s2);
		sb.reverse();
		for (String string : input) {

			if(string.length()>2){
			//	System.out.println("substring"+"-"+string.substring(0, 2)+"-"+"s2"+"-"+s2+"-"+"sb"+"-"+sb.reverse().toString());
				if(string.substring(0, 2).equals(s2)||string.substring(0, 2).equals(sb.toString())){
					count1++;
				//	System.out.println(count1);
				}
			}
		}
		System.out.println(count1);
		
	}

}
