package array;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<=a.length-1;i++)
	a[i]=sc.nextInt();
Arrays.sort(a);
System.out.println("the minimum value is: "+a[0]);
System.out.println("the minimum value is: "+a[a.length-1]);

	}

}
