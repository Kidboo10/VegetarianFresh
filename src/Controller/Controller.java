package Controller;

import View.View;
import Model.Model;
import Pojo.Menu;

public class Controller {
    View view;
    Model model = new Model();
    private String welcomeMgs = "Welcome to Vegetarian Fresh\n";
    private String askMgs = "Want to see the menu again but sorted\nType(yes or no)\n";
    private String repeatMgs = "Want to see the menu again\nType(yes or no)";
    private String error = "Pleas Type yes or no\n";
    private String goodByeMgs = "Good Bye!";

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

