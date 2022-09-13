import java.util.Scanner;
class Question9{
public static void main(String args[]){
System.out.print("Enter any number: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.print("The factors of" + n + " are : ");
for( int i = 1; i <n ; i++ ){
if(n%i == 0){
System.out.print(i + " ");
}
}
}
