//18) Input1=”cowboy”; Output1=”cowcow”;
//Input1=”so”;output1=”sososo”; 
//Input1="boy";output1="boyboy";

// HINT: if they give 3 letter word u have to display 2 time;
public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input1="c";
StringBuffer sb=new StringBuffer();
int i=0;
if(input1.length()==1){
	while(i<6){
	sb.append(input1);
	i++;}
}
else if (input1.length()==2){
	while(i<3){
		sb.append(input1);
		i++;	
	}
}
else{
	while(i<2){sb.append(input1.substring(0, 3));i++;}
}

System.out.println(sb.toString());
	}

}
