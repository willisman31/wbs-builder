/**
 * Exception for invalid tasks.
 * 
 * @author Willis
 * @version 4.12.2021
 */
public class InvalidTaskException extends Exception{

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	InvalidTaskException() {
		System.out.println("Invalid task");
	}
	
	/**
	 * Parameterized constructor; 1-arg constructor.
	 * 
	 * @param message printed message about exception.
	 */
	InvalidTaskException(String message) {
		System.out.println(message);
	}
	
}
