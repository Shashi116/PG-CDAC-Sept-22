import java.util.Scanner;
class Question1{
	public static void main(String args[]){
		System.out.print("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2 == 0){
			System.out.println("Even");
			}
		else{
			System.out.println("Odd");
			}
			
		System.out.println("Enterd number is : " + n);
	}


}