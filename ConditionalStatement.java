
import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int age = sc.nextInt();

        // if (age > 18) {
        // System.out.println("This Person is Adult");
        // } else if (age > 15) {
        // System.out.println("This Person is Teeny ");

        // } else {
        // System.out.println("This child");

        // }

        // int number = sc.nextInt();
        // if (number % 2 == 0) {
        // System.out.println("Even");
        // } else {
        // System.out.println("Odd");
        // }

        // implement the calculator

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // char c = sc.next().charAt(0);;
        // int result;

        // switch (c) {
        // case '+': result = a+b;
        // System.out.println("sum of two number is :"+result);
        // break;

        // case '-': result = a-b;
        // System.out.println("sub of two number is :"+result);

        // break;

        // case '*': result = a*b;
        // System.out.println("multiplication of two number is :"+result);

        // break;

        // default:
        // System.out.println("Invalid options");

        // }

        // Find the number is positive and negative

        // int number = sc.nextInt();

        // if (number >= 0) {
        //     System.out.println("number is Postive " + number);
        // } else {
        //     System.out.println("number is Negative " + number);

        // }

        // int a = 63;
        // int b = 36;
        // boolean x = (a>b)?true:false;
        // int y = (a>b)?a:b;

        // System.out.println("x"+x);
        // System.out.println("y"+y);



        // find Leap Year 

        int number =  sc.nextInt();
        if ((number % 4 == 0 && number % 100 != 0) || (number % 400 == 0)){
            System.out.println("this year is leap year");
        }else{
            System.out.println("this year is not leap year");

        }

    }
}
