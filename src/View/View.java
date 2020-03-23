package View;

import Controller.Controller;

import java.util.Scanner;

public class View {

    public View() {
        Controller controller = new Controller(this);
        Scanner sc = new Scanner(System.in);
        controller.welcomeCustomerMgs();
        controller.getMenuAndPrintToView();
        controller.askToSeeSortedMenuMgs();

        while (true) {
            String input = sc.nextLine();
            switch (input.toLowerCase()) {
                case "yes":
                    controller.getSortedMenuAndPrintToView();
                    break;
                case "no":
                    controller.ByeMgs();
                    System.exit(0);
                default:
                    controller.errorMgs();
            }

        }

    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}