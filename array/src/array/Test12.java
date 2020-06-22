package array;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int i,j;
int a[]=new int[3];
int b[]=new int[3];
int c[]=new int[2];
for(i=0;i<3;i++)
	a[i]=sc.nextInt();
for(j=0;j<3;j++)
	b[j]=sc.nextInt();

c[0]=a[1];
c[1]=b[1];
for(i=0;i<2;i++)
	System.out.println(c[i]);

	}
	

}
