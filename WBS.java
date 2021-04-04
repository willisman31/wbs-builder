import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * WBS builder logic class.
 * @author Willis
 * Updated 3/23/2021
 */
public class WBS {

	private Task[] tasks;
	
	/**
	 * Default constructor.
	 */
	WBS() {}
	
	/**
	 * Parameterized constructor.
	 * @param tasks part of wbs.
	 */
	WBS(Task[] tasks) {
		
	}
	
	/**
	 * Copy constructor.
	 * @param wbs to be copied.
	 */
	WBS(WBS wbs) {
		// TODO
	}
	
	/**
	 * Tasks getter.
	 * @return tasks attribute.
	 */
	Task[] getTasks() {
		return this.tasks;
	}
	
	/** 
	 * Read saved WBS from file.
	 */
	void read() {
		// TODO
		try {
			File file = new File("");
			Scanner scan = new Scanner(file);
			
			scan.close();
		} catch (FileNotFoundException f){
			
		}
	}
	
	/**
	 * Save WBS to file.
	 */
	void save() {
		// TODO
		try {
			File file = new File("");
			
		} catch (Exception e) {
			
		}
	}
	
	/**
	 * Print WBS using Java's print package.
	 */
	void print() {
		// TODO
	}
	
}
