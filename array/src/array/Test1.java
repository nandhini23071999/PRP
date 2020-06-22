package array;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
float average;
int a[]=new int[n];
for(int i=0;i<=a.length-1;i++) {
	a[i]=sc.nextInt();
	sum=sum+a[i];
}
System.out.println(sum);
average=(float)sum/n;
System.out.println(average);

	}

}
