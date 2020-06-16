
public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int n=1234;
	
	int temp,sum=0;
	while(n!=0) {
	temp=n%10;
	sum=sum+temp;
	n=n/10;
	
	}
	
	System.out.println(sum);
	}
	

}
