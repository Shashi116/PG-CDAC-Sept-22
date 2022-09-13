import java.util.Scanner;
class Question16{
	public static void main(String args[]){
		System.out.print("Enter any two number respectively: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int lcm = 1;
		for( int i = 1; i<=a && i <=b ; i++ ){
			if(a%i == 0 && b%i==0){
        lcm = i;
        }
		  	}
              lcm = (a * b) / lcm;
              System.out.print( "The LCM is: " + lcm ); 
        }
    
	}