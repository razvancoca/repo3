package builder;

public abstract class ColdDrink implements Item {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
