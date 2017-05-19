
public class TwoWheeler extends Vehicle {

	public TwoWheeler(int y) {
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
