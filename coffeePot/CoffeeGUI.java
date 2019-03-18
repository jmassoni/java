package coffeePot;

public class CoffeeGUI {
	
	//private CoffeeGUIModel guiModel;
	private CashBox cashBox;
	private Beverage beverages;
	private CoffeeGUIController guiController;
	
	public static void main(String[] args)
	{
		CoffeeGUI gui = new CoffeeGUI();
		gui.cashBox = new CashBox();
		gui.beverages = new Beverage();
		gui.guiController = new CoffeeGUIController(gui.cashBox, gui.beverages);
	}
	

}
