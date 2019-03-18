package oddsAndEnds;

import java.util.Scanner;
/*

class Grader
{
 /*
  public static final int A = 0;
  public static final int B = 1;
  public static final int C = 2;
  public static final int D = 3;
  public static final int F = 4;
 
  
  public static void main( String[] args )
  {
    //int grade = C;
    Grade grade = Grade.C;
    final int x;
    switch( grade )
    {
      case A : System.out.println( "Great job" ); break;
      case B : System.out.println( "Good work" ); break;
      case C : System.out.println( "Not bad" ); break;
      case D : System.out.println( "Gotta do better " ); break;
      case F : System.out.println( "Come in for help" ); break;
    }
    //System.out.println( Grade.A.ordinal() + ", " + Grade.B.ordinal() );
    x = 4;
    //x = 3;
    
  
    System.out.println( Grade.A.ordinal() + ", " + Grade.B.ordinal() );
    for ( Grade g: Grade.values() )
    {
      System.out.println( "Grade of: " + g + ", with ordinal value: " + g.ordinal() );
    }
    
    
    
    for ( Grade g: Grade.values() )
    {
      System.out.println( "Grade of: " + g + ", with ordinal value: " + g.ordinal() );
      System.out.println(" has point value: " + g.getPoints() );
    }
    
    
  }
  
}
*/

enum Grade1
{
	A, B, C, D, F;
}

enum Grade2
{
	A(4.0), B(3.0), C(2.0), D(1.0), F(0.0);

	private final double points;
	// Note the use of the keyword final.

	// Note that the constructor is private - at least not public
	private Grade2(double points)
	{
		this.points = points;
	}

	// There is a method ordinal()

	// and you can declare your own.
	public double getPoints()
	{
		return this.points;
	}

}

public enum Grade
{
	A(4.0, 90.0, 100.1, "Great job!"), B(3.0, 80.0, 90.0, "Doing fine!"), C(2.0, 70.0, 80.0, "Average is okay!"), D(1.0,
			60.0, 70.0, "Oops, needs work!"), F(0.0, 0.0, 60.0, "Yikes!");

	private final double points;
	private final double rangeMin;
	private final double rangeMax;
	private final String message;

	Grade(double points, double rangeMin, double rangeMax, String message)
	{
		this.points = points;
		this.rangeMin = rangeMin;
		this.rangeMax = rangeMax;
		this.message = message;
	}

	public double getPoints()
	{
		return this.points;
	}

	public double getRangeMin()
	{
		return this.rangeMin;
	}

	public double getRangeMax()
	{
		return this.rangeMax;
	}

	public String getMessage()
	{
		return this.message;
	}

	public static void main(String[] args)
	{
		Grade grade = F;
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your score?");
		double score = scan.nextDouble();
		for (Grade g : Grade.values()) // Note
		{
			if (g.getRangeMin() <= score && g.getRangeMax() > score)
				grade = g;
		}
		System.out.println("Your grade is " + grade + ". " + grade.getMessage());
	}
}
