public class Pirate {
   //instance vars
	private String name;
	private int limbsRemaining;

   //class vars
	private static int numPirates = 0;
	private static int totalLimbsLost = 0;

	public Pirate(String name) {
		this.name = name;
		this.limbsRemaining = 4;

		numPirates++;
	}

	public Pirate(String name, int limbs) {
		this.name = name;
		this.limbsRemaining = limbs;

		numPirates++;
	}

	public String getName() {
		return name;
	}

	public int getLimbsRemaining() {
		return limbsRemaining;
	}

	
	public static int getNumPirates() {
		return numPirates;
	}

	public static int getTotalLimbsLost() {
		return totalLimbsLost;
	}
}
