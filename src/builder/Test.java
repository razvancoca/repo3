package builder;

public class Test {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal meal1 = mealBuilder.prepare2Drinks();

		meal1.showItems();
	}
}
