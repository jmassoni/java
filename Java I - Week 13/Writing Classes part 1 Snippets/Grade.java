/** Grade class
*   intended for converting numeric grades to letter grades
*   Joey Massoni
*/

public class Grade
{
  /*****1. define one instance variable: a grade (int) */
  
  private int grade;
  
  /***** 2. Write the default constructor, 
  *    which sets grade to 0  */
  
  public Grade( )
  {
      grade = 0;
      
  }

  
    
  /***** 3. Write the overloaded constructor
  *    which accepts a parameter for the grade */
  
public Grade( int startGrade )
{
   setGrade( startGrade );   
}

 

  /***** 4. write the accessor method for grade */
 
 
 public int getGrade( )
 {
   return grade;
   
 }
   
 
  /****** 5. Write the  mutator method: grade must be between 0 and 100;
    * if not, set grade to 0
  */
  
  public void setGrade( int changeGrade )
  {
      if ( changeGrade >= 0 && changeGrade <= 100 )
      {
           grade = changeGrade;
      }
      else
      {
         grade = 0;
      }
      
  }
  
  /******** 6. write the letterGrade method. It returns the letter grade
    * equivalent to the numeric value of grade. 
  */
   public char letterGrade()
   {
      if (grade >= 90 )
         return 'A';
      else if ( grade >= 80 )
         return 'B';
      else if ( grade >= 70 )
         return 'C';
      else
         return 'F';
   } 
 
 public String toString()
 {
   return grade + ": " + letterGrade();
 }
 
 
} // end class