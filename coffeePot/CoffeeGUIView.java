package coffeePot;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CoffeeGUIView extends JFrame {

	private CoffeeGUIController controller;
	private Container contentPane;
	private JPanel buttonPanel;
	private JPanel displayPanel;
	private JPanel orderPanel;
	private JPanel removePanel;
	private JPanel extrasPanel;
	private JPanel confirmPanel;
	private JButton orderCoffee;
	private JButton orderCream;
	private JButton orderSugar;
	private JButton orderTea;
	private JButton orderSoup;
	private JButton removeCoffee;
	private JButton removeCream;
	private JButton removeSugar;
	private JButton removeTea;
	private JButton removeSoup;
	private JButton confirm;
	private JButton returnCoins;
	private JButton insertQuarter;
	private JButton insertDime;
	private JButton insertNickel;
	private JButton enterCoins;
	private JLabel totalAmount;
	private JLabel coffeesOrdered;
	private JLabel creamOrdered;
	private JLabel sugarOrdered;
	private JLabel teasOrdered;
	private JLabel soupsOrdered;
	private JLabel credits;
	
	public CoffeeGUIView(String title, CoffeeGUIController controller)
	{
		super(title);
		this.controller = controller;
		this.setSize(600, 500);
		this.setLocation(300, 200);
		contentPane = this.getContentPane();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(new GridLayout(3, 3));
		
		makeButtons();
		//setText();
		contentPane.add(buttonPanel);
		contentPane.add(extrasPanel);
		contentPane.add(removePanel);
		contentPane.add(confirmPanel);
		
		WindowListener windowListener = new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				CoffeeGUIView.this.dispose();
				System.exit(0);
			}
		};
		
		this.addWindowListener(windowListener);
		
		
		
/////////////////DISPLAY PANELS///////////////////////////////////
		displayPanel = new JPanel();
		totalAmount = new JLabel("");
		contentPane.add(displayPanel);
		displayPanel.add(totalAmount);
		displayPanel.add(credits);
		displayPanel.setBackground(Color.GREEN);
		displayPanel.setLayout(new GridLayout(3, 1));
		totalAmount.setText("AMOUNT IN SLOT: " + Integer.toString(this.controller.cashBox.getTotalInSlot()));
		credits.setText("CREDITS: " + Integer.toString(this.controller.cashBox.getCredits()));
		
		orderPanel = new JPanel();
		orderPanel.setLayout(new GridLayout(2, 5));
		
		coffeesOrdered = new JLabel();
		creamOrdered = new JLabel();
		sugarOrdered = new JLabel();
		teasOrdered = new JLabel();
		soupsOrdered = new JLabel();
		
		contentPane.add(orderPanel);
		orderPanel.add(coffeesOrdered);
		orderPanel.add(creamOrdered);
		orderPanel.add(sugarOrdered);
		orderPanel.add(teasOrdered);
		orderPanel.add(soupsOrdered);
		
		coffeesOrdered.setText("COFFEES: " + Integer.toString(this.controller.beverages.coffeeOrdered));
		creamOrdered.setText("CREAM: " + Integer.toString(this.controller.beverages.creamOrdered));
		sugarOrdered.setText("SUGAR: " + Integer.toString(this.controller.beverages.sugarOrdered));
		teasOrdered.setText("TEA: " + Integer.toString(this.controller.beverages.teaOrdered));
		soupsOrdered.setText("SOUP: " + Integer.toString(this.controller.beverages.soupOrdered));
		
		
		
		
		
	}
	
//	public void setText()
//	{
//
//		
//		totalAmount.setText(Integer.toString(this.controller.cashBox.quartersInSlot));
//		
//		//contentPane.add(totalAmount);
//	}
	
	public void makeButtons()
	{
		orderCoffee = new JButton("Add Coffee");
		orderTea = new JButton("Add Tea");
		orderSoup = new JButton("Add Soup");
		orderCream = new JButton("Add Cream");
		orderSugar = new JButton("Add Sugar");
		removeCoffee = new JButton("Remove Coffee");
		removeCream = new JButton("Remove Cream");
		removeSugar = new JButton("Remove Sugar");
		removeTea = new JButton("Remove Tea");
		removeSoup = new JButton("RemoveSoup");
		insertQuarter = new JButton("Insert Quarter");
		insertDime = new JButton("Insert Dime");
		insertNickel = new JButton("Insert Nickel");
		confirm = new JButton("CONFIRM");
		confirm.setBackground(Color.GREEN);
		returnCoins = new JButton("Coin Return");
		returnCoins.setBackground(Color.RED);
		enterCoins = new JButton("Enter Coins");
		enterCoins.setBackground(Color.BLUE);
		credits = new JLabel();
		
		
		buttonPanel = new JPanel();
		buttonPanel.add(orderCoffee);
		buttonPanel.add(orderTea);
		buttonPanel.add(orderSoup);
		buttonPanel.add(insertQuarter);
		buttonPanel.add(insertDime);
		buttonPanel.add(insertNickel);
		
		extrasPanel = new JPanel();
		extrasPanel.setBackground(Color.BLUE);
		extrasPanel.add(orderCream);
		extrasPanel.add(orderSugar);
		
		removePanel = new JPanel();
		removePanel.setBackground(Color.ORANGE);
		removePanel.add(removeCoffee);
		removePanel.add(removeCream);
		removePanel.add(removeSugar);
		removePanel.add(removeTea);
		removePanel.add(removeSoup);
		
		confirmPanel = new JPanel();
		confirmPanel.add(confirm);
		confirmPanel.add(returnCoins);
		confirmPanel.add(enterCoins);
		
		
		
	
////////////////////////////ACTION LISTENERS////////////////////
		
		
		//For Amounts

		
		this.insertQuarter.addActionListener(event -> {
			this.controller.cashBox.addQuarter();
			System.out.println(this.controller.cashBox.quartersInSlot);//test
			totalAmount.setText("AMOUNT IN SLOT: " + Integer.toString(this.controller.cashBox.getTotalInSlot()));
			credits.setText("CREDITS: " + Integer.toString(this.controller.cashBox.getCredits()));
		});
		
		this.insertDime.addActionListener(event -> {
			this.controller.cashBox.addDime();
			totalAmount.setText("AMOUNT IN SLOT: " + Integer.toString(this.controller.cashBox.getTotalInSlot()));
			credits.setText("CREDITS: " + Integer.toString(this.controller.cashBox.getCredits()));
		});
		
		this.insertNickel.addActionListener(event -> {
			this.controller.cashBox.addNickel();
			totalAmount.setText("AMOUNT IN SLOT: " + Integer.toString(this.controller.cashBox.getTotalInSlot()));
			credits.setText("CREDITS: " + Integer.toString(this.controller.cashBox.getCredits()));
		});
			
		//For Beverages
		this.orderCoffee.addActionListener(event -> {
			this.controller.beverages.addCoffee();
			System.out.println("HELLO."); //test
			coffeesOrdered.setText("COFFEES: " + Integer.toString(this.controller.beverages.coffeeOrdered));
			});
		
		this.orderCream.addActionListener(event -> {
			this.controller.beverages.addCream();
			creamOrdered.setText("CREAM: " + Integer.toString(this.controller.beverages.creamOrdered));
		});
		
		this.orderSugar.addActionListener(event -> {
			this.controller.beverages.addSugar();
			sugarOrdered.setText("SUGAR: " + Integer.toString(this.controller.beverages.sugarOrdered));
		});
		
		this.orderTea.addActionListener(event -> {
			this.controller.beverages.addTea();
			teasOrdered.setText("TEA: " + Integer.toString(this.controller.beverages.teaOrdered));
		});
		
		this.orderSoup.addActionListener(event -> {
			this.controller.beverages.addSoup();
			soupsOrdered.setText("SOUP: " + Integer.toString(this.controller.beverages.soupOrdered));
		});
		
		this.removeCoffee.addActionListener(event -> {
			this.controller.beverages.removeCoffee();
			coffeesOrdered.setText("COFFEES: " + Integer.toString(this.controller.beverages.coffeeOrdered));
		});
		
		this.removeCream.addActionListener(event -> {
			this.controller.beverages.removeCream();
			creamOrdered.setText("CREAM: " + Integer.toString(this.controller.beverages.creamOrdered));
		});
		
		this.removeSugar.addActionListener(event -> {
			this.controller.beverages.removeSugar();
			sugarOrdered.setText("SUGAR: " + Integer.toString(this.controller.beverages.sugarOrdered));
		});
		
		this.removeTea.addActionListener(event -> {
			this.controller.beverages.removeTea();
			teasOrdered.setText("TEA: " + Integer.toString(this.controller.beverages.teaOrdered));
		});
		
		this.removeSoup.addActionListener(event -> {
			this.controller.beverages.removeSoup();
			soupsOrdered.setText("SOUP: " + Integer.toString(this.controller.beverages.soupOrdered));
		});
		
		//For Confirm Return and Enter
		this.confirm.addActionListener(event -> {
			
		});
		
		this.returnCoins.addActionListener(event -> {
			if(this.controller.cashBox.getTotalInSlot() > 0)
			{
				JOptionPane.showMessageDialog(contentPane, "Enter Coins In Order To Return Coins", "Error", JOptionPane.WARNING_MESSAGE );
			}
			
			else if(this.controller.cashBox.getCredits() > 0)
			{
				this.controller.cashBox.giveBack(this.controller.cashBox.getCredits());
				
				JOptionPane.showMessageDialog(contentPane, "RETURNING: \n" + 
						this.controller.cashBox.numOfReturnQuarters + " QUATERS\n" + 
						this.controller.cashBox.numOfReturnDimes + " DIMES\n" +
						this.controller.cashBox.numOfReturnNickels + " NICKELS", "RETURN SLOT", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		this.enterCoins.addActionListener(event -> {
			this.controller.cashBox.store();
			totalAmount.setText("AMOUNT IN SLOT: " + Integer.toString(this.controller.cashBox.getTotalInSlot()));
			credits.setText("CREDITS: " + Integer.toString(this.controller.cashBox.getCredits()));
		});
						

			//coffeeSubMenu()
		//});
		
		
		
	}
}

