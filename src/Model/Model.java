package Model;

import Pojo.Menu;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Model {

    public List<Menu> saveFileToListAndSendToController() {
        List<Menu> menuList = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("src//db//menu.txt"))) {
            while (sc.hasNext()) {
                String meal = sc.nextLine().trim();
                String readPrice = sc.nextLine().trim();
                String price = (readPrice.substring(0, readPrice.lastIndexOf(' ')));
                String stars = sc.nextLine().trim();

                menuList.add(new Menu(meal, Integer.parseInt(price), stars));
            }

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist " + e.getMessage());
            System.exit(0);
        }

        return menuList;
    }

    public List<Menu> returnSortedMenuToController() {
        List<Menu> menuList = saveFileToListAndSendToController();
        List<Menu> sortedList;
        sortedList = menuList.stream().flatMap(Stream::of)
                .sorted(Comparator.comparingInt(Menu::getPrice))
                .collect(Collectors.toList());

        return sortedList;
    }

}
