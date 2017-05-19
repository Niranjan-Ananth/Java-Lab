package shirtpackage;

public abstract class Shirt {
	int size;
	float price;
	protected String colour;
	public Shirt(int s, float p) {
		size = s;
		price = p;
		colour = "None";
	}
	abstract String getColour();
	abstract void putColour(String c);
}
