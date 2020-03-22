package Pojo;

public class Menu {
    private String meal;
    private int price;
    private String stars;

    public Menu(String meal, int price, String stars) {
        this.meal = meal;
        this.price = price;
        this.stars = stars;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return meal + "\n" +  price + " kr\n" + stars ;
    }
}
