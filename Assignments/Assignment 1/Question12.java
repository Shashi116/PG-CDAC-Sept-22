import java.util.Scanner;
class Question12{
    public static void main(String args[]){
    System.out.print("Enter any two number respectively: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int s = a;
    for( int i = 0; i <b ; i++ ){
    s++;
    }
    }
    System.out.print( "the sum is: " + s );
    }
    