package oddsAndEnds;

public class OddsAndEnds
{
	// private static int p;
	public static void main(String[] args)
	{
		// //1. Some String operations

		// String z = "Dil bert!";
		//
		// System.out.println(z.length()); // note inconsistency - array,
		// ArrayList
		// if (z.startsWith("Dil"))
		// System.out.println("Starts with works.");
		// if (z.startsWith("D"))
		// System.out.println("Starts with works.");
		// if (z.startsWith("Dil bert!"))
		// System.out.println("Starts with works.");
		// if (z.startsWith(""))
		// System.out.println("Starts with empty string.");
		//
		// if (z.endsWith("Dil bert!"))
		// System.out.println("Ends with works.");
		// if (z.endsWith(""))
		// System.out.println("Ends with works.");
		//
		// if (z.contains("bert"))
		// System.out.println("Contains works.");
		// System.out.println(z.indexOf("l b"));
		// System.out.println(z.indexOf("Fred"));
		// System.out.println(z.indexOf("D"));
		//
		// z = "zoology";
		// String s = z.replace('o', 'a');
		// System.out.println(z + " " + s);
		// System.out.println(z.substring(3));
		// System.out.println(z.substring(3, 5));
		// for (int i = 0; i < s.length(); i++)
		// System.out.println(s.charAt(i));
		//
		// String s2 = "dog";
		// z = s2;
		// String t = "dog".substring(0);
		// String y = new String("dog");
		// String u = "do" + "g";
		// String x = "a dog".substring(2);
		// System.out.println("s2 == z " + (s2 == z));
		// System.out.println("s2 == t " + (s2 == t));
		// System.out.println("t == z " + (t == z));
		// System.out.println("t == y " + (t == y));
		// System.out.println("t == u " + (t == u));
		// System.out.println("t == x " + (t == x));
		//
		// // //Strings are immutable - what does that mean for a toString
		// String s = "";
		// for (int i = 0; i < 12; i++)
		// s += "Now i is: " + i + "! \n";
		// System.out.println(s);
		//
		// // Note StringBuffer
		// StringBuffer b = new StringBuffer();
		// for (int i = 0; i < 12; i++)
		// b.append("Now i is: " + i + "! \n");
		// System.out.println(b);
		//
		// String[] st = "Happy new Year!".split(" ");
		// for (String part : st)
		// System.out.println(part);
		// String today = "10/5/2007";
		// st = today.split("/");
		// for (String element : st)
		// System.out.println(element);
		// st = "name1\tname2".split("\t");
		// for (String fred : st)
		// System.out.println(fred);
		// st = "zoology".split("o");
		// for (String split : st)
		// System.out.println(split);
		//
		// String y = "dog";
		// String z = new String("dog");
		// System.out.println(y.equals(z));
		// Student stud1 = new Student("Fred", "123", Major.CS);
		// Student stud2 = new Student("Fred", "123", Major.CS);
		// System.out.println("stud1 == stud2 " + (stud1 == stud2));
		// System.out.println("stud1 equals stud2 " + stud1.equals(stud2));
		//
		// // Exceptions and exception handling.
		// Terminal window:
		// javac OddsAndEnds.java
		// java -verbose OddsAndEnds

		// Command line arguments

		// for (int i = 0; i < args.length; i++)
		// System.out.println(args[i]);
		//
		// Person[] people = new Person[6];
		// for (int i = 0; i < people.length; i++)
		// {
		// switch (i)
		// {
		// case 0:
		// case 2:
		// people[i] = new Person("Person" + i);
		// break;
		// case 1:
		// case 5:
		// people[i] = new Student(("Stud" + i), "123", Major.CS);
		// break;
		// case 3:
		// case 4:
		// people[i] = new Professor("Prof" + i);
		// break;
		// }
		// }
		// //
		// for (Person p : people)
		// System.out.println(p);
		//
		// //How can I loop through and do different things w/different people?
		//
		// for (int i = 0; i < people.length; i++)
		// {
		// // use the Class class and its getName() method!
		// //System.out.println(i + "; " + people[i].getClass().getName());
		// if (people[i].getClass().getName().equals("Professor"))
		// System.out.println("Got a prof " + people[i].getName());
		//
		// // and instanceof
		// else if (people[i] instanceof Student)
		// System.out.println("Got a student " + people[i].getName());
		// }
		//
		// //formatted output (C)
		//
		// String product = "This year's toy";
		// double price = 57.45;
		// double reducedPrice = 2 * price / 3;
		// System.out.println("Original price of " + product + " was : $" + price
		// + " new price is $" + reducedPrice);
		// System.out.printf("Original price of %s was : $%.2f new price is
		// $%.2f\n", product, price, reducedPrice);
		//
		// Student stud3 = new Student("Fred", "123", Major.CS);
		// checkThisOut(stud3, 5, 7, 12, 2);
		// checkThisOut(stud3);
		// checkThisOut(stud3, 1, 5, -3, 15, 82);
	}

	// public static void checkThisOut(Student student, int... someInts)
	// {
	// System.out.println("Got student " + student + "; also got ints: ");
	// for (int i = 0; i < someInts.length - 1; i++)
	// System.out.print(someInts[i] + ", ");
	// if (someInts.length > 0)
	// System.out.println(someInts[someInts.length - 1]);
	// }

}

enum Major
{
	BIO, CS, CHEM, MATH;
}

class Person
{
	private String name;

	public Person(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	@Override
	public String toString()
	{
		return getName();
	}
}

class Student extends Person
{
	private Major major;
	private Course course;

	public Student(String name, String ss, Major major)
	{
		super(name);
		this.major = major;
	}

	@Override
	public String toString()
	{
		return super.toString() + ", " + this.major;
	}

	public void method2() throws NullPointerException
	{
		this.course.method3();
	}
}

class Professor extends Person
{
	Student advisee = new Student("George", "00", Major.CS);

	public Professor(String name)
	{
		super(name);
	}

	public void method1()
	{
		this.advisee.method2();
	}
}

class Course
{
	public void method3()
	{
	}
}
