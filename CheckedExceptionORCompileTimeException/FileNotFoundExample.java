package CheckedExceptionORCompileTimeException;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class FileNotFoundExample {
	
	public static void main(String[] args) throws IOException {
	    try {
	      File myObj = new File("output.txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	    	  throw new FileNotFoundException("File already exists.");
	      }
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred."+e.getMessage());
	      e.printStackTrace();
	    }
	  }
}
