package shirtpackage;

public class PartyWear extends FormalShirt {
	String brand;
	public PartyWear(int s, float p, boolean fs, boolean st, String b) {
		super(s, p, fs, st);
		brand = b;
	}
}
