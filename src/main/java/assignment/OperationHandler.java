package assignment;

import java.io.FileWriter;

public class OperationHandler {
	
	private static final String filePath = "C:\\Users\\zubair\\Desktop\\Digital14\\Data.txt";
	
	//This method converts the input string to lower case letters
	public String lowerCase(String data, int option) {
		data = data.toLowerCase();
		if(option != 11 & option != 12)
		writeDatatoFile(filePath, data);
		return data;
	}

	//This method converts the input string to upper case letters
	public String upperCase(String data, int option) {
		data = data.toUpperCase();
		if(option != 13)
		writeDatatoFile(filePath, data);
		return data;
	}

	//This method replaces the word stupid (only in lower case) to s*****
	public String stupidRemover(String data, int option) {
		if (data.toLowerCase().contains("stupid")) {
			data = data.replaceAll("stupid", "s*****");
		}

		if (option != 14)
			writeDatatoFile(filePath, data);
		return data;
		
	}

	//This method removes consecutive duplicated words from string
	public String duplicateRemover(String data, int option) {
		data = data.replaceAll("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+", "$1");
		if (option != 10)
			writeDatatoFile(filePath, data);
		return data;
	}
	
	public void writeDatatoFile(String filePath, String data) {
		
		try{    
	           FileWriter fw = new FileWriter(filePath, true);    
	           fw.write(data);  
	           fw.flush();
	           fw.close();    
	          }catch(Exception e){
	        	  System.out.println("Exception occurred while writing data into the file!!!");
	        }    
//	          System.out.println("Data Written to file successfully...");    
		
	}
	
	public void processRequest(String data, int option) {
		
		String updatedUserInput = "";
		
		switch (option) {
        case 1:
        	System.out.println(lowerCase(data, option));
        	break;
        case 2:
        	System.out.println(upperCase(data, option));
        	break;
        case 3:
        	System.out.println(stupidRemover(data, option));
        	break;
        case 4:
        	System.out.println(duplicateRemover(data, option));
        	break;
        case 10:
        	updatedUserInput = duplicateRemover(data, option);
        	System.out.println(stupidRemover(updatedUserInput, option));
        	break;

        case 11:
        	updatedUserInput = lowerCase(data, option);
        	System.out.println(stupidRemover(updatedUserInput, option));
        	break;

        case 12:
        	updatedUserInput = lowerCase(data, option);
        	System.out.println(duplicateRemover(updatedUserInput, option));
        	break;

        case 13:
        	updatedUserInput = upperCase(data, option);
        	System.out.println(duplicateRemover(updatedUserInput, option));
        	break;

        case 14:
        	updatedUserInput = stupidRemover(data, option);
        	System.out.println(upperCase(updatedUserInput, option));
        	break;

        	default:
        		System.exit(0);

		}

	}

}
