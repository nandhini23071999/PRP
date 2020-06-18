import java.util.Scanner;

public class Test1b {

	
		public boolean lastDigits(int a,int b) {
			
			a=a%10;
			b=b%10;
			if(a==b)
				return true;
			else
				return false;
		}
		public static void main(String[] args) {
			Test1b c=new Test1b();
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(c.lastDigits(a,b));
			
	}

}
