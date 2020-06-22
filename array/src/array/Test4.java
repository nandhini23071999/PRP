package array;
import java.util.*;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
int a[]=new int[n];
int i;
for(i=0;i<n;i++) {
	a[i]=sc.nextInt();
	
}
for(i=0;i<n;i++)
System.out.println((char)a[i]);
	}

}
