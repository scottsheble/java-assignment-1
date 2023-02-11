package q01;

public class Vegetable extends Food {
    private String name;
    private double protein;
    private double fat;
    private double carbo;

    public static final double VEG_PROTEIN_CAL = 0.35;
    public static final double VEG_FAT_CAL = 0.15;
    public static final double VEG_CARBO_CAL = 0.50;

    public Vegetable(String name) {
        this.name = name;
        this.protein = VEG_PROTEIN_CAL;
        this.carbo = VEG_CARBO_CAL;
        this.fat = VEG_FAT_CAL;
        this.setCalories(this.protein + this.fat + this.carbo);
    }

    public Vegetable(String name, double protein, double fat, double carbo) {
        this.name = name;
        this.protein = protein;
        this.carbo = carbo;
        this.fat = fat;
        this.setCalories(this.protein + this.fat + this.carbo);
    }

    public void printName() { 
    	System.out.println("name : " + name); 
    }

    @Override
    public double percentProtein() {
    	return this.protein / this.getCalories(); 
    }
    @Override
    public double percentFat() {
    	return this.fat / this.getCalories(); 
    }
    @Override
    public double percentCarbohydrates() {
    	return this.carbo / this.getCalories(); 
    }

}
