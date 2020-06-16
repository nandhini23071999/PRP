import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int i,m=a/2,flag=1;
if(a==0||a==1)
   System.out.println(a+" "+"not a prime");
else
	for(i=2;i<=m;i++)
		if(a%i==0)
		{
			System.out.println(a+" "+"not a prime");
			flag=0;
			break;
		}
     if(flag==1)
    	 System.out.println(a+" "+"is a prime");
	
	
	
	
	
	
	}

}
