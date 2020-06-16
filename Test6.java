
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		if(args.length==0) {
			System.out.println("empty argument");
		}
		else {
			if(gender.equals("male") || gender.equals("female")){
				if(age>=1 && age<=120)
				{
					if(gender.equals("female") && (age>=1 && age<=58))
					{
						System.out.println("interest ==8.2%");
					}
					else if(gender.equals("female") && (age>=59 && age<=120))
					{
						System.out.println("interest ==7.6%");
					}
					else if(gender.equals("male") && (age>=1 && age<=60))
					{
						System.out.println("interest ==9.2%");
					}
					else if(gender.equals("male") && (age>=61 && age<=120))
					{
						System.out.println("interest ==8.3%");
					}
				}
			}
}
}
}