package coffeePot;

public class Beverage {

	public int coffee = 100;
	public int tea = 100;
	public int soup = 100;
	public int cream = 100;
	public int sugar = 100;
	public int coffeeOrdered = 0;
	public int teaOrdered = 0;
	public int soupOrdered = 0;
	public int creamOrdered = 0;
	public int sugarOrdered = 0;
	
	public void addCoffee()
	{
		coffeeOrdered++;
	}
	
	public void addCream()
	{
		creamOrdered++;
	}
	
	public void addSugar()
	{
		sugarOrdered++;
	}
	
	public void addTea()
	{
		teaOrdered++;
	}
	
	public void addSoup()
	{
		soupOrdered++;
	}
	
	public void removeCoffee()
	{
		if(coffeeOrdered > 0)
			coffeeOrdered--;
	}
	public void removeCream()
	{
		if(creamOrdered > 0)
			creamOrdered--;
	}
	
	public void removeSugar()
	{
		if(sugarOrdered > 0)
			sugarOrdered--;
	}
	
	public void removeTea()
	{
		if(teaOrdered > 0)
			teaOrdered--;
	}
	
	public void removeSoup()
	{
		if(soupOrdered > 0)
			soupOrdered--;
	}
	
	public int giveCoffee()
	{
		coffee -= coffeeOrdered;
		int returnCoffee = coffeeOrdered;
		coffeeOrdered = 0;
		 
		return returnCoffee;
	}
	
	public int giveCream()
	{
		cream -= creamOrdered;
		int returnCream = creamOrdered;
		creamOrdered = 0;
		 
		return returnCream;

	}
	
	public int giveSugar()
	{
		sugar -= sugarOrdered;
		int returnSugar = sugarOrdered;
		sugarOrdered = 0;
		 
		return returnSugar;
	}
	
	public int giveTea()
	{
		tea -= teaOrdered;
		int returnTea = teaOrdered;
		teaOrdered = 0;
		 
		return returnTea;
	}
	
	public int giveSoup()
	{
		soup -= soupOrdered;
		int returnSoup = soupOrdered;
		soupOrdered = 0;
		 
		return returnSoup;
	}
	
	
	
	
}
