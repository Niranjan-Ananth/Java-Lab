package studentpackage;

public class UserDefinedException extends Exception {
	String s1;
	public UserDefinedException(String s2) {
		s1 = s2;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s1;
	}
	
}
