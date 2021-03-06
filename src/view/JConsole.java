package view;

/**
 * 
 * @author Ashley Maxine Stirling
 *
 */
public class JConsole {
	
	
	public JConsole() {

	}
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	public static void PrintlnString(final String colour, String arg) {
		JConsole.PrintString(colour, arg);
		System.out.println();
	}
	
	public static void PrintString(final String colour, String arg) {
		System.out.print(colour + arg + JConsole.ANSI_RESET);
	}
	
}
