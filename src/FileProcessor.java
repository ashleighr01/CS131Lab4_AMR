import java.util.*;
import java.io.*;

/**
 * Class created to process files, set up try-catch clauses
 * @author arufus
 *
 */

public class FileProcessor {

	private String fileName;
	private int stringLength;
	private ArrayList <String> stringList;
	private Scanner input;
	
	public FileProcessor(String fileName, int stringLength) {
		this.fileName = fileName;
		setStringLength(stringLength);

	}//end empty-argument constructor
	
	public String getFileName() {
		return fileName;
	} //end getFileName

	public void setFileName(String fileName) {
		this.fileName = fileName;
	} //end setFileName

	public int getStringLength() {
		return stringLength;
	} //end getStringLength

	public void setStringLength(int stringLength) {
		
		if (stringLength < 5) {
			stringLength = 5;
		} else {
			this.stringLength = stringLength;	
		}
		
	} //end setStringLength

	public int getArrayListSize() {
		return stringList.size();
		
	}//end getArrayListSize
	
	/**
	 * Method to process file. Used to check string length
	 * and file existence
	 * @throws StringTooLongException
	 * @throws FileNotFoundException
	 */
	
	public void processFile() throws StringTooLongException, FileNotFoundException {

		System.out.println(fileName);
		input = new Scanner (new File(fileName));
		String line = input.nextLine();
		
		while (input.hasNextLine()) {
			if (line.length() > stringLength) {			
				throw new StringTooLongException();	
			} 
			line = input.nextLine();
		
	
		
		
		
		
			try {
			
				getStringLength();
				int length = line.length();
				if (length > stringLength) {
					throw new StringTooLongException();
				} 
				
				
		

				getFileName();
				if (fileName == (null)) {
					throw new FileNotFoundException();
				}
		
			
			
			} //end try block
			
			catch (StringTooLongException e){
				System.out.println(e.toString());
			} //end StringTooLongException catch block
			
			catch (FileNotFoundException e) {
				System.out.println(fileName + ": " + e.toString());
			} //end FileNotFoundException catch block
		
		} //end while loop
		
	}//end processFile
	
} //end class
