package builder;

public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Cold drink Coke";
	}

	@Override
	public float price() {
		return 12;
	}

}
