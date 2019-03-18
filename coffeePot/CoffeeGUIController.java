package coffeePot;

import java.awt.*;

public class CoffeeGUIController {

	//CoffeeGUIModel model;
	CashBox cashBox;
	Beverage beverages;
	CoffeeGUIView view;
	
	public CoffeeGUIController(CashBox cashBox, Beverage beverages)
	{
		this.cashBox = cashBox;
		this.beverages = beverages;
		this.view = new CoffeeGUIView("-COFFEE_POT_MACHINE-", this);
		this.view.setVisible(true);
		
	}
}
