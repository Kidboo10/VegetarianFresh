package Controller;

import View.View;
import Model.Model;
import Pojo.Menu;

public class Controller {
    View view;
    Model model = new Model();

    public Controller(View view) {
        this.view = view;
    }

    public void mgsWelcomeCustomer() {
        view.printMessage("Welcome to Vegetarian Fresh\n");
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
    }

}

