package lessons.Lesson9;

public class Fruit {
    private String fruitName;
    private String countryOfOrigin;

    public Fruit(String fruitName, String countryOfOrigin) {
        this.fruitName = fruitName;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void printMe(){
        System.out.println("Fruit name = "+ this.fruitName+ ", country = "+ this.countryOfOrigin);
    }
}
