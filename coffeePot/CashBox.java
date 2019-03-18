/*
 * CashBox used to handle the storing, tracking and returning of coins/amounts of money.
 * 
 */
package coffeePot;

public class CashBox {

		

			
			int amount = 0;
			int amountInSlot = 0;
			int credits;
			
			int nickelsInSlot = 0;
			int dimesInSlot = 0;
			int quartersInSlot = 0;
			int numOfNickels = 0;
			int numOfDimes = 0;
			int numOfQuarters = 0;
			int valueOfNickels = 5;
			int valueOfDimes = 10;
			int valueOfQuarters = 25;
			int numOfReturnQuarters;
			int numOfReturnDimes;
			int numOfReturnNickels;
			
			final int COFFEE_PRICE = 35; // $0.65
			final int TEA_PRICE = 50;
			final int SOUP_PRICE = 75;
			
			
			public void deposit (int nickles, int dimes, int quarters) {
				
				 nickelsInSlot = nickles;
				 dimesInSlot = dimes;
				 quartersInSlot = quarters;
				
				 amountInSlot = amountInSlot + (valueOfNickels*nickles + valueOfDimes*dimes + valueOfQuarters*quarters);
			}
			
			public void giveBack(int returnAmount) {
				
				
			    numOfReturnQuarters = 0;
			    numOfReturnDimes = 0;
			    numOfReturnNickels = 0;
				
				if(valueOfQuarters >= returnAmount)
				{
					numOfReturnQuarters = returnAmount / valueOfQuarters;
					
					if(numOfQuarters >= numOfReturnQuarters)
						returnAmount %= valueOfQuarters;
					else
						numOfReturnQuarters = 0;
				}
				
				if(valueOfDimes >= returnAmount)
				{
					numOfReturnDimes = returnAmount / valueOfDimes;
					
					if(numOfDimes >= numOfReturnDimes)
						returnAmount %= valueOfDimes;
					else
						numOfReturnDimes = 0;
					
				}
				
				if(valueOfNickels >= returnAmount)
				{
					numOfReturnNickels = returnAmount / valueOfNickels;
					
					if(numOfNickels >= numOfReturnNickels)
						returnAmount = 0;
					else
						numOfReturnNickels = 0;
				}
				
				returnQuaters(numOfReturnQuarters);
				returnDimes(numOfReturnDimes);
				returnNickels(numOfReturnNickels);
				
				//someone else deal with calculating how many coins 
				//and of which type need to be returned ;)
				
//				if () {
//					
//				}
			}
			
			public void returnQuaters(int quaters)
			{
				numOfQuarters -= quaters;
				System.out.println("Returning " + quaters + " quaters.");
			}
			
			public void returnDimes(int dimes)
			{
				numOfDimes -= dimes;
				System.out.println("Returning " + dimes + " dimes.");
			}
			
			public void returnNickels(int nickels)
			{
				numOfNickels -= nickels;
				System.out.println("Returning " + nickels + " nickels.");
			}
		
			public void store () {
				
				int valueOfSlotNickels =  (valueOfNickels*nickelsInSlot);
				int valueOfSlotDimes = (valueOfDimes*dimesInSlot);
				int valueOfSlotQuarters = (valueOfQuarters*quartersInSlot);
				
				amount += valueOfSlotNickels + valueOfSlotQuarters + valueOfSlotDimes;
				
				credits += amountInSlot;
				
				amountInSlot = 0;
				
				nickelsInSlot = 0;
				dimesInSlot = 0;
				quartersInSlot = 0;
						
			}
			
			public int getCredits()
			{
				return credits;
			}
			
			public int getTotal () {
				return amount;
			}
			
			public int getTotalInSlot () {
				return amountInSlot;
			}
			
			public void pushReturnButton() {
				
				int amountToReturn = getTotalInSlot();
				giveBack(amountToReturn);
				
			}
			
			public void addCoffeePrice()
			{
				
			}
			
			public void addQuarter()
			{
				amountInSlot += valueOfQuarters;
				quartersInSlot++;
			}
			
			public void addDime()
			{
				amountInSlot += valueOfDimes;
				dimesInSlot++;
			}
			
			public void addNickel()
			{
				amountInSlot += valueOfNickels;
				nickelsInSlot++;
			}

		
}
