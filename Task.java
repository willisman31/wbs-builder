import java.util.Scanner;
import java.io.File;
/**
 * 
 * @author Willis
 * Updated 3/23/2021
 */
public class Task {

	private Status status;
	private String taskName, description;
	private int[] taskNum;
	private String[] dependency;
	private double duration;
	
	/**
	 * Default constructor
	 */
	Task() {
		this.status = Status.OPEN;
		this.taskName = null;
		this.taskNum = null;
		this.dependency = null;
		this.duration = -1;
	}
	
	/**
	 * Parameterized constructor; four arg.
	 * @param taskName
	 * @param taskNum
	 * @param dependency
	 * @param duration
	 */
	Task(String taskName, int[] taskNum, String[] dependency, double duration) {
		this.status = Status.OPEN;
		this.taskName = taskName;
		this.taskNum = taskNum;
		this.dependency = dependency;
		this.duration = duration;
		this.description = "";
	}
	
	/**
	 * Parameterized constructor; five arg.
	 * @param taskName
	 * @param taskNum
	 * @param dependency
	 * @param duration
	 * @param description
	 */
	Task(String taskName, int[] taskNum, String[] dependency, double duration, String description) {
		this(taskName, taskNum, dependency, duration);
		this.description = description;
	}
	
	/**
	 * @param task to be copied.
	 */
	Task(Task task) {
		// TODO
		this.taskName = task.getTaskName();
		// this.taskNum = task.getTaskNum();
		
	}
	
	/**
	 * TaskName getter.
	 * @return taskName.
	 */
	String getTaskName() {
		return this.taskName;
	}
	
	/**
	 * Duration getter.
	 * @return duration in days.
	 */
	double getDuration() {
		return this.duration;
	}
	
	/**
	 * TaskNum getter
	 * @return taskNum as String.
	 */
	String getTaskNum() {
		String temp = "";
		for (int i = 0; i < taskNum.length; i++) {
			temp += taskNum[i];
			if (i != taskNum.length - 1) temp += ".";
		}
		return temp;
	}
	
	/**
	 * Status getter.
	 * @return status String.
	 */
	String getStatus() {
		return this.status.toString();
	}
	
	/**
	 * Dependency getter.
	 * @return dependencies as a String.
	 */
	String getDependency() {
		String temp = "";
		for (int i = 0; i < this.dependency.length; i++) {
			temp += dependency[i];
			if (i != dependency.length - 1) temp += ", ";
		}
		return temp;
	}
	
	/**
	 * Description getter.
	 * @return task description.
	 */
	String getDescription() {
		return this.description;
	}
	
	/**
	 * Overridden toString.
	 */
	String outString() {
		//TODO
		String temp = this.taskName;
		temp += " " ;
		return null;
	}
	
	
}
