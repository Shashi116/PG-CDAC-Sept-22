import java.util.Scanner;
class Question11{
public static void main(String args[]){
System.out.print("nter any 3 numbers respectively: ");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if((a < b) && (a<c)){
System.out.print(a+" is smallest number.");
}
else if( b < c ){
System.out.print(b+" is smallest number.");
}
else{
System.out.print(c+" is smallest number.");
}
}
}