package array;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int[] n= new int[30];
		 int in= sc.nextInt();
		 for(int i=0;i<in;i++)
			 n[i]=sc.nextInt();
		 
		 
	        int sum=0;
	        int[][] x=check(n);
	          
	        if(x[0][0]==6 && x[1][0]==7) {
	            for(int k=0;k<x[0][1];k++) {
	                sum=sum+n[k];
	            }
	            for(int k=x[1][1]+1;k<n.length;k++) {
	                sum=sum+n[k];
	            }   
	        }
	        else {
	            for(int i=0;i<n.length;i++)
	            {
	                sum=sum+n[i];
	             }
	        }
	         System.out.println(sum);
	    }

	    
	    public static int[][] check(int[] a) {
	        int[] x=new int[2];
	        int[] y=new int[2];
	        int j;
	        for(int i=0;i<a.length;i++) {
	            if(a[i]==6){
	                x[0]=6;
	                x[1]=i;
	            }
	            if(a[i]==7 && x[0]==6){
	                y[0]=7;
	                y[1]=i;
	            }
	        }
	        int[][] z= new int[2][2];
	        z[0]=x;
	        z[1]=y;
	        return z;
	    }
}