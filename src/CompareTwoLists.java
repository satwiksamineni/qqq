import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

//13) Collect no’s frm list1 which is not present in list2 
//
// & Collect no’s frm list2 which is not present in list1
//
// and store it in output1[].
//
// ex: input1={1,2,3,4}; input2={1,2,3,5}; output1={4,5};
public class CompareTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>l1=new ArrayList<>();
l1.add(1);
l1.add(2);
l1.add(3);
l1.add(4);
List<Integer>l2=new ArrayList<>();
l2.add(1);
l2.add(2);
l2.add(3);
l2.add(5);


          Collection<Integer> l3 = new ArrayList(l1);
          Collection<Integer> l4 = new ArrayList(l2);
          Collection<Integer> l5 = new HashSet<Integer>( l3 );
          Collection<Integer> l6 = new HashSet<Integer>();
          l6.addAll( l3 );//1,2,3,4
          l6.addAll( l4 );//1,2,3,5
                        //l6: 1,2,3,4,5
          l5.retainAll( l4 );//123
          l6.removeAll( l5 );//45

          System.out.printf("l3:%s%nl4:%s%nl5:%s%nl6:%s%n", l3, l4, l5, l6);
 
    }

	}


