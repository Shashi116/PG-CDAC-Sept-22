import java.util.Scanner;
class Question2{
	public static void main(String args[]){
		System.out.print("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		int f = num;
		if(num>1){
			while(num!=1){
				f= f * (num-1);
				num--;
				}
			System.out.print("The factorial of "+ n +" is = " + f);
		}
		else if(num==0 || n==1){
			System.out.println("Factorial of "+num+" is 1");
		} 
		else{
			System.out.println("Factorial cannot define");
		}
		
	}
}