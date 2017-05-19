package shirtpackage;

public final class PullOver extends Shirt {
	
	public boolean hasHood;
	public boolean hasStripes;
	public PullOver(int s, float p, boolean h, boolean st ) {
		super(s, p);
		hasHood = h;
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
