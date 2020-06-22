package array;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[5];
		int i,j=0;
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1]) {
				b[j]=a[i];
				j++;
			}
		}
		b[j]=a[a.length-1];
		for(j=0;j<i;j++) {
		System.out.println(b[j]);
		}
	}

}
