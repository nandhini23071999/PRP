package array;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i;
int a[]=new int[n];
for( i=0;i<n;i++) {
	a[i]=sc.nextInt();
	
}
Arrays.sort(a);
for(i=0;i<n;i++) {
System.out.print(a[i]+" ");
}
	}
}