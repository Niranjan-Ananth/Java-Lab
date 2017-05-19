/*
 Author : Niranjan A
 Program showing the usage of inheritance and packages
 */
package shirtpackage;

public class Demo {

	public static void main(String[] args) {
		PullOver a = new PullOver(40, 2000, true, false);
		a.putColour("Black");
		FormalShirt b = new FormalShirt(38, 3000, false, true);
		b.putColour("Red");
		PartyWear c = new PartyWear(42, 4000, true, true, "John Players");
		
		System.out.println("Pull Over : " + a.size + " " + a.price + " " + a.getColour() + " "
				+ a.hasHood + " " + a.hasStripes);
		
		System.out.println("Formal Wear : " + b.size + " " + b.price + " " + b.getColour() + " "
				+ b.hasFullSleeves + " " + b.hasStripes);
		
		System.out.println("Party Wear : " + c.size + " " + c.price + " " + c.getColour() + " "
				+ c.hasFullSleeves + " " + c.hasStripes + " " + c.brand);
			
	}

}
