
public abstract class Vehicle {
	int yearOfManifacture;
	public Vehicle(int y) {
		yearOfManifacture = y;
	}
	abstract int getData();
	abstract void putData(int y);
}
