package shirtpackage;

public class FormalShirt extends Shirt {
	
	boolean hasFullSleeves;
	boolean hasStripes;
	public FormalShirt(int s, float p, boolean fs, boolean st) {
		super(s, p);
		hasFullSleeves = fs;
		hasStripes = st;
	}
	@Override
	String getColour() {
		return colour;
	}

	@Override
	void putColour(String c) {
		colour = c;
	}

}



