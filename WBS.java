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
	private static Task[] tasks = new Task[MAXTASKS];
	private static int numTasks;
	
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
	WBS(Task[] task) {
		// TODO
		tasks = task;
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
		return tasks;
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
		return numTasks;
	}
	
	/**
	 * Duration getter.
	 * 
	 * @return sum of duration of each task in list.
	 */
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
		boolean addable = addable();
		boolean goodTask = task.goodTask();
		boolean unique = findTask(task) != -1;
		tasks[numTasks] = task;
		numTasks++;
		return addable && goodTask && unique;
	}

	/**
	 * Can another task be added to the wbs list?
	 * 
	 * @return whether task can be added to wbs.
	 */
	static boolean addable() {
		return numTasks < MAXTASKS;
	}
	
	/**
	 * Find index of specified task in tasks array.
	 * 
	 * @param task to find.
	 * @return index of task in tasks array.
	 */
	static int findTask(Task task) {
		int num = -1;
		for (int i = 0; i < numTasks; i++) {
			if (task.equals(tasks[i])) {
				num = i; 
				break;
			}
		}
		return num;
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
