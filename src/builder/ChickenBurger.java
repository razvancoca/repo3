package builder;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken burger";
	}

	@Override
	public float price() {
		return 21f;
	}

}
