/** Auto class */

public class Auto
{

   //define instance variables
   private String model;
   private int milesDriven;
   private double gallonsOfGas;
   
   //default constructor
   public Auto( )
   {
   
      model = "unknown";
      milesDriven = 0;
      gallonsOfGas = 0.0;
      
   }
   


//overloaded constructor to allow user to specify values

public Auto( String model, int milesDriven, double gallonsOfGas )
{
   setModel(model);
   
   setMilesDriven(milesDriven);
   
   setGallonsOfGas(gallonsOfGas);
   
}


   //accessors
   public String getModel()
   {
	return model;
   }

   public int getMilesDriven()
   {
   return milesDriven;
   }
   
   public double getGallonsOfGas()
   {
   return gallonsOfGas;
   }
   
     
   //mutators (setters)
   public void setModel ( String model )
   {
      this.model = model;
   
   }
   
   //if parameter is >0, assign to instance variable
   //otherwise, do not change the value
   public void setMilesDriven( int milesDriven )
   {
      if ( milesDriven > 0 )
         this.milesDriven = milesDriven;
   }
   
   public void setGallonsOfGas( double gallonsOfGas )
   { 
      if ( gallonsOfGas > 0.0 )
         this.gallonsOfGas = gallonsOfGas;
   }

public double calculateMilesPerGallon( )
{

	if ( gallonsOfGas == 0.0 )
	{
		return 0.0;
	}
	else
	{
		return milesDriven / gallonsOfGas;
	}


  }

   public String toString()
   {
      return "The " + model + " has been driven " + milesDriven
               + " miles and has used " + gallonsOfGas + " gas.";
               
   }

}