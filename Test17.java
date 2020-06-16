
public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=Integer.parseInt(args[0]);
	int	temp=n;
		int r,reverse=0;
		while(n!=0) {
		r=n%10;
		reverse=reverse*10+r;
		n=n/10;
	}
		if(temp==reverse) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not a palindrom");
		}

}
}