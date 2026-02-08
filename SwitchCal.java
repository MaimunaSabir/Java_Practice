import java.util.*;
class switchClass{
    public static void main(String arg[]){
Scanner input=new Scanner(System.in);
int a=input.nextInt();
int b=input.nextInt();
char opt=input.next().charAt(0);

switch(opt){
    case '+':
    System.out.println("SUM : "+(a+b));break;
     case '-':
    System.out.println("DIFFERENCE :"+(a-b));break;
     case '*':
    System.out.println("MULTIPLY :"+(a*b));break;
     case '/':
    System.out.println("DIVIDE :"+(a/b));break;
    default:
    System.out.println("INVALID OPERATOR");
}
}
    }