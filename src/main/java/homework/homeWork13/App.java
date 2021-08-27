package homework.homeWork13;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Enter your string, I'll flip it backwards!");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

//        char[] arr = {'P','I','D','O','R'};
        BackwardString bString = new BackwardString(input);
        //BackwardString bString = new BackwardString();
        bString.printString();
        int length = bString.length();

        System.out.println("Enter index 0 to "+(length-1)+": ");

        while (true) {
            String input1 = scan.nextLine();
            try {
                int indx = Integer.parseInt(input1);
                if (indx >= length || indx < 0) { throw new NumberFormatException(); }
                System.out.println("Char at " + indx + ": " + bString.charAt(indx));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not a valid number, Enter index 0 to " + (length - 1) + ": ");
            }
        }

        System.out.println("Your flipped string: "+bString.toString());
        System.out.println("Half of your string: "+bString.subSequence(0,(length-1)/2));
    }


}