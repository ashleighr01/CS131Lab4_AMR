import java.io.*;

/**
 * IO test class for bad file names
 * @author arufus
 *
 */

public class BadFileName {

	public static void main(String[] args) throws FileNotFoundException, StringTooLongException {
		
		FileProcessor fp = new FileProcessor("String1.txt",10);
		fp.processFile();

	} //end main

} //end class
