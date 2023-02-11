package q01;
/**
 * @author scottsheble
 * testing main function
 */

public class Food_Test {
        public static void main(String[] args) {
            Vegetable mySnack1 = new Vegetable("potato");
            Vegetable mySnack2 = new Vegetable("cabbage", .5, .2, .6);

            System.out.println("Vegetable : ");
            mySnack1.printName();

            System.out.printf("Total Calories: %.2f%n", mySnack1.getCalories());
            System.out.printf("Percent protein: %.2f%n", mySnack1.percentProtein());
            System.out.printf("Percent fat: %.2f%n", mySnack1.percentFat());
            System.out.printf("Percent carbohydrates: %.2f%n", mySnack1.percentCarbohydrates());

            
            System.out.println("\nVegetable : ");
            mySnack2.printName();
            System.out.printf("Total Calories: %.2f%n", mySnack2.getCalories());
            System.out.printf("Percent protein: %.2f%n", mySnack2.percentProtein());
            System.out.printf("Percent fat: %.2f%n", mySnack2.percentFat());
            System.out.printf("Percent carbohydrates: %.2f%n", mySnack2.percentCarbohydrates());
        }
    }