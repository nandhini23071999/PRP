
public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=Integer.parseInt(args[0]);
for(int i=1;i<=a;i++) {
	
	for(int j=1;j<=i;j++) {
		System.out.print("* ");
	}
	for(int k=1;k<=a-i+1;k++) {
		System.out.println(" ");
	}
}
	}

}
