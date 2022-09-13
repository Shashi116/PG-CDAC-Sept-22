import java.util.Scanner;
class Question4{
public static void main(String args[]){
System.out.print("Enter first number: ");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
System.out.print("Enter second number: ");
int b = sc.nextInt();
System.out.println("Numbers before swap are First :- "+ a + ", Second :- "+ b );
a = a + b;
b = a - b;
a = a - b;
System.out.println("Numbers after swap are First :- "+ a + ", Second :- "+ b );
}
}
