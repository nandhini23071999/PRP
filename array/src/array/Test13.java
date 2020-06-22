package array;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		
			
			int a[][] = new int[30][30],i,j,l,k=0;
		
			l=args.length;
			if(l==4)
			{
				for(i=0;i<2;i++) 
				  for(j=0;j<2;j++)
					{
						a[i][j]=Integer.parseInt(args[k]);
						k++;
						}
					
				for(i=0;i<2;i++) {
					  for(j=0;j<2;j++)
						{
							System.out.print(a[i][j]+" ");
							}
				
				System.out.println();
				}
				System.out.println();
				
				for(i=1;i>=0;i--) {
					  for(j=1;j>=0;j--)
						{
							System.out.print(a[i][j]+" ");
							}
				
				System.out.println();
				}
			
			
			
			
			}
			else
			System.out.println("Please enter 4 integer number");
			
		}
}