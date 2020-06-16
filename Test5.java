import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
char a=sc.next().charAt(0);
if(a>=48 && a<=57) 
	System.out.println("Digit");
else if((a>='a' && a<='z') || (a>='A' && a<='Z') )
	System.out.println("Alphabet");
else
	System.out.println("special character");
	}
}
