package q01;

public abstract class Food {
    private double calories;
    public Food() {
    }
    public abstract double percentProtein();
    public abstract double percentFat();
    public abstract double percentCarbohydrates();

    protected double getCalories() {
    	return this.calories; 
    }
    protected void setCalories(double cal) {
    	this.calories = cal; 
    }

}
