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


//    private void readFileAndSendMenuToView(View.View view) {
//        try {
//            FileInputStream inputStream = new FileInputStream("src\\menu.txt");
//            DataInputStream in = new DataInputStream(inputStream);
//            BufferedReader br = new BufferedReader(new InputStreamReader(in));
//            String strLine;
//
//            while ((strLine = br.readLine()) != null) {
//                view.printMessage(strLine);
//            }
//
//            in.close();
//
//        } catch (Exception e) {
//            view.printMessage("File dont exist " + e.getMessage());
//        }
//    }

//    private List<Pojo.Menu> readFileAndSaveToList() {
//        List<Pojo.Menu> menuList = new ArrayList<>();
//        try (Scanner sc = new Scanner(new File("src//menu.txt"))) {
//            while (sc.hasNext()) {
//                String meal = sc.nextLine().trim();
//                String readPrice = sc.nextLine().trim();
//                String price = (readPrice.substring(0, readPrice.lastIndexOf(' ')));
//                String stars = sc.nextLine().trim();
//
//                menuList.add(new Pojo.Menu(meal, Integer.parseInt(price), stars));
//            }
//
//        } catch (FileNotFoundException e) {
//            view.printMessage("File dont exist " + e.getMessage());
//            System.exit(0);
//        }
//
//        return menuList;
//    }

//    public void returnSortedListToView() {
//        List<Pojo.Menu> menuList = readFileAndSaveToList();
//        List<Pojo.Menu> sortedList;
//        sortedList = menuList.stream().flatMap(Stream::of)
//                .sorted(Comparator.comparingInt(Pojo.Menu::getPrice))
//                .collect(Collectors.toList());
//
//        sortedList.forEach(System.out::println);
//
//    }

}

