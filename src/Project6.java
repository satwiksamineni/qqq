//10) input1=1 ,input2=2 ,input3=3 --- output=6;
//
// input1=1 ,input2=13,input3=3 --- output=1;
//
// input1=13,input2=2 ,input3=8 --- output=8;
//
// if value equal to 13,escape the value '13', as well as the next value to 13.
//
// sum the remaining values
public class Project6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a={2,3,14,13,2,1};
int count=0;
for(int i=0;i<a.length;i++){
	if(a[i]==13){}
	else if(i!=0&&a[i-1]==13){
		
	}
	else
		count+=a[i];
}
System.out.println(count);
	}

}
