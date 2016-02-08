import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class intersectionUnionCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //ex: input1={1,2,3,4}; input2={1,2,3,5}; output1={4,5};

	
	int a[]={1,2,3,4};
	int b[]={1,2,3,5};
	
	Set<Integer>s1=new HashSet<>();
	Set<Integer>s2=new HashSet<>();
	Set<Integer>s3=new HashSet<>();
	for (Integer integer : a) {
		s1.add(integer);
	}
	for (Integer integer : b) {
		s2.add(integer);
	}
	s3.addAll(s1);
	s3.retainAll(s2);
	s1.addAll(s2);
	s1.removeAll(s3);
	System.out.println(s1);
	
	
	
	
	}
}
