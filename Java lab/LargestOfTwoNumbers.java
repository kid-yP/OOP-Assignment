import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("Largest of two numbers is " + num1);
        }
        else{
            System.out.println("Largest of two numbers is " + num2);
        }
    }
}
