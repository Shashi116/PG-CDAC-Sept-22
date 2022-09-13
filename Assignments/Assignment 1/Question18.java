import java.util.Scanner;
class Question18{
public static void main(String args[]){
       System.out.println("Enter any number: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
       int p = 2;
       while (n > 1) {
       	if (n % p == 0) {
                System.out.println(p);
                n = n/p;
            }
            else{
                p++;
}
        }
    }
}
