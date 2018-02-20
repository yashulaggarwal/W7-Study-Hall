package userInterfaceTestbed;


public class ErrorTermRecognizer {
	/**
	 * <p> Title: FSM-translated ErrorTermRecognizer. </p>
	 * 
	 * <p> Description: A demonstration of the mechanical translation of Finite State Machine 
	 * diagram into an executable Java program using the Error Term Recognizer. The code detailed
	 * design is based on a while loop with a select list</p>
	 * 
	 * <p> Copyright: Lynn Robert Carter © 2018 </p>
	 * 
	 * @author Lynn Robert Carter
	 * 
	 * @version 0.00	2018-01-28	Initial baseline 
	 * 
	 */
	
	/**********************************************************************************************
	 * 
	 * Result attributes to be used for GUI applications where the returned string error message
	 * and pointer to the character of the error are not adequate for the required output.
	 * 
	 */
	
	public static String errorTermErrorMessage = "Error Term recognition has not been implements";
	public static String errorTermInput = "";			// The input being processed
	public static int errorTermIndexofError = -1;		// The index where the error was located
	public static String measuredValueErrorMessage = "";	// The alternate error message text
	public static String measuredValueInput = "";		// The input being processed
	public static int measuredValueIndexofError = -1;		// The index where the error was located
	private static int state = 0;						// The current state value
	private static int nextState = 0;					// The next state value
	private static boolean finalState = false;			// Is this state a final state
	private static String inputLine = "";				// The input line
	private static char currentChar;						// The current character in the line
	private static int currentCharNdx;					// The index of the current character
	private static boolean running;						// The flag that specifies if it is running	
	/**********
	 * This method is a mechanical transformation of a Finite State Machine diagram into a Java
	 * method.
	 * This private method display the input line and then on a line under it displays an up arrow
	 * at the point where an error was detected.  This method is designed to be used to display the
	 * error message on the console terminal.
	 * 
	 * @param input		The input string for the Finite State Machine
     * @param currentCharNdx		The location where an error was found	
	 * @return			An output string that is empty if every things is okay or it will be
	 * 						a string with a help description of the error follow by two lines
	 * 						that shows the input line follow by a line with an up arrow at the
	 *						point where the error was found.
	 */
	
	public static String checkErrorTerm(String input) {
		// This is a sub for an Error Term recognizer
		return errorTermErrorMessage;
	}
	
}
