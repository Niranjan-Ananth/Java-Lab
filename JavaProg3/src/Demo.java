
public class Demo {

	public static void display(TwoWheeler a, FourWheeler b, MyTwoWheeler c){
		System.out.println("TwoWheeler : " + a.getData());
		System.out.println("Four Wheeler : " + b.getData());
		System.out.println("My two wheeler : " + c.getData());
	}
	
	public static void main(String[] args) {
		TwoWheeler a = new TwoWheeler(1990);
		FourWheeler b = new FourWheeler(2000);
		MyTwoWheeler c = new MyTwoWheeler(1996);
		display(a, b, c);
		a.putData(2990);
		b.putData(3000);
		c.putData(2996);
		System.out.println("After putting data");
		display(a, b, c);
	}

}
