public class Main {
	public static void main(String[] args) {
		//demonstrating the difference in static and object
		//contexts
		
		Pirate pete = new Pirate("Peg Leg Pete", 3);
		Pirate susie = new Pirate("Savage Susie");
		Pirate manuel = new Pirate("Mambo Manuel");
		
		System.out.println("Total pirates created: " + Pirate.getNumPirates());
		
		//fight with sharks
		susie.loseALimb();
		susie.loseALimb();
		pete.loseALimb();
		manuel.loseALimb();
		
		System.out.println("Susie has " + susie.getLimbsRemaining() + " limbs remaining");
		System.out.println("Pete has " + pete.getLimbsRemaining() + " limbs remaining");
		System.out.println("Manuel has " + manuel.getLimbsRemaining() + " limbs remaining");
		System.out.println("They have lost " + Pirate.getTotalLimbsLost() + " total limbs");
	   
   }

}
