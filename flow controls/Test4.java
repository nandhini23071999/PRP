import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str[]=new String[20];
   Scanner sc= new Scanner(System.in);
  for(int i=0;i<2;i++)
	  str[i]=sc.next();
  String temp;
  for(int i=0;i<2;i++)
	 for(int j=i+1;j<2;j++) {
		 if(str[i].compareTo(str[j])>0)
			  {temp=str[i];
		 str[i]=str[j];
		 str[j]=temp;}
	 }
  for(int i=0;i<2;i++)
	System.out.print(str[i]+",");
	}

}
		 
				 
			 
   
   
	


