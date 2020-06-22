package array;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int b[]=new int[5];
int i;
int j=0;
for( i=0;i<n;i++) {
	
	a[i]=sc.nextInt();
}
for( i=0;i<n;i++) {
if(a[i]!=10) {
b[j++]=a[i];	

}

}
for(j=0;j<n;j++) {
	System.out.print(b[j]+" ");
}
	}

}
