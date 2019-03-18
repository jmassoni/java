// Project 4 Driver
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Driver {

	//*** Main: interpret the file name given as a command line argument ***//
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		SearchEngine se = new SearchEngine();
		System.out.println("Enter a word: ");
		String input = in.next();
		se.scan(input);
		se.output(input);
    } // end main
} // end Driver class