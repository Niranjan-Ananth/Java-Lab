
public final class FourWheeler extends Vehicle {

	public FourWheeler(int y) {
		super(y);
	}
	@Override
	int getData() {
		return yearOfManifacture;
	}

	@Override
	void putData(int y) {
		yearOfManifacture = y;
	}

}
