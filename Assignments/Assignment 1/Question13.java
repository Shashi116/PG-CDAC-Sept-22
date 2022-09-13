import java.util.Scanner;
class Question13{
	public static void main(String args[]){
		System.out.print("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
int r = 0;
System.out.print("The reversed is: ");
while(n>0){
	r = n%10;
	System.out.print(r);
	n = n/10;
	}
}
} 
