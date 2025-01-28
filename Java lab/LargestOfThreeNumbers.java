import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is larger than " + num2 + " and " + num3);
        }
        else if(num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is larger than " + num1 + " and " + num3);
        }
        else{
            System.out.println(num3 + " is larger than " + num1 + " and " + num2);
        }
    }
}
