package Controller;

import View.View;
import Model.Model;
import Pojo.Menu;

public class Controller {
    View view;
    Model model = new Model();
    String welcomeMgs = "Welcome to Vegetarian Fresh\n";
    String askMgs = "Want to see the menu again but sorted\nType(yes or no)\n";
    String repeatMgs = "Want to see the menu again\nType(yes or no)";
    String error = "Pleas Type yes or no\n";
    String goodByeMgs = "Good Bye!";

    public Controller(View view) {
        this.view = view;
    }

    public void welcomeCustomerMgs() {
        view.printMessage(welcomeMgs);
    }

    public void askToSeeSortedMenuMgs() {
        view.printMessage(askMgs);
    }

    public void ByeMgs() {
        view.printMessage(goodByeMgs);
    }

    public void askToSeeMenuAgainMgs() {
        view.printMessage(repeatMgs);
    }

    public void errorMgs() {
        view.printMessage(error);
    }

    public void getMenuAndPrintToView() {
        for (String s : model.readFileAndSendMenuToController()) {
            view.printMessage(s);
        }

    }

    public void getSortedListAndPrintToView() {
        for (Menu s : model.returnSortedListToController()) {
            view.printMessage(s.toString());
        }
        askToSeeMenuAgainMgs();
    }

}

