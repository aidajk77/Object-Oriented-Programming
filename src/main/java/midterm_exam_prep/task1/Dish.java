package midterm_exam_prep.task1;

public class Dish extends MenuItem {
    CuisineType cuisineType;
    String mainIngredient;
    public Dish(String code, String name, double price, CuisineType cuisineType, String mainIngredient) {
        super(code, name, price);
        this.cuisineType = cuisineType;
        this.mainIngredient = mainIngredient;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " " + cuisineType.toString() + " " + mainIngredient + " ";
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "cuisineType=" + cuisineType +
                ", mainIngredient='" + mainIngredient + '\'' +
                '}';
    }
}
