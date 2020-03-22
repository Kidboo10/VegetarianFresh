package View;

import Controller.Controller;

import java.util.Scanner;

public class View {

    public View() {
        Controller controller = new Controller(this);
        Scanner sc = new Scanner(System.in);
        String mgs = "Want to see the menu again but sorted\nType(yes or no)\n";
        String rmgs = "Want to see the menu again\nType(yes or no)";
        String error = "Pleas Type yes or no\n";
        printMessage(mgs);

        while (true) {
            String input;
            input = sc.nextLine();
            switch (input.toLowerCase()) {
                case "yes":
                    printMessage("Sorted Menu");
                    controller.getSortedListAndPrintToView();
                    printMessage("\n" + rmgs);
                    break;
                case "no":
                    printMessage("Bye");
                    System.exit(0);
                default:
                    printMessage(error);
            }

        }

    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}