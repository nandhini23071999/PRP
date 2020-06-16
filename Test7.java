//import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner sc =new Scanner(System.in);
String str1="AmmU";
StringBuffer str=new StringBuffer(str1);
for(int i=0;i<=str1.length()-1;i++) {
	Character c=str1.charAt(i);
	if(Character.isLowerCase(c))
		str.replace(i,i+1,Character.toUpperCase(c)+"");

else
	str.replace(i,i+1,Character.toLowerCase(c)+"");

}
System.out.println(str);
}

}
