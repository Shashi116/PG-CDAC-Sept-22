import java.util.Scanner;
class Question10{
    public static void main(String args[]){
    System.out.print("Enter any number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = 0;
    int sum = 0;
    while(n>0){
    r = n%10;
    sum = sum +r;
    n = n/10;
    }
    System.out.println(sum);
    }
    }