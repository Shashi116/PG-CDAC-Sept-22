import java.util.Scanner;
class Question17{
	public static void main(String args[]){
		System.out.print("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
int p,c = 0;
int r = 0;
while(n>0){
	r = n%10;
	c= (c*10) + r;
	n = n/10;
	}
if(c == p){
System.out.println("The number is palindrome")
}
else{

    System.out.println("The number is not palindrome")
}
}
} 

