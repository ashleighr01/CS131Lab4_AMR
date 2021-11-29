import java.io.*;

/**
 * IO test class for bad strings (longer than string lengths)
 * @author arufus
 *
 */

public class BadString {

	public static void main(String[] args) throws FileNotFoundException, StringTooLongException {
		

    	FileProcessor fp = new FileProcessor("BadString.txt",10);
		  fp.processFile();

	} //end main

} //end class
