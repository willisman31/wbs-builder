import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * WBS builder logic class.
 * 
 * @author Willis 
 * @version 4.12.2021
 */
public class WBS {

	
	private String name;
	private int totDuration;
	private static final int MAXTASKS = 50;
	private Task[] tasks = new Task[MAXTASKS];
	private int numTasks;
	
	/**
	 * Default constructor.
	 */
	WBS() {
		// TODO
	}

	/**
	 * Parameterized constructor.
	 * 
	 * @param tasks part of wbs.
	 */
	WBS(Task[] tasks) {
		// TODO
		this.tasks = tasks;
		this.name = "Unnamed Work Breakdown Structure";
		for (int i = 0; i < MAXTASKS; i++) {
			
		}
	}

	/**
	 * Copy constructor.
	 * 
	 * @param wbs to be copied.
	 */
	WBS(WBS wbs) {
		// TODO
		
	}

	/**
	 * Tasks getter.
	 * 
	 * @return tasks attribute.
	 */
	Task[] getTasks() {
		return this.tasks;
	}

	/**
	 * Print all tasks in WBS as string.
	 * 
	 * @return list of tasks as String.
	 */
	String printTasks() {
		String temp = "";
		for (int i = 0; i < numTasks; i++) {
			temp += tasks[i].outString() + "\n";
		}
		return temp;
	}
	
	/**
	 * Name getter.
	 * 
	 * @return name of WBS.
	 */
	String getName() {
		return this.name;
	}
	
	/**
	 * Setter for WBS name.
	 * 
	 * @param name is new WBS name.
	 */
	void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter for the number of tasks in the WBS.
	 * 
	 * @return number of used spaces in the tasks array.
	 */
	int getNumTasks() {
		return this.numTasks;
	}
	
	int getDuration() {
		return totDuration;
	}
	
	
	/**
	 * Add task to task list.
	 * 
	 * @param task to add.
	 * @return whether task was successfully added.
	 */
	boolean addTask(Task task) {
		// TODO
		boolean addable = false;
		
		
		return addable;
	}

	
	
	/*** File reading and writing operations ***/
	
	
	/**
	 * Read saved WBS from file.
	 */
	void read() {
		// TODO
		try {
			File file = new File("");
			Scanner scan = new Scanner(file);

			scan.close();
		} catch (FileNotFoundException f) {

		}
	}

	/**
	 * Save WBS to file.
	 */
	void save() {
		// TODO
		try {
			// File file = new File("");
			
		} catch (Exception e) {

		}
	}
	
	/**
	 * Save WBS to specific file.
	 * 
	 * @param fileName file to which WBS will be saved.
	 */
	void save(String fileName) {
		// TODO
	}

	/**
	 * Print WBS using Java's print package.
	 */
	void print() {
		// TODO
	}

}
