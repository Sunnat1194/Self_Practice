package SelfPracticeReplit;

import java.util.Scanner;

public class Replit_086 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name,answer,guestList ="";

        do {
            System.out.println("Please enter guest name");
            name = input.next();

            guestList += name;

            System.out.println("Do you want to enter new guest name");
            answer = input.next();
            if (answer.equalsIgnoreCase("yes")){
                guestList += ",";
            }
        }while (answer.equalsIgnoreCase("yes"));
        System.out.println("Guest's list: " +guestList);
    }
}
