package array;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
		int a[]=new int[n];
		int flag=0;
		int flag1=0;
		int i;
		
		for(i=0;i<n;i++) 
			a[i]=sc.nextInt();
		
		for(i=0;i<n;i++) {
			if(a[i]==4)
				flag=1;
			if(a[i]==1)
				flag1=1;
		}
		if(flag1==1 && flag==1) 
			System.out.println("TRUE");
		
			else
				System.out.println("FALSE");
			
		}
		

	}


