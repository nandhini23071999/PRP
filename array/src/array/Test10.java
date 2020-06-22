package array;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i,k=0;
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a[]=new int[n];
        int b[]=new int[n];		
		for(i=0;i<n;i++)
	           a[i]=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
		 if(a[i]%2==0)
		 {
			 b[k]=a[i];
			 k=k+1;
		 }
		}
			
		for(i=0;i<n;i++)
		{
		 if(a[i]%2!=0)
		 {
			 b[k]=a[i];
			 k=k+1;
		 }
		}
			
		for(i=0;i<n;i++)
			System.out.println(b[i]);
		
	
	}
}
