package Controller;

import View.View;
import Model.Model;
import Pojo.Menu;
import java.util.List;

public class Controller {
    View view;
    Model model = new Model();

    public Controller(View view) {
        view.printMessage("Welcome to Vegetarian Fresh\n");
        getMenuFromModelAndPrintToView();
    }

    private void getMenuFromModelAndPrintToView() {
        List<String> temp;
        temp = model.readFileAndSendMenuToController();
        temp.forEach(System.out::println);

    }

    public void getSortedListAndPrintToView() {
        List<Menu> temp;
        temp = model.returnSortedListToController();
        temp.forEach(System.out::println);
    }

}

