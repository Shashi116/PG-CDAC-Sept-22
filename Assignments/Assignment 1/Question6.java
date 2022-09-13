import java.util.Scanner;
class Question6{
	public static void main(String args[]){
		System.out.print("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		if((y%4==0 && y%100!=0) || y%400==0){
			System.out.print("The year is Leap year");
		}
        else{
			System.out.println("The year is not Leap year");
		}
		
	}
}