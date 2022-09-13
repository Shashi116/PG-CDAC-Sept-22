import java.util.Scanner;
class Question8{
public static void main(String args[]){
System.out.print("Enter any number: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int r = 0;
while(n>0){
r = n%10;
System.out.println(r);
n = n/10;
}
}
}