import java.util.Scanner;

public class Calculator{
public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  
System.out.println("Enter First number: ");
double num1 = sc.nextDouble();

System.out.println("Enter Operator: ");
char op = sc.next().charAt(0);

System.out.println("Enter Second number: ");
double num2 = sc.nextDouble();

sc.close();

double result;

switch(op) {
    case '+':
        result = num1 + num2;
        break;
    case '-':
        result = num1 - num2;
        break;
    case '*':
        result = num1 * num2;
        break;
    case '/':
        result = num1 / num2;
        break;
    default:
        System.out.println("Invalid operator");
        return;
}

System.out.println(num1 + " " + op + " " + num2 + " = " + result);
}
}