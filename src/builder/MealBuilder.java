package builder;

public class MealBuilder {
	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepare2Drinks(){
		Meal meal = new Meal();
		meal.addItem(new Pepsi());
		meal.addItem(new Coke());
		return meal;
	}
}
