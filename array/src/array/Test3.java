package array;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter the no:");
int n=sc.nextInt();
int a[]=new int[n];
int i,flag=1;

for( i=0;i<n;i++) {
	a[i]=sc.nextInt();
	}
System.out.print("num:");
int z=sc.nextInt();
for(i=0;i<n;i++) 
if(a[i]==z) {
	System.out.println("pos"+(i));
   flag=2;

}

if(flag==1)
System.out.println("-1");


	
	}
}
