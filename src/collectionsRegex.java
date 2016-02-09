//hero
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//20) input1-List1-{apple,orange,grapes}
//
// input2-List2-{melon,apple,mango}
//
// output={mango,orange}
//
// operation-- In 1st list remove strings starting with 'a' or 'g'
//
// In 2nd list remove strings ending with 'n' or 'e'
//
// Ignore case, return in string array
public class collectionsRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>l1=new ArrayList<>();
List<String>l2=new ArrayList<>();
List<String>l3=new ArrayList<>();
l1.add("apple");
l1.add("orange");
l1.add("grapes");
l2.add("melon");
l2.add("apple");
l2.add("mango");
for (String string : l1) {
	System.out.println("qq");
	if(string.matches("a(.*)")||string.matches("g(.*)")){
		
	}
	else
	{
		l3.add(string);
	}
}
for (String string : l2) {
	if(string.matches("n(.*)")||string.matches("e(.*)")){
		//l2.remove(l2.indexOf(string));
	}
	else
	{
		l3.add(string);
	}
}
System.out.println(l3);


	
	}

}
