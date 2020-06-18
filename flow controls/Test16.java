
public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		
		int temp,reverse=0;
		while(n!=0) {
		temp=n%10;
		reverse=reverse*10+temp;
		n=n/10;
	}
		System.out.println(reverse);
	}
}
