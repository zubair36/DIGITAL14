package assignment;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		/*Run the command as follows to run this application from command line
		 1) go to below Main.java class path using cd command and compile using javac *.java command
		 2) go one step back using cd.. command
		 2) Run the following command to run the application    "java assignment.Main 2 i want to test uppercase feature"
		 
		 Please select 1 to check lowercase functionality 
		Please select 2 to check uppercase functionality 
		Please select 3 to check Remove Stupid functionality 
		Please select 4 to check Remove Duplicate functionality
		Please select 10 to check Remove Duplicate +  Remove Stupid functionality together 
		Please select 11 to check Remove Stupid +  lowercase functionality together 
		Please select 12 to check Duplicate +  lowercase functionality together
		Please select 13 to check Duplicate +  uppercase functionality together 
		Please select 14 to check Remove Stupid +  uppercase functionality together);*/

		if (args == null || args.length < 2) {
			throw new Exception(
					        "**********Invalid arguments provided**********\n Please provide the run command as follows to run application i.e.\n"
							+ " java assignment.Main 2 i want to test UPPERCASE feature");
		}
		
		String userInput = "";
		int option = Integer.parseInt(args[0]);

		if (args[0].equals("1") || args[0].equals("2") || args[0].equals("3") || args[0].equals("4")
				|| args[0].equals("10") || args[0].equals("11") || args[0].equals("12") || args[0].equals("13")
				|| args[0].equals("14")) {

			for (int i = 1; i < args.length; i++) {
				userInput = userInput + args[i] + " ";
			}

			OperationHandler operationHandler = new OperationHandler();
			operationHandler.processRequest(userInput, option);

		} else {
			throw new Exception("**********Invalid option selected**********\n" +
					"Please select 1 to check lowercase functionality\n" + 
					"Please select 2 to check uppercase functionality\n" + 
					"Please select 3 to check Remove Stupid functionality\n" + 
					"Please select 4 to check Remove Duplicate functionality\n" + 
					"Please select 10 to check Remove Duplicate +  Remove Stupid functionality together\n" + 
					"Please select 11 to check Remove Stupid +  lowercase functionality together\n" + 
					"Please select 12 to check Duplicate +  lowercase functionality together\n" + 
					"Please select 13 to check Duplicate +  uppercase functionality together\n" + 
					"Please select 14 to check Remove Stupid +  uppercase functionality together\n");

		}

	}

}
