import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class NameChecker {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Kidus");
        names.add("Yosef");
        names.add("Mekuria");
        names.add("Yilma");
        names.add("Engida");

        Scanner sc = new Scanner(System.in);
        boolean continueProgram = true;

        while(continueProgram) {
            System.out.println("Enter a name:");
            String name = sc.nextLine();

            if (names.contains(name)) {
                int index = names.indexOf(name);
                System.out.println("Name found at index " + index);
            } else {
                System.out.println("Name hasn't been found.");
                System.out.println("Do you want to add it to the list? (yes/no)");
                String response = sc.nextLine();

                if (response.equalsIgnoreCase("yes")) {
                    names.add(name);
                    System.out.println("New name added to the list!");
                }
            }
            System.out.println("The updated list of names:" + names);
            System.out.println("Do you want to continue? (yes/no)");
            String continueResponse = sc.nextLine();

            if (continueResponse.equalsIgnoreCase("no")){
                continueProgram = false;
            }
        }
        System.out.println("Program terminated!");
    }
}