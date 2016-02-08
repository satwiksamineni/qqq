//14) String array will be given.if a string is Prefix of an any other string 
//in that array means count.
public class SubstringMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a={"pinky","preethi","puppy","preeth","puppypreethi"};
		int count=0;
		
		
		for (String string : a) {
			for (String string2:a) {
				if(string.matches(string2+"(.*)")){
					count++;
				}
			}
		}
		System.out.println(count-a.length);
		
	}

}
