import java.io.*;

/**
 * IO test class used to show a "good" file
 * Strings are appropriate length & in a found file.
 * @author arufus
 *
 */

public class GoodString {

	public static void main(String[] args) throws StringTooLongException, FileNotFoundException {
		
		FileProcessor fp = new FileProcessor("GoodString.txt", 20);
		  fp.processFile();

	} //end main

} //end class
