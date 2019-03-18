/** State class */

public class State
{
  /**** 1. define the instance variables, stateName and capital */
  private String stateName;
  private String capital;
  
  
  /**** 2. complete the constructor. It accepts the state name and capital */
  public State( String newStateName, String newCapital )
  {
      stateName = newStateName;
      capital = newCapital;
  }
  
  /** 3. write the accessors for the state name and capital */
  
  public String getStateName()
  {
	   return stateName;
  }
  
  public String getCapital()
  {
      return capital;
  }
  
  /***** 4. write toString. It returns "The capital of ... is ..." */
  
  public String toString()
  {
     return "The capital of " + stateName + " is " + capital;
               
  }
  
}