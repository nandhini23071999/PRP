package array;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[30][30],i,j,l,k=0,max=0;
		
		l=args.length;
		if(l==9)
		{
			for(i=0;i<3;i++) 
			  for(j=0;j<3;j++)
				{
					a[i][j]=Integer.parseInt(args[k]);
					k++;
					}
				
			for(i=0;i<3;i++) {
				  for(j=0;j<3;j++)
					{
						System.out.print(a[i][j]+" ");
						}
			
			System.out.println();
			}
			max=a[0][0];
			
			for(i=0;i<3;i++) {
				  for(j=0;j<3;j++)
					{
						if(max<a[i][j])
							max=a[i][j];
							
							
						}}
		System.out.println("max number is "+max);
		
		
		}
		else
		System.out.println("Please enter 9 integer number");
		
	}

}