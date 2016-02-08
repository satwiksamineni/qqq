import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

//19) input---input1=1;
//
// input2=4;
//
// input3=1;
//
// output1=4;
//
// operation--- print the element which is not repeated 
//
// if all the inputs r different sum all inputs
//
// input---input1=1;
//
// input2=2;
//
// input3=3;
//
// output1=6;
public class DuplicatesArrayCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 4, 2 };
		int count = 0;
		int count1 = -1;
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		//Set<Integer> s3 = new HashSet<>();
		for (Integer integer : a) {
			s1.add(integer);

		}

		if (s1.size() == a.length) {
			for (Integer integer : s1) {
				count += integer;
			}
			System.out.println(count);
		} else {
			s1.clear();
			s2.clear();
			for (int i = 0; i < a.length; i++) {
				if (s1.add(a[i])) {
					count1++;
				} else if (count1 != i) {
					s2.add(a[i]);
				}
			}
			s1.removeAll(s2);
			System.out.println(s1);

		}

	}

}
