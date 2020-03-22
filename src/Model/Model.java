package Model;

import Pojo.Menu;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Model {

    public List<String> readFileAndSendMenuToController() {

        List<String> menuList = new LinkedList<>();
        try {
            FileInputStream inputStream = new FileInputStream("src\\menu.txt");
            DataInputStream in = new DataInputStream(inputStream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;

            while ((strLine = br.readLine()) != null) {
                menuList.add(strLine);

            }

            in.close();

        } catch (Exception e) {
            System.out.println("File dont exist " + e.getMessage());
        }

        return menuList;
    }

    private List<Menu> readFileAndSaveToList() {
        List<Menu> menuList = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("src//menu.txt"))) {
            while (sc.hasNext()) {
                String meal = sc.nextLine().trim();
                String readPrice = sc.nextLine().trim();
                String price = (readPrice.substring(0, readPrice.lastIndexOf(' ')));
                String stars = sc.nextLine().trim();

                menuList.add(new Menu(meal, Integer.parseInt(price), stars));
            }

        } catch (FileNotFoundException e) {
            System.out.println("File dont exist " + e.getMessage());
            System.exit(0);
        }

        return menuList;
    }

    public List<Menu> returnSortedListToController() {
        List<Menu> menuList = readFileAndSaveToList();
        List<Menu> sortedList;
        sortedList = menuList.stream().flatMap(Stream::of)
                .sorted(Comparator.comparingInt(Menu::getPrice))
                .collect(Collectors.toList());

        // sortedList.forEach(System.out::println);
        return sortedList;
    }

//    public static void main(String[] args) {
//        Model.Model modell = new Model.Model();
//
//    }
}
